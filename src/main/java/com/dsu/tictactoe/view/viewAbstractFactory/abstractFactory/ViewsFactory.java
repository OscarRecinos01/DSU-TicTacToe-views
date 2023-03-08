package com.dsu.tictactoe.view.viewAbstractFactory.abstractFactory;

import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.BoardViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.TicTacToeViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.TurnViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface.PlayerManagerViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface.PlayerViewInterface;

public interface ViewsFactory {
    public TurnViewInterface createTurnView();
    public TicTacToeViewInterface createTicTacToeView();
    public BoardViewInterface createBoardView();
    public PlayerViewInterface createPlayerView(PlayerType type);
    public PlayerManagerViewInterface createPlayerManagerView();

}
