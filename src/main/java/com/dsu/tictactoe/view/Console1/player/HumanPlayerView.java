package com.dsu.tictactoe.view.Console1.player;

import com.dsu.tictactoe.model.board.Coordinate;
import com.dsu.tictactoe.model.board.PutMarkError;
import com.dsu.tictactoe.utils.Console;

public class HumanPlayerView extends PlayerViewConsole1 {

    @Override
    public String getName( String message) {
        return Console.readString(message);
    }

    @Override
    public Coordinate getCoordinate(PutMarkError putMarkError) {
        return new Coordinate(Console.readInt("Input coordinate x:"), Console.readInt("Input coordinate y:"));
    }
    
}