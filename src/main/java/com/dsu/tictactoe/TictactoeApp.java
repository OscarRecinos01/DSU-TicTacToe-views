package com.dsu.tictactoe;

import com.dsu.tictactoe.controller.TictacToeController;
import com.dsu.tictactoe.model.Tictactoe;

public class TictactoeApp {
    private Tictactoe tictactoe;
    private TictacToeController tictacToeController;
    
    public TictactoeApp(int view){
        tictactoe = new Tictactoe();
        tictacToeController = new TictacToeController(tictactoe, view);
    }

    public void runGame(){
        tictacToeController.mainMenu();
    }
}
