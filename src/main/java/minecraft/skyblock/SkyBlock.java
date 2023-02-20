package minecraft.skyblock;

import minecraft.skyblock.GUI.MenuItem;
import minecraft.skyblock.GUI.SkyBlockMenu;
import minecraft.skyblock.GUI.MenuClickEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyBlock extends JavaPlugin {
  
  @Override
  public void onEnable() {
    // Plugin startup logic
    System.out.print(ChatColor.YELLOW+"[SkyblockRemade]"+ChatColor.WHITE+"Enabled");
    getCommand("menu").setExecutor(new SkyBlockMenu());
    getServer().getPluginManager().registerEvents(new MenuClickEvents(), this);
    getServer().getPluginManager().registerEvents(new MenuItem(), this);
  }
  
  @Override
  public void onDisable() {
    // Plugin shutdown logic
    System.out.print(ChatColor.YELLOW+"[SkyblockRemade]"+ChatColor.WHITE+"Disabled");
  }
}
