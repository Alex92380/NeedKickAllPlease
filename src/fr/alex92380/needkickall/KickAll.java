package fr.alex92380.needkickall;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KickAll implements CommandExecutor {
private Main main;
public KickAll(Main main) {
	this.main = main;
}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg3) {
		if(sender instanceof Player) {
		for(Player player : Bukkit.getOnlinePlayers()) {
			if(!player.getName().equalsIgnoreCase(sender.getName())||!player.hasPermission("needkickall.kickall")) {
				player.kickPlayer(main.getConfig().getString("KickAll.kickMessage").replaceAll("&", "§"));
			
			}
			sender.sendMessage("§7[§4NeedKickAllPlease§7]§c Kicked players successfully");
		}
			
		}else {
			sender.sendMessage("§7[§4NeedKickAllPlease§7]§c You need to be a player to execute this command");
		}
		return false;
	}
}
