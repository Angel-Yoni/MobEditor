package me.thehandsomeyoni.mobeditor.listeners;

import me.thehandsomeyoni.mobeditor.guis.EditMobGUI;
import me.thehandsomeyoni.mobeditor.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickInventoryEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){
        String title = e.getView().getTitle();
        if(title.equals(Utils.color("&aEdit Mob"))){
            e.setCancelled(true);
            EditMobGUI.clicked((Player) e.getWhoClicked(),e.getSlot(),e.getCurrentItem(),e.getInventory());
            return;
        }

    }

}
