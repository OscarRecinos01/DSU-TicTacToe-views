package com.dsu.tictactoe.view.Console1.player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.dsu.tictactoe.model.player.Player;
import com.dsu.tictactoe.model.player.PlayerError;
import com.dsu.tictactoe.model.player.PlayerType;
import com.dsu.tictactoe.utils.Console;
import com.dsu.tictactoe.view.viewAbstractFactory.abstractFactory.AbstractFactorySingleton;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface.PlayerManagerViewInterface;
import com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface.PlayerViewInterface;

public class PlayerManagerViewConsole1 implements PlayerManagerViewInterface{

    
    @Override
    public Player getNewPlayer(PlayerError playerError, Player newPlayer, PlayerType[] playerTypevalues) {
        if (PlayerError.NO_ERROR != playerError) {
            Console.printLine("Error: " + playerError.getDescription());
            if (newPlayer != null) {
                Console.printLine("     " + newPlayer.toString());
                Console.printLine("Crear otro jugador.\n");
            }
        }
        PlayerType playerType;
        Console.printTitle("Nuevo jugador");

        do {
            Console.printWhiteLine();
            Console.printLine("Selecciona su tipo: ");
            for (int i = 0; i < playerTypevalues.length; i++) {
                Console.printLine(i + ") " + playerTypevalues[i].name().toLowerCase());
            }
            playerType = PlayerType.getPlayerType(Console.readInt("Selecciona su tipo: "));
        } while (playerType == null);
        PlayerViewInterface newPlayerView = AbstractFactorySingleton.getInstance().createPlayerView(playerType);
        String name = newPlayerView.getName("Nombre del jugador nuevo: ");

        Player player = new Player(name);
        player.setPlayerType(playerType);
        return player;
    }

    @Override
    public List<Player> getNewGamePlayers(List<Player> allPlayers, int numbePlayers) {
        ArrayList<Player> allNewGamePlayers = getArrayListPlayers(allPlayers);
        List<Player> selectedPlayers = new LinkedList<>();
        int numberSelected = 0;
        do {
            Console.printTitle("Selecciona el " + (selectedPlayers.size() + 1));
            printAllPlayers(allNewGamePlayers);
            numberSelected = Console.readInt("Seleccina el jugaro qeu quieres usar?");
            if (numberSelected >= 0 && numberSelected < allNewGamePlayers.size()) {
                selectedPlayers.add(allNewGamePlayers.get(numberSelected));
                allNewGamePlayers.remove(numberSelected);
            }
        } while (selectedPlayers.size() < numbePlayers);
        return selectedPlayers;
    }
    
    private ArrayList<Player> getArrayListPlayers(List<Player> allPlayers ){
        ArrayList<Player> newListPlayers = new ArrayList<>();
        for (Player player : allPlayers) {
            newListPlayers.add(player);
        }
        return newListPlayers;
    }

    private void printAllPlayers(List<Player> players) {
        if (players.size() == 0) {
            Console.printTitle("No tienes ningun jugador registrado aun.");
            return;
        }
        for (int i = 0; i < players.size(); i++) {
            Console.printLine(i + ") " + players.get(i));
        }
    }

    @Override
    public void showAllPlayers(List<Player> players) {
        Console.printTitle("Jugadores registrados");
        printAllPlayers(players);
        Console.printWhiteLine();
        Console.readString("Presiona enter para continuar");
    }

}
