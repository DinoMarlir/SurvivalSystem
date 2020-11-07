package de.dinomarlir.survival.listener;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        //Hier wird die JoinNachicht gesetzt!
        event.setJoinMessage("§8[§a+§8] §a" + event.getPlayer().getName());
        //Hier wird der GameMode auf SURVIVAL gesetzt!
        player.setGameMode(GameMode.SURVIVAL);


    }
}
