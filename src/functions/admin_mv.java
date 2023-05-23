package functions;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import data.FFA_me;
import data.data.Data;
import data.kit_data;

public class admin_mv implements Listener {
	
	@EventHandler
	public void onPlayer1(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
			if(e.getMessage().equalsIgnoreCase("/FFA1")){
				if(p.getGameMode() == GameMode.CREATIVE) {
				p.sendMessage("§2You equipped the first upgrade!");
			    FFA_me.setFFAItems(p);
			}else {
				p.sendMessage(Data.NoPerm);
			}	
			}
				if(e.getMessage().equalsIgnoreCase("/FFA2")){
					if(p.getGameMode() == GameMode.CREATIVE) {
					p.sendMessage("§2You equipped the second upgrade!");
			    kit_data.first_kit(p);
			}else {
				p.sendMessage(Data.NoPerm);
			}
				}
			if(e.getMessage().equalsIgnoreCase("/FFA3")){
				if(p.getGameMode() == GameMode.CREATIVE) {
				p.sendMessage("§2You equipped the third upgrade!");
			    kit_data.second_kit(p);
			}else {
				p.sendMessage(Data.NoPerm);
			}	
			}
			if(e.getMessage().equalsIgnoreCase("/FFA4")){
				if(p.getGameMode() == GameMode.CREATIVE) {
				p.sendMessage("§2You equipped the forth upgrade!");
			    kit_data.third_kit(p);
			}else {
				p.sendMessage(Data.NoPerm);
			}	
			}
			if(e.getMessage().equalsIgnoreCase("/FFA5")){
				if(p.getGameMode() == GameMode.CREATIVE) {
				p.sendMessage("§2You equipped the fith upgrade!");
			    kit_data.forth_kit(p);
			}else {
				p.sendMessage(Data.NoPerm);

			}
			}
			}
}