package com.dsu.tictactoe.view.viewAbstractFactory.abstractFactory;

import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.Console1.BoardViewConsole1;
import com.dsu.tictactoe.view.Console1.TicTacToeViewConsole1;
import com.dsu.tictactoe.view.Console1.TurnViewConsole1;
import com.dsu.tictactoe.view.Console1.player.PlayerManagerViewConsole1;
import com.dsu.tictactoe.view.Console1.player.PlayerViewFactory;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.BoardViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.TicTacToeViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.TurnViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface.PlayerManagerViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface.PlayerViewInterface;

public class Console1Factory implements ViewsFactory{

    @Override
    public TurnViewInterface createTurnView() {
        return new TurnViewConsole1();
    }

    @Override
    public TicTacToeViewInterface createTicTacToeView() {
        return new TicTacToeViewConsole1();
    }

    @Override
    public BoardViewInterface createBoardView() {
        return new BoardViewConsole1();
    }

    @Override
    public PlayerViewInterface createPlayerView(PlayerType type) {
        return PlayerViewFactory.getPlayerView(type);
    }

    @Override
    public PlayerManagerViewInterface createPlayerManagerView() {
        return new PlayerManagerViewConsole1();
    }
    
}
