package com.dsu.tictactoe.controller;

import com.dsu.tictactoe.controller.player.PlayerController;
import com.dsu.tictactoe.controller.player.PlayerManagerController;
import com.dsu.tictactoe.model.Tictactoe;
import com.dsu.tictactoe.model.Turn;
import com.dsu.tictactoe.model.board.Board;
import com.dsu.tictactoe.model.board.Mark;
import com.dsu.tictactoe.model.player.Player;
import com.dsu.tictactoe.view.Console1.TicTacToeViewConsole1;
import com.dsu.tictactoe.view.viewAbstractFactory.abstractFactory.AbstractFactorySingleton;

public class TictacToeController {
    private Tictactoe tictactoe;
    private TicTacToeViewConsole1 ticTacToeView;
    private PlayerManagerController playerManagerController;
    private BoardController boardController;
    private TurnController turnController;

    public TictacToeController(Tictactoe tictactoe,int view) {
        this.tictactoe = tictactoe;
        AbstractFactorySingleton.setView(view);
        this.ticTacToeView = (TicTacToeViewConsole1) AbstractFactorySingleton.getInstance().createTicTacToeView();
        boardController = new BoardController();
        turnController = new TurnController();
        playerManagerController = new PlayerManagerController(this.tictactoe.getPlayers());        
    }

    public void mainMenu(){
        int optionSelected = 0;
        do {
            optionSelected = ticTacToeView.mainMenu();
            switch (optionSelected) {
                case 1:
                    playerManagerController.showAllPlayers();
                    break;
                case 2:
                    playerManagerController.createPlayer();
                    break;
                case 3:
                    setupGame();
                    initGame();
                    statistics();
                    clearGame();
                    break;
            }
        } while (optionSelected!=0);

    }

    public void setupGame() {
        ticTacToeView.showInstruccions();
        PlayerController[] playersController = playerManagerController.getNewGamePlayers();
        Player[] players = new Player[]{playersController[0].getPlayer(),playersController[1].getPlayer()};
        Board newBoard = new Board();
        boardController.setBoard(newBoard);
        Turn newTurn = new Turn(players, newBoard);
        turnController.setTurn(newTurn, Mark.X);
        turnController.setPlayerController(playersController);
        turnController.setBoardController(boardController);
    }

    public void initGame() {
        turnController.initGame();
    }

    public void clearGame(){
        PlayerController[] playersController = turnController.getPlayersController();
        for (PlayerController playerController : playersController) {
            playerController.setMark(Mark.EMPTY);
        }
    }

    public void statistics() {
        ticTacToeView.showStatistics(turnController.getResult());
    }

}
