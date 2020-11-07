package de.dinomarlir.survival.command;

import de.dinomarlir.survival.Survival;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class survivalCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(Survival.Prefix + "Das Menü kommt noch! :=) Schen die drin sind: (/survival /info /brodcastpositionCommand ChatSystem Join/Quit Nachichten)");



        return false;
    }
}
