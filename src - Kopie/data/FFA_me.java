package data;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FFA_me {
	public static void setFFAItems(Player p){
		ItemStack cos = new ItemStack(Material.IRON_SWORD);
		ItemMeta c = cos.getItemMeta();
		c.spigot().setUnbreakable(true);
		cos.setItemMeta(c);
		
		ItemStack bow = new ItemStack(Material.BOW);
		ItemMeta b = bow.getItemMeta();
		b.spigot().setUnbreakable(true);
		bow.setItemMeta(b);
		
		ItemStack end = new ItemStack(Material.ENDER_PEARL);
		ItemMeta e = end.getItemMeta();
		end.setItemMeta(e);
		
		ItemStack arr = new ItemStack(Material.ARROW);
		ItemMeta a = arr.getItemMeta();
		arr.setItemMeta(a);
		
		ItemStack cos2 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta c2 = cos2.getItemMeta();
		c2.spigot().setUnbreakable(true);
		c2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		cos2.setItemMeta(c2);
		
		ItemStack cos3 = new ItemStack(Material.IRON_HELMET);
		ItemMeta c3 = cos3.getItemMeta();
		c3.spigot().setUnbreakable(true);
		c3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		cos3.setItemMeta(c3);
		
		ItemStack cos4 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta c4 = cos4.getItemMeta();
		c4.spigot().setUnbreakable(true);
		c4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		cos4.setItemMeta(c4);
		
		ItemStack cos5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta c5 = cos5.getItemMeta();
		c5.spigot().setUnbreakable(true);
		c5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		cos5.setItemMeta(c5);
		
		p.getInventory().clear();
		p.getInventory().setItem(0, cos);
		p.getInventory().setItem(4, bow);
		p.getInventory().setItem(2, end);
		p.getInventory().setItem(8, arr);
		p.getInventory().setBoots(cos5);
		p.getInventory().setHelmet(cos3);
		p.getInventory().setChestplate(cos4);
		p.getInventory().setLeggings(cos2);
		p.updateInventory();
		}
}
