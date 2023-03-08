package com.dsu.tictactoe.controller.player;

import com.dsu.tictactoe.model.board.Coordinate;
import com.dsu.tictactoe.model.board.Mark;
import com.dsu.tictactoe.model.board.PutMarkError;
import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.view.Console1.player.HumanPlayerView;
import com.dsu.tictactoe.view.Console1.player.PlayerViewConsole1;

public class HumanPlayerController extends PlayerController {

    @Override
    public Coordinate getPutCoordinate(Mark[][] markMatrix, Mark playerMark, PutMarkError putMarkError) {
        return playerView.getCoordinate(putMarkError);
    }

    @Override
    public PlayerViewConsole1 initPlayerView() {
        return new HumanPlayerView();
    }

    @Override
    protected PlayerType initPlayerType() {
        return PlayerType.HUMAN;
    }
    
}
