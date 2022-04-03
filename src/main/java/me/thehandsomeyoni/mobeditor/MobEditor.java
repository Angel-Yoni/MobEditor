package me.thehandsomeyoni.mobeditor;

import org.bukkit.plugin.java.JavaPlugin;

public final class MobEditor extends JavaPlugin {

    @Override
    public void onEnable() {



        // Register events
        getServer().getPluginManager().registerEvents(new MobInteractionEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
