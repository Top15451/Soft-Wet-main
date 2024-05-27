package com.top1545.rotp_sw.action.stand;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import com.top1545.rotp_sw.entity.damaging.projectile.SoftAndWetBubblesStunEntity;
import net.minecraft.world.World;

public class SoftAndWetBubblesStun extends StandEntityAction {

    public SoftAndWetBubblesStun(Builder builder) {
        super(builder);
    }
    
    @Override
    public void standPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (!world.isClientSide()) {
                SoftAndWetBubblesStunEntity bubble = new SoftAndWetBubblesStunEntity(standEntity, world);
                standEntity.shootProjectile(bubble, 0.1F + standEntity.getRandom().nextFloat() * 0.6F, 1.0F);
        }
    }
}
