package com.dsu.tictactoe.view.Console2;

import com.dsu.tictactoe.model.board.Mark;
import com.dsu.tictactoe.utils.Console;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.BoardViewInterface;

public class BoardViewConsole2 implements BoardViewInterface{

    @Override
    public void showBoard(Mark[][] matrixMarks) {
        String firstSpace = "    ";
        String header =  "y/x "+"0|1|2";
        String rowDiv = firstSpace+"-----";
        String[] rows = new String[matrixMarks.length];
        for (int i = 0; i < matrixMarks.length; i++) {
            rows[i]=i+firstSpace.substring(0,firstSpace.length()-1);
            for (int j = 0; j < matrixMarks.length; j++) {
                rows[i]+=matrixMarks[j][i].toString();
                if (j < (matrixMarks.length-1)){
                    rows[i]+="|";
                }
            }
        }
        Console.printWhiteLine();
        Console.printLine(header);
        for (int i = 0; i < rows.length; i++) {
            Console.printLine(rows[i]);
            if (i<(rows.length-1)){
                Console.printLine(rowDiv);
            }
        }
        Console.printWhiteLine();
    }
}
