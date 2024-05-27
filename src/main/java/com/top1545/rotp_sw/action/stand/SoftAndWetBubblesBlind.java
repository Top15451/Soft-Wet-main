package com.top1545.rotp_sw.action.stand;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.top1545.rotp_sw.entity.damaging.projectile.SoftAndWetBubbleBlindEntity;
import net.minecraft.world.World;

public class SoftAndWetBubblesBlind extends StandEntityAction {

    public SoftAndWetBubblesBlind(Builder builder) {
        super(builder);
    }
    
    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (!world.isClientSide()) {
                SoftAndWetBubbleBlindEntity bubble = new SoftAndWetBubbleBlindEntity(standEntity, world);
                standEntity.shootProjectile(bubble, 0.1F + standEntity.getRandom().nextFloat() * 0.6F, 1.0F);
        }
    }
}
