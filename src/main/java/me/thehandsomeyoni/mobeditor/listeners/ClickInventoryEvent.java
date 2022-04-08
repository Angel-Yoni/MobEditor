package me.thehandsomeyoni.mobeditor.listeners;

import me.thehandsomeyoni.mobeditor.guis.MobEditorGUI;
import me.thehandsomeyoni.mobeditor.utils.Utils;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Method;
import java.util.Set;

import static me.thehandsomeyoni.mobeditor.listeners.MobInteractionEvent.getEntity;
import static me.thehandsomeyoni.mobeditor.utils.Utils.getConfig;

public class ClickInventoryEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e){
        ConfigurationSection section = getConfig().getConfigurationSection("mob-edit-section");
        // Set<String> mobEditOptions = section.getKeys(false);
        String title = e.getView().getTitle();
        if(e.getView().getBottomInventory().equals(new MobEditorGUI().getInventory())){
            e.setCancelled(true);
            for(String key : section.getKeys(false)){
                if(section.getString(key + ".name").
                        equalsIgnoreCase(e.getCurrentItem().getItemMeta().getDisplayName())){
                    switch (key){
                        case "equipment-helmet" -> {

                        }
                    }
                }
            }
        }

    }

}
