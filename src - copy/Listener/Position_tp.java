package Listener;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import data.FFA_me;

public class Position_tp implements Listener {
	 
	@EventHandler
	public void onj(PlayerMoveEvent e) {
		 Player p = e.getPlayer();
		 Location loc = p.getLocation();
		 int y = loc.getBlockY();
		 if(p.hasPermission("ffa.join")) {
			 if(y == 40) {
				 p.getInventory().clear();
				 FFA_me.setFFAItems(p);
			 }
}
	 }
}
