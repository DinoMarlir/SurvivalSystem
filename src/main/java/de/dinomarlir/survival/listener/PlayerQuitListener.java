package de.dinomarlir.survival.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {
    public void onQuit(PlayerQuitEvent event) {

        //Hier wird die QuitNachicht gesetzt!
        event.setQuitMessage("§8[§4-§8] §a" + event.getPlayer().getName());


    }

}
