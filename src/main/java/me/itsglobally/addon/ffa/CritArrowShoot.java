package me.itsglobally.addon.ffa;

import me.bedtwL.ffa.api.PlayerArrowShootEffect;
import me.bedtwL.ffa.api.effect.PureArrowShootEffect;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CritArrowShoot extends PureArrowShootEffect {
    @Override
    public void arrowShootEffect(Location location, Player player) {
        location.getWorld().playEffect(location, Effect.CRIT, 0);
    }

    @Override
    public String getName() {
        return "CritTrail";
    }

    @Override
    public String getItemNameKey() {
        return "crit-arrow-shoot";
    }

    @Override
    public ItemStack getItemBase() {
        return new ItemStack(Material.IRON_SWORD);
    }
}
