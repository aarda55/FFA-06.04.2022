package main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import Listener.Listener;
import Listener.Position_tp;
import functions.admin_mv;
import kits.Upgrade_kits;

public class main extends JavaPlugin{
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage("§6FFA is activating...");
		Bukkit.getPluginManager().registerEvents(new Listener(), this);
		Bukkit.getPluginManager().registerEvents(new Position_tp(), this);
		Bukkit.getPluginManager().registerEvents(new Upgrade_kits(), this);
		Bukkit.getPluginManager().registerEvents(new admin_mv(), this);
	}
	
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("§6FFA is deactivating...");
		
	}

}
