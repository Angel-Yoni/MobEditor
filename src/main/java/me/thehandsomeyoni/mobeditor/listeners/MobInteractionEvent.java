package me.thehandsomeyoni.mobeditor.listeners;

import me.thehandsomeyoni.mobeditor.guis.MobEditorGUI;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.persistence.PersistentDataType;

public class MobInteractionEvent implements Listener {
    private static LivingEntity entity;

    @EventHandler
    public void mobEvent(PlayerInteractEntityEvent event){
        if(event.getRightClicked() instanceof LivingEntity entity &&
                ! (event.getRightClicked() instanceof Player)){
            this.entity = entity;
            MobEditorGUI inv = new MobEditorGUI();
            event.getPlayer().openInventory(inv.getInventory());
        }
    }

    public static final LivingEntity getEntity(){
        return entity;
    }
}
