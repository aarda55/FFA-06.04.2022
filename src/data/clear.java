package data;

import org.bukkit.entity.Player;

public class clear {
	public static void cleararmor(Player player){
		player.getInventory().setHelmet(null);
		player.getInventory().setChestplate(null);
		player.getInventory().setLeggings(null);
		player.getInventory().setBoots(null);
		}
}
