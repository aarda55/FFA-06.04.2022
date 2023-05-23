package Listener;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import data.FFA_me;

public class Position_tp implements Listener {
	 
	@EventHandler
	public void onPME(PlayerMoveEvent e) {
		 Player p = e.getPlayer();
		 Location loc = p.getLocation();
		 int y = loc.getBlockY();
			 if(y == 40) {
				 if(!(p.getGameMode() == GameMode.CREATIVE)){
				 p.getInventory().clear();
				 FFA_me.setFFAItems(p);
			 }
}
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		 Player p = e.getPlayer();
		 p.getInventory().clear();
	}
}
