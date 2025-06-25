package me.itsglobally.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

public abstract class CritArrowMain implements EffectAddon {
    @Override
    public String getName() {
        return "CritArrow";
    }

    @Override
    public String getAuthor() {
        return "ItsGlobally";
    }

    @Override
    public void onEnable() {
        new CritSlimeShoot().registerArrowShootEffect(this);
    }

    @Override
    public void onDisable() { new CritSlimeShoot().unregisterArrowShootEffect();}
}
