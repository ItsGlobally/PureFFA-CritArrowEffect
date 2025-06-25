package me.itsglobally.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

import java.util.UUID;

public class CritArrowMain implements EffectAddon {
    @Override
    public Integer getAPIVer() { return 1; };
    @Override
    public String getName() {
        return "CritArrow";
    }
    @Override
    public UUID authorUUID() {
        return UUID.fromString("748c3863-c04d-493b-bce3-05a1765a5b56");
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
