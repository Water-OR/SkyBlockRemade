package minecraft.skyblock.GUI;

import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuClickEvents implements Listener {
  @EventHandler
  public void MainMenuEvent(InventoryClickEvent click) {
    Player player = (Player) click.getWhoClicked();
    if (click.getWhoClicked().getOpenInventory().getTitle().equals("SkyBlock Menu")) {
      click.setCancelled(true);
      switch (click.getRawSlot()) {
        case 49:
          player.closeInventory();
          break;
        case 31:
          player.closeInventory();
          player.openWorkbench(null, true);
          break;
      }
    }
  }
}
