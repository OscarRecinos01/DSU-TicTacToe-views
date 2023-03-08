package com.dsu.tictactoe.view.viewAbstractFactory.viewsInterface.playerViewInterface;

import java.util.List;

import com.dsu.tictactoe.model.player.Player;
import com.dsu.tictactoe.model.player.PlayerError;
import com.dsu.tictactoe.model.player.PlayerType;

public interface PlayerManagerViewInterface {
    public Player getNewPlayer(PlayerError playerError, Player newPlayer, PlayerType[] playerTypevalues);
    public List<Player> getNewGamePlayers(List<Player> allPlayers, int numbePlayers);
    public void showAllPlayers(List<Player> players);
    
}
