package eggnew;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import eggnewcode.EggNewCodeClass;





public class Main extends JavaPlugin {

	public void onEnable() {
		System.out.println(ChatColor.LIGHT_PURPLE +  "(!!!)------> EGG ON <------(!!!)");
		
		registerEvents();
	
	}
	
	public void onDisable() {
		System.out.println(ChatColor.LIGHT_PURPLE + "(XxXxXx)------> EGG OFF <------(XxXxXx)");
	}

	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new EggNewCodeClass(), this);
	
		
}
}

