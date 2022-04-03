package me.thehandsomeyoni.mobeditor.guis;

import me.clip.placeholderapi.PlaceholderAPI;
import me.thehandsomeyoni.mobeditor.MobEditor;
import me.thehandsomeyoni.mobeditor.utils.Utils;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EditMobGUI {

    public static Inventory GUI(Player p){

        final Inventory inv = Bukkit.createInventory((InventoryHolder)null, 3*9, Utils.color("&aEdit Mob"));
        ItemStack item;
        List<String> lore;
        int slot;
        OfflinePlayer owner = (OfflinePlayer) p;

        lore = new ArrayList<>();
        lore.add(Utils.color("&fYeaheaha"));
        item = Utils.createItem( "&aIsSexy", Material.PAPER, lore, 1);
        slot = 0;
        inv.setItem(slot, item);


        lore = new ArrayList<>();
        lore.add(Utils.color(""));
        //String jointext = "%vault_rank%";
        //jointext = PlaceholderAPI.setPlaceholders(p, jointext);
        item = Utils.createSkull("&b" + p.getName() , owner, lore);
        slot = 17;
        inv.setItem(slot, item);

        lore = new ArrayList<>();
        lore.add(Utils.color("&7Click to close this inventory"));
        item = Utils.createItem("&cExit" , Material.BARRIER  , lore, 1);
        slot = 26;
        inv.setItem(slot, item);

        lore = new ArrayList<>();
        lore.add(Utils.color("&fClick on any gameRule to change his value!"));
        item = Utils.createItem(Utils.color("&aInfo") , Material.REDSTONE_TORCH  , lore, 1);
        item.getItemMeta().setUnbreakable(true);
        slot = 21;
        inv.setItem(slot, item);

        for (int i = 0 ; i < inv.getSize() ; i++) {
            if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
                lore = new ArrayList<>();
                item = Utils.createItem("&a", Material.LIGHT_GRAY_STAINED_GLASS_PANE, lore, 1);
                slot = i;
                if (slot > 9 && slot < 17 || slot > 18 && slot < 26 || slot > 27 && slot < 35 || slot > 36 && slot < 44) {
                    item.setDurability((short)15);
                } else {
                    item.setDurability((short)0);
                }
                inv.setItem(i, item);
            }
        }
        return inv;
    }

    public static void clicked(final Player p, final int slot, final ItemStack clicked, final Inventory inv) {
        if (clicked != null && clicked.getItemMeta() != null && clicked.getItemMeta().getDisplayName() != null) {

            if(clicked.getItemMeta().getDisplayName().equals(Utils.color("&cExit"))){
                p.closeInventory();
                return;
            }
            //p.sendTitle(Utils.color("&aPlease write a value in chat"), Utils.color("&bnumbers only!"), 1,999999,1);

        }
    }
}
