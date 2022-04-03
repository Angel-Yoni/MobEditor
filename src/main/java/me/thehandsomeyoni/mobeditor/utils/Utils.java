package me.thehandsomeyoni.mobeditor.utils;

import me.thehandsomeyoni.mobeditor.MobEditor;
import org.bukkit.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    /**
     * @param txt The string you would like to color code.
     * @return the new text (color coded)
     */
    public static String color(final String txt) {
        return txt == null ? null : ChatColor.translateAlternateColorCodes('&', txt);
    }

    /**
     * @param name The name of the item.
     * @param material The material of the item.
     * @param lore The lore of the item.
     * @param amount The amount of items.
     * @return The new item that was created.
     */
    public static ItemStack createItem(String name, Material material, List<String> lore, int amount) {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        String nm = color(name);
        meta.setDisplayName(nm);
        List<String> lorea = new ArrayList<>();
        for (String string : lore) {
            lorea.add(color(string));
        }
        meta.setLore(lorea);
        meta.removeItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        return item;
    }

    /**
     * @param name The name of the skull.
     * @param owner The name of the player (his head will be on the material).
     * @param lore The lore of the skull.
     * @return The new skull that was created.
     */
    public static ItemStack createSkull(String name, OfflinePlayer owner, List<String> lore) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1, (short) SkullType.PLAYER.ordinal());
        SkullMeta meta = (SkullMeta) skull.getItemMeta();
        meta.setOwningPlayer(Bukkit.getOfflinePlayer(owner.getUniqueId()));
        meta.setDisplayName(color(name));
        List<String> lorea = new ArrayList<>();
        for (String string2 : lore) {
            lorea.add(color(string2));
        }
        meta.setLore(lorea);
        skull.setItemMeta(meta);

        return skull;
    }

    /**
     * @return The plugin instance.
     */
    public static final MobEditor getPlugin(){
        return MobEditor.getPlugin(MobEditor.class);
    }

    /**
     * @return The config instance.
     */
    public static final FileConfiguration getConfig(){
        return getPlugin().getConfig();
    }
}
