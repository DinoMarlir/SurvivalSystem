package de.dinomarlir.survival.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class broadcastpositionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;


        if (!sender.isOp()) {
            //Wenn der Spieler kein OP hat:
            Bukkit.broadcastMessage("§8[§6Position§8] §aDer Spieler §9" + sender.getName() + " §ahat seine Position §8(§6X:" + ((Player) sender).getLocation().getX() + " Y:" + ((Player) sender).getLocation().getY() + " Z:" + ((Player) sender).getLocation().getZ() + " §amit dem Chat geteilt§8!");
        }else if (sender.isOp()) {
            //Wenn der Spieler OP hat:

            Bukkit.broadcastMessage("§8[§6Position§8] §aDer Spieler §4" + sender.getName() + " §ahat seine Position §8(§6X:" + ((Player) sender).getLocation().getX() + " Y:" + ((Player) sender).getLocation().getY() + " Z:" + ((Player) sender).getLocation().getZ() + " §amit dem Chat geteilt§8!");
        }


        return false;
    }
}
