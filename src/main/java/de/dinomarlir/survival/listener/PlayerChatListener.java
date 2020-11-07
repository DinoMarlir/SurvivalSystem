package de.dinomarlir.survival.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatListener implements Listener {
    @EventHandler


    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();


        if (!event.getPlayer().isOp()) {
            //Chat wenn der Spieler kein OP hat.


            event.setFormat("§9" + event.getPlayer().getName() + " §8» §a" + event.getMessage());

        }else if (event.getPlayer().isOp()) {
            //Chat wenn der Spieler OP hat.

            event.setFormat("§4" + event.getPlayer().getName() + " §8» §a" + event.getMessage());


        }


    }
}
