package kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

import data.kit_data;

public class Upgrade_kits implements Listener {
	@EventHandler
	public void obEXP(PlayerExpChangeEvent e) {
		Player p = e.getPlayer();
		int m = e.getAmount();
		if(m == 5) {
			kit_data.first_kit(p);
		}
		if(m == 10) {
			kit_data.second_kit(p);
		}
		if(m == 15) {
			kit_data.second_kit(p);
		}
		if(m == 20) {
			kit_data.third_kit(p);
		}
		if(m == 25) {
			kit_data.forth_kit(p);
		}
	}
}
