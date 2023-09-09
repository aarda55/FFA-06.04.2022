
package Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import data.Methods;
import data.data.Data;



public class Leave implements Listener {
	
	@EventHandler
	public void onInt(PlayerInteractEvent e) {
	Player p = e.getPlayer();
	try{
		if(e.getItem().getType() == Material.INK_SACK){
		if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4Leave")){
		p.teleport(Data.spawn);
		Methods.setLobbyItems(p);
}
}
}catch(Exception e1){
		p.sendMessage("§cThere was an error while teleporting you to the lobby.");
}
	}
}
