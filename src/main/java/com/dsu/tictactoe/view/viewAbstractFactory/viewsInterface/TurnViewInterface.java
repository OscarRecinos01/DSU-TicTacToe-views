package com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface;

import com.dsu.tictactoe.model.board.Mark;
import com.dsu.tictactoe.model.board.PutMarkError;

public interface TurnViewInterface {
    public void playerTurn(Mark turnMark, PutMarkError putMarkError, String playerName);
}
