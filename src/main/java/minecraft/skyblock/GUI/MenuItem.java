package minecraft.skyblock.GUI;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.inventory.*;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import org.bukkit.scheduler.BukkitRunnable;


public class MenuItem implements Listener {
  public ItemStack SkyBlockMenuItem() {
    ItemStack item = new ItemStack(Material.NETHER_STAR);
    ItemMeta itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(ChatColor.RESET + "SkyBlock Menu");
    item.setItemMeta(itemMeta);
    return item;
  }

  @EventHandler
  public void ItemCheck(PlayerJoinEvent event) {
    if (event.getPlayer().getInventory().getItem(8) == null ||
        !event.getPlayer().getInventory().getItem(8).equals(SkyBlockMenuItem())) {
      event.getPlayer().getInventory().setItem(8, SkyBlockMenuItem());
      event.getPlayer().updateInventory();
    }
    Player player = event.getPlayer();
    new BukkitRunnable() {
      @Override
      public void run() {
        player.setFoodLevel(20);
      }
    } .runTaskTimerAsynchronously(null, 0, 1);
  }
  @EventHandler
  public void ItemUsed(InventoryClickEvent event) {
    if (event.getCurrentItem().equals(SkyBlockMenuItem())) {
      event.setCancelled(true);
      SkyBlockMenu Menu = new SkyBlockMenu();
      Menu.SkyblockMenuGUI((Player) event.getWhoClicked());
    }
  }
  @EventHandler
  public void ItemUsed(PlayerDropItemEvent event) {
    if (event.getItemDrop().getItemStack().equals(SkyBlockMenuItem())) {
      event.setCancelled(true);
      SkyBlockMenu Menu = new SkyBlockMenu();
      Menu.SkyblockMenuGUI(event.getPlayer());
    }
  }
  @EventHandler
  public void ItemUsed(PlayerInteractEvent event) {
    if (event.hasItem() && event.getItem().equals(SkyBlockMenuItem())) {
      event.setCancelled(true);
      SkyBlockMenu Menu = new SkyBlockMenu();
      Menu.SkyblockMenuGUI(event.getPlayer());
    }
  }
  @EventHandler
  public void ItemUsed(PlayerItemMendEvent event) {
    event.getPlayer().sendMessage(ChatColor.YELLOW + "[SkyBlock]" + ChatColor.RESET + event.getEventName());
  }
}
