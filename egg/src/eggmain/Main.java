package eggmain;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import eggmainevent.Eggcode;


public class Main extends JavaPlugin {
	
		public void onEnable() {
			System.out.println(ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + "(!!!)------> EGG ON <------(!!!)");
			
			registerEvents();
		
		}
		
		public void onDisable() {
			System.out.println(ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + "(XxXxXx)------> EGG OFF <------(XxXxXx)");
		}

		
		public void registerEvents() {
			PluginManager pm = getServer().getPluginManager();
			
			pm.registerEvents(new Eggcode(), this);
			
	}
}

