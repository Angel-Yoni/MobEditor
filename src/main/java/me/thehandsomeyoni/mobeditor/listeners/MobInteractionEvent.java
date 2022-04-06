package me.thehandsomeyoni.mobeditor.listeners;

import me.thehandsomeyoni.mobeditor.guis.MobEditorGUI;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class MobInteractionEvent implements Listener {

    @EventHandler
    public void mobEvent(PlayerInteractEntityEvent event){
        if(event.getRightClicked() instanceof LivingEntity entity){
            MobEditorGUI inv = new MobEditorGUI();
            event.getPlayer().openInventory(inv.getInventory());
        }
    }
}
