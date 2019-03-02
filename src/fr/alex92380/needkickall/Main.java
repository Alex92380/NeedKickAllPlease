package fr.alex92380.needkickall;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
@Override
public void onEnable() {
	saveDefaultConfig();
getCommand("kickall").setExecutor(new KickAll(this));
}
}
