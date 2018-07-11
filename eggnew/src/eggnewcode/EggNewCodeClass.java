package eggnewcode;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class EggNewCodeClass implements Listener {

	
	//Egg Types
	ItemStack BatEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 65);
	ItemStack BunnyEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 101);
	ItemStack CatEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 98);
	ItemStack ChickenEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 93);
	ItemStack CowEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 92);
	ItemStack DogEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 95);
	ItemStack HorseEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 100);
	ItemStack MooshroomEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 96);
	ItemStack PigEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 90);
	ItemStack SheepEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 91);
	ItemStack SquidEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 94);
	ItemStack VillagerEgg = new ItemStack(Material.MONSTER_EGG, 1, (short) 120);

	//A 'Magic Wand'
	ItemStack Stick = new ItemStack(Material.STICK);

	//Mob Types
	EntityType Bat = EntityType.BAT;
	EntityType Bunny = EntityType.RABBIT;
	EntityType Cat = EntityType.OCELOT;
	EntityType Chicken = EntityType.CHICKEN;
	EntityType Cow = EntityType.COW;
	EntityType Dog = EntityType.WOLF;
	EntityType Horse = EntityType.HORSE;
	EntityType Mooshroom = EntityType.MUSHROOM_COW;
	EntityType Pig = EntityType.PIG;
	EntityType Sheep = EntityType.SHEEP;
	EntityType Squid = EntityType.SQUID;
	EntityType Villager = EntityType.VILLAGER;

	@EventHandler
	public void onInteract(PlayerInteractEntityEvent event) {
		Player player = event.getPlayer();
		Entity entity = event.getRightClicked();
		
		
		if (player.getInventory().getItemInMainHand().equals(Stick)){
			if(player.getFoodLevel() > 1) {
				if (entity.getType().equals(Sheep)){
                    entity.remove();
                    player.getInventory().addItem(SheepEgg);
                    player.setFoodLevel(player.getFoodLevel() - 2);
                    player.sendMessage(ChatColor.AQUA + "The sheep has been eggified.");
                }
				if (entity.getType().equals(Bat)){
                    entity.remove();
                    player.getInventory().addItem(BatEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The bat has been eggified.");
                }
                if (entity.getType().equals(Bunny)){
                    entity.remove();
                    player.getInventory().addItem(BunnyEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The bunny has been eggified.");
                }
                if (entity.getType().equals(Cat)){
                    entity.remove();
                    player.getInventory().addItem(CatEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The cat has been eggified.");
                }
                if (entity.getType().equals(Chicken)){
                    entity.remove();
                    player.getInventory().addItem(ChickenEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The chicken has been eggified.");
                }
                if (entity.getType().equals(Cow)){
                    entity.remove();
                    player.getInventory().addItem(CowEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The cow has been eggified.");
                }
                if (entity.getType().equals(Dog)){
                    entity.remove();
                    player.getInventory().addItem(DogEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The dog has been eggified.");
                }
                if (entity.getType().equals(Horse)){
                    entity.remove();
                    player.getInventory().addItem(HorseEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The horse has been eggified.");
                }
                if (entity.getType().equals(Mooshroom)){
                    entity.remove();
                    player.getInventory().addItem(MooshroomEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The mooshroom has been eggified.");
                }
                if (entity.getType().equals(Pig)){
                    entity.remove();
                    player.getInventory().addItem(PigEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The pig has been eggified.");
              
                }
                if (entity.getType().equals(Squid)){
                    entity.remove();
                    player.getInventory().addItem(SquidEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The squid has been eggified.");
                }
                if (entity.getType().equals(Villager)){
                    entity.remove();
                    player.getInventory().addItem(VillagerEgg);
                    player.setFoodLevel(player.getFoodLevel() - 1);
                    player.sendMessage(ChatColor.AQUA + "The villager has been eggified.");
                }
			}else{
				if(player.getFoodLevel() <= 1 );
				player.sendMessage(ChatColor.DARK_RED + " you dont need this egg");
			}
		}
	}
}
