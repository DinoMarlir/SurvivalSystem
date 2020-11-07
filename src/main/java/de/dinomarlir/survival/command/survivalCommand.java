package de.dinomarlir.survival.command;

import de.dinomarlir.survival.Survival;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class survivalCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //Hier kommt die Nachicht!
        sender.sendMessage(Survival.Prefix + "Die Commands:");
        sender.sendMessage(Survival.Prefix + "/info §8● §aZeigt die Infos an.");
        sender.sendMessage(Survival.Prefix + "/brodcastpositionCommand §8● §asendet deine Position an andere Spieler.");


        return false;
    }
}
