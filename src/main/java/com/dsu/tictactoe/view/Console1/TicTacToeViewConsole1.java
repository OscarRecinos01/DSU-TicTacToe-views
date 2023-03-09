package com.dsu.tictactoe.view.Console1;

import com.dsu.tictactoe.model.Result;
import com.dsu.tictactoe.utils.Console;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.TicTacToeViewInterface;

public class TicTacToeViewConsole1 implements  TicTacToeViewInterface{

    @Override
    public void showInstruccions() {
        Console.printTitle("TicTacToe");
        String whatIs = "Equis y ceros es un juego de consola";
        Console.printLine(whatIs);

        Console.printTitle("Como juego Equis y ceros?");
        String instructions = "Crea los jugadores e usa las coordenadas para poner tus marcas.";
        Console.printLine(instructions);
        
    }

    @Override
    public void showStatistics(Result result) {
        Console.printTitle("Estadisticas");
        if (result.isATie()){
            Console.printTitle("Empate");
            Console.printLine(result.getPlayers()[0].toString());
            Console.printLine(result.getPlayers()[1].toString());
            return;
        }

        Console.printTitle("Ganador: "+result.getWinner().toString());
        Console.printLine("Perdedor: "+result.getLoser());
        Console.readString("Presiona enter para continuar");
    }

    @Override
    public int mainMenu() {
        int optionSelected = 0;
        do {
            Console.printTitle("Menu principal");
            Console.printLine("1) Lista de jugadores");
            Console.printLine("2) Crear jugador.");
            Console.printLine("3) Iniciar Juego.");
            Console.printLine("0) Salir.");
            Console.printWhiteLine();
            optionSelected = Console.readInt("Ingresa tu opcion:");
            if (!(optionSelected>=0 && optionSelected<4)){
                Console.printLine("Error eleccion invalida");
            }
            else{
                return optionSelected;
            }
        } while (true);
    }
}
