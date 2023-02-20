package minecraft.skyblock.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SkyBlockMenu implements CommandExecutor {
  public void SkyblockMenuGUI(Player player) {
    List<String> itemLore;
    Inventory GUI = Bukkit.createInventory(null, 6*9, "SkyBlock Menu");
    ItemStack item = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 0, (byte) 15);
    ItemMeta itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(" ");
    item.setItemMeta(itemMeta);
    for (int i = 0; i < 54; i++) {
      GUI.setItem(i, item);
    }
    // Close:49
    item = new ItemStack(Material.BARRIER);
    itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(ChatColor.RESET+""+ChatColor.RED+""+ChatColor.BOLD+"Close");
    item.setItemMeta(itemMeta);
    GUI.setItem(49, item);
    // Skill:19
    item = new ItemStack(Material.DIAMOND_SWORD);
    itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(ChatColor.RESET+""+ChatColor.GREEN+"Your Skill");
    itemLore = new ArrayList<>();
    itemLore.add(ChatColor.GRAY+"View your skill progression");
    itemLore.add(ChatColor.GRAY+"and rewords.");
    itemLore.add("");
    itemLore.add(ChatColor.YELLOW+"Click to view!");
    itemMeta.setLore(itemLore);
    item.setItemMeta(itemMeta);
    GUI.setItem(19, item);
    // collection:20
    item = new ItemStack(Material.PAINTING);
    itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(ChatColor.RESET+""+ChatColor.GREEN+"Collections");
    itemLore = new ArrayList<>();
    itemLore.add(ChatColor.GRAY+"View all of the items avaliable");
    itemLore.add(ChatColor.GRAY+"in SkyBlock. Collect more of an");
    itemLore.add(ChatColor.GRAY+"item to unlock rewards on your");
    itemLore.add(ChatColor.GRAY+"way to becoming a master of");
    itemLore.add(ChatColor.GRAY+"SkyBlock!");
    itemLore.add("");
    itemLore.add(ChatColor.YELLOW+"Click to view!");
    itemMeta.setLore(itemLore);
    item.setItemMeta(itemMeta);
    GUI.setItem(20, item);
    // recipe book:21
    item = new ItemStack(Material.BOOK);
    itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(ChatColor.RESET+""+ChatColor.GREEN+"Recipe Book");
    itemLore = new ArrayList<>();
    itemLore.add(ChatColor.GRAY+"Through your adventure, you will");
    itemLore.add(ChatColor.GRAY+"unlock recipes for all kinds of");
    itemLore.add(ChatColor.GRAY+"special items! You can view how");
    itemLore.add(ChatColor.GRAY+"to craft these item there.");
    itemLore.add("");
    itemLore.add(ChatColor.YELLOW+"Click to view!");
    itemMeta.setLore(itemLore);
    item.setItemMeta(itemMeta);
    GUI.setItem(21, item);
    // quest log:23
    item = new ItemStack(Material.BOOK_AND_QUILL);
    itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(ChatColor.RESET+""+ChatColor.GREEN+"Quest Log");
    itemLore = new ArrayList<>();
    itemLore.add(ChatColor.GRAY+"View your active quests,");
    itemLore.add(ChatColor.GRAY+"progress, and rewards.");
    itemLore.add("");
    itemLore.add(ChatColor.YELLOW+"Click to view!");
    itemMeta.setLore(itemLore);
    item.setItemMeta(itemMeta);
    GUI.setItem(23, item);
    // calendar and events:24
    item = new ItemStack(347);
    itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(ChatColor.RESET+""+ChatColor.GREEN+"Calendar And Events");
    itemLore = new ArrayList<>();
    itemLore.add(ChatColor.GRAY+"View the SkyBlock Calendar,");
    itemLore.add(ChatColor.GRAY+"upcoming events, and event");
    itemLore.add(ChatColor.GRAY+"rewards!");
    itemLore.add("");
    itemLore.add(ChatColor.YELLOW+"Click to view!");
    itemMeta.setLore(itemLore);
    item.setItemMeta(itemMeta);
    GUI.setItem(24, item);
    // storage:25
    item = new ItemStack(Material.CHEST);
    itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(ChatColor.RESET+""+ChatColor.GREEN+"Storage");
    itemLore = new ArrayList<>();
    itemLore.add(ChatColor.GRAY+"Store global items that you");
    itemLore.add(ChatColor.GRAY+"want to access at any time from anywhere here.");
    itemMeta.setLore(itemLore);
    item.setItemMeta(itemMeta);
    GUI.setItem(25, item);
    // crafting table:31
    item = new ItemStack(Material.WORKBENCH);
    itemMeta = item.getItemMeta();
    itemMeta.setDisplayName(ChatColor.RESET+""+ChatColor.GREEN+"Carfting table");
    itemLore = new ArrayList<>();
    itemLore.add(ChatColor.GRAY+"Opens the crafting gird.");
    itemMeta.setLore(itemLore);
    item.setItemMeta(itemMeta);
    GUI.setItem(31, item);
    //
    player.openInventory(GUI);
  }
  
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    SkyblockMenuGUI((Player) sender);
    return false;
  }
}
