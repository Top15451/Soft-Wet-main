package com.top1545.rotp_sw.action.stand;

import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.util.general.GeneralUtil;
import com.top1545.rotp_sw.entity.damaging.projectile.SoftAndWetBubbleEntity;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityTask;
import com.github.standobyte.jojo.entity.stand.StandStatFormulas;

import com.github.standobyte.jojo.power.impl.stand.IStandPower;
import net.minecraft.world.World;

public class SoftAndWetBubbles extends StandEntityAction {

    public SoftAndWetBubbles(StandEntityAction.Builder builder) {
        super(builder);
    }
    
    @Override
    public void standTickPerform(World world, StandEntity standEntity, IStandPower userPower, StandEntityTask task) {
        if (!world.isClientSide()) {
            double fireRate = 2.5 * StandStatFormulas.projectileFireRateScaling(standEntity, userPower);
            GeneralUtil.doFractionTimes(() -> {
                SoftAndWetBubbleEntity bubble = new SoftAndWetBubbleEntity(standEntity, world);
                standEntity.shootProjectile(bubble, 0.1F + standEntity.getRandom().nextFloat() * 0.5F, 16.0F);
            }, fireRate);
        }
    }

}
