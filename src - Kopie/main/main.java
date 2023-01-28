package main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import Listener.Listener;
import Listener.Position_tp;

public class main extends JavaPlugin{
	@SuppressWarnings("deprecation")
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage("§6FFA activates...");
		Bukkit.getPluginManager().registerEvents(new Listener(), this);
		Bukkit.getPluginManager().registerEvents(new Position_tp(), this);
		
		 Bukkit.getServer().getScheduler().scheduleAsyncRepeatingTask(this, new Runnable(){
	            public void run(){
	                for(Player p : Bukkit.getOnlinePlayers()){
	                 if(p.getExp() == 55) {
	                 p.sendMessage("You unlocked i");
	                }
	            }
	            }
	        }, 20l, 10l);
	}
	
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("§6FFA deactivates...");
		
	}

}
