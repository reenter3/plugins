package eggmainevent;

import org.bukkit.ChatColor;
import org.bukkit.Material;


import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.player.PlayerInteractEntityEvent;



public class Eggcode implements Listener {
	
	
	
	
	@EventHandler
	public void onInteract(PlayerInteractEntityEvent event) {
		
		Player player = event.getPlayer();
		
		
		if(event.getRightClicked() instanceof Sheep) {
			player.getMainHand().equals(Material.STICK);
			player.getFoodLevel();
			
			if(player.getFoodLevel() > 1) {
				
				player.setFoodLevel(player.getFoodLevel() - 1);
				event.getPlayer().getInventory().addItem(new ItemStack(Material.MONSTER_EGG,1, (short) 91));
				
			}else{
				if(player.getFoodLevel() <= 1 );
				player.sendMessage(ChatColor.DARK_RED + " you dont need this egg");
			
				
		}
		
		
	    
			
				
			
			
			
			
			}
			
		}
	
	
}
	


