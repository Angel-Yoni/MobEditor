package me.thehandsomeyoni.mobeditor;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class MobInteractionEvent implements Listener {

    @EventHandler
    public void mobEvent(PlayerInteractEntityEvent event){
        if(event.getRightClicked() instanceof LivingEntity entity){

        }
    }
}
