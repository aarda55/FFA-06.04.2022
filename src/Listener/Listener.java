package Listener;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.util.Vector;

import data.FFA_me;
import data.FFA_sta;
import data.clear;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.PacketPlayInClientCommand;
import net.minecraft.server.v1_8_R3.PacketPlayInClientCommand.EnumClientCommand;

public class Listener implements org.bukkit.event.Listener {
	static ArrayList<Player> hidden = new ArrayList<Player>();
	@EventHandler
	public static void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
			p.setFoodLevel(20);
			e.setJoinMessage(null);
				p.setGameMode(GameMode.SURVIVAL);
			
			for(Player all : Bukkit.getOnlinePlayers()){
				p.showPlayer(all);
				hidden.remove(p);
		
	    }
	}
	@EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityDamageEvent(final EntityDamageEvent e) {
        if (!(e.getEntity() instanceof Player)) {
            return;
        }
        @SuppressWarnings("unused")
		Player p = (Player) e.getEntity();
        if (e.getCause() == DamageCause.FALL) {
                	e.setCancelled(true);
        }
	}
	@EventHandler
	public void onEntityDamage(EntityDamageEvent e){
		Player p = (Player) e.getEntity();
		 Location loc = p.getLocation();
		 int y = loc.getBlockY();
		if(y < 40) {
		e.setCancelled(false);
		}else {
		e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onEntityDamage(EntityDamageByBlockEvent e){
		Entity p = e.getEntity();
		 Location loc = p.getLocation();
		 int y = loc.getBlockY();
		if(y < 40) {
		e.setCancelled(false);
		}else {
		e.setCancelled(true);
		}
	}
	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent e){
		Entity p = e.getEntity();
		 Location loc = p.getLocation();
		 int y = loc.getBlockY();
		if(y < 40) {
		e.setCancelled(false);
		}else {
		e.setCancelled(true);
		}
	}
	public void onInteract(PlayerInteractEvent e){
	Player p = e.getPlayer();
	 Location loc = p.getLocation();
	 int y = loc.getBlockY();
		if(p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			if(y > 40) {
			e.setCancelled(true);
		}
		}
	}
	@EventHandler
	public void onIn(InventoryClickEvent e){
		Player p = (Player)e.getWhoClicked();
		if(p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}
	}
	@EventHandler
	public void onDro(PlayerDropItemEvent e){
		Player p = e.getPlayer();
		if(p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}
	}
	@EventHandler
	public void onDdd(FoodLevelChangeEvent e){
		e.setCancelled(true);
	}
	@EventHandler
	public void onBlock(BlockPlaceEvent e){
		Player p = e.getPlayer();
		if(p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}
	}
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e){
		Player p = e.getPlayer();
		if(p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}
}
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        Player p = e.getEntity();
        Player d = p.getKiller();
        d.giveExpLevels(1);
        p.setExp(0);
        d.setHealth(20);
        p.getInventory().clear();
        FFA_me.setFFAItems(d);
        FFA_sta.setFFAstartItems(p);
        clear.cleararmor(p);
        e.setDeathMessage(null);
        PacketPlayInClientCommand in = new PacketPlayInClientCommand(EnumClientCommand.PERFORM_RESPAWN);
        EntityPlayer cPlayer = ((CraftPlayer)p).getHandle();
        cPlayer.playerConnection.a(in);
        p.setVelocity(null);
        p.setHealth(20);
    }
    @EventHandler
    public void onknock(PlayerVelocityEvent e) {
    	Player p = e.getPlayer();
    	if(p.getHealth() == 0) {
    		e.setCancelled(true);
    	}else{
    		e.setCancelled(false);
    	}
    }
    @EventHandler
    public void onEnderPearlThrowEvent(ProjectileLaunchEvent e) {
    Projectile pro = e.getEntity(); 
    if(pro instanceof EnderPearl) {
    	Vector loc = pro.getVelocity();
    	if(loc.getY() > 35) {
    		pro.remove();
    	}
    }
    	
    }
    @EventHandler
    public void onArrowshoot(EntityShootBowEvent e) {
    	Entity arrow = e.getProjectile();
    	if(arrow.isOnGround())
    		arrow.remove();
    } 
}    