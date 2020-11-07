package de.dinomarlir.survival;

import de.dinomarlir.survival.command.broadcastpositionCommand;
import de.dinomarlir.survival.command.infoCommand;
import de.dinomarlir.survival.command.survivalCommand;
import de.dinomarlir.survival.listener.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class Survival extends JavaPlugin {
    public static final String Prefix = "§9SURVIVAL §8● §a ";


    @Override
    public void onEnable() {





        //Hier werden die Listener registriert!
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerJoinListener(), this);
        pluginManager.registerEvents(new PlayerQuitListener(), this);
        pluginManager.registerEvents(new PlayerChatListener(), this);



        //Hier werden die Commands registriert!
        getCommand("info").setExecutor(new infoCommand());
        getCommand("broadcastposition").setExecutor(new broadcastpositionCommand());
        getCommand("survival").setExecutor(new survivalCommand());

    }

    @Override
    public void onDisable() {

    }
}
