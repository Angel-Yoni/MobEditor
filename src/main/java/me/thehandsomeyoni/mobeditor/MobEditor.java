package me.thehandsomeyoni.mobeditor;

import me.thehandsomeyoni.mobeditor.listeners.ClickInventoryEvent;
import me.thehandsomeyoni.mobeditor.listeners.MobInteractionEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobEditor extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();


        // Register events
        getServer().getPluginManager().registerEvents(new MobInteractionEvent(), this);
        getServer().getPluginManager().registerEvents(new ClickInventoryEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
