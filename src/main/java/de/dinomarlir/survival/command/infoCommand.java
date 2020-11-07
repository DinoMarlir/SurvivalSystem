package de.dinomarlir.survival.command;

import de.dinomarlir.survival.Survival;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class infoCommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;


        sender.sendMessage(Survival.Prefix + "Dein Spielername§8:§a " + sender.getName());
        sender.sendMessage(Survival.Prefix + "Deine Koordinaten§8:§a X:" +  ((Player) sender).getLocation().getX() + ", Y:" +  ((Player) sender).getLocation().getY() + ", Z:" +  ((Player) sender).getLocation().getZ());


        return false;
    }
}
