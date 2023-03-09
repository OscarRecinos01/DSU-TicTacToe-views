package com.dsu.tictactoe.view.Console1.player;

import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface.PlayerViewInterface;

public class PlayerViewFactory {

    public static PlayerViewInterface getPlayerView(PlayerType playerType){
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
