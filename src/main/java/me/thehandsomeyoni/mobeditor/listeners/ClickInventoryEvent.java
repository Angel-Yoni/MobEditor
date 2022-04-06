package me.thehandsomeyoni.mobeditor.listeners;

import me.thehandsomeyoni.mobeditor.guis.MobEditorGUI;
import me.thehandsomeyoni.mobeditor.utils.Utils;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import static me.thehandsomeyoni.mobeditor.utils.Utils.getConfig;

public class ClickInventoryEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){
        ConfigurationSection section = getConfig().getConfigurationSection("mob-edit-section");
        String title = e.getView().getTitle();
        if(e.getView().getBottomInventory().equals(new MobEditorGUI().getInventory())){
            e.setCancelled(true);

        }

    }

}
