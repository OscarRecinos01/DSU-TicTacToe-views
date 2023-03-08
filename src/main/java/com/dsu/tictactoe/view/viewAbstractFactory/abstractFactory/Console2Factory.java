package com.dsu.tictactoe.view.viewAbstractFactory.abstractFactory;

import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.Console2.BoardViewConsole2;
import com.dsu.tictactoe.view.Console2.TicTacToeViewConsole2;
import com.dsu.tictactoe.view.Console2.TurnViewConsole2;
import com.dsu.tictactoe.view.Console2.player.PlayerManagerViewConsole2;
import com.dsu.tictactoe.view.Console2.player.PlayerViewFactory;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.BoardViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.TicTacToeViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.TurnViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface.PlayerManagerViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface.PlayerViewInterface;

public class Console2Factory implements ViewsFactory{

    @Override
    public TurnViewInterface createTurnView() {
        return new TurnViewConsole2();
    }

    @Override
    public TicTacToeViewInterface createTicTacToeView() {
        return new TicTacToeViewConsole2();
    }

    @Override
    public BoardViewInterface createBoardView() {
        return new BoardViewConsole2();
    }

    @Override
    public PlayerViewInterface createPlayerView(PlayerType type) {
        return PlayerViewFactory.getPlayerView(type);
    }

    @Override
    public PlayerManagerViewInterface createPlayerManagerView() {
        return new PlayerManagerViewConsole2();
    }
    
}
