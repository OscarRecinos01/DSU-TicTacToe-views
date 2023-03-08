package com.dsu.tictactoe.view.Console1.player;

import com.dsu.tictactoe.model.player.PlayerType;

public class PlayerViewFactory {

    public static PlayerViewConsole1 getPlayerView(PlayerType playerType){
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
