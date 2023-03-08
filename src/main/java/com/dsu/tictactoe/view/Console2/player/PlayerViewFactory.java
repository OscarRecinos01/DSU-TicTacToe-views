package com.dsu.tictactoe.view.Console2.player;

import com.dsu.tictactoe.model.player.PlayerType;

public class PlayerViewFactory {

    public static PlayerViewConsole2 getPlayerView(PlayerType playerType){
        assert(playerType != null);
        switch (playerType) {
            case HUMAN:
                return new HumanPlayerView();
            case COMPUTER:
                return new ComputerPlayerView();
        }
        return null;
    }
}
