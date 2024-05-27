package com.top1545.rotp_sw.action.stand;

import com.github.standobyte.jojo.action.stand.StandEntityHeavyAttack;
import com.github.standobyte.jojo.action.stand.punch.StandEntityPunch;
import com.github.standobyte.jojo.entity.stand.StandEntity;
import com.github.standobyte.jojo.init.ModStatusEffects;
import com.github.standobyte.jojo.util.mc.damage.StandEntityDamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;

public class SoftAndWetFinisher extends StandEntityHeavyAttack {
    public SoftAndWetFinisher(StandEntityHeavyAttack.Builder builder) { super(builder); }

    public PlayerEntity getPlayer() { return player; }
    PlayerEntity player;

    @Override
    public StandEntityPunch punchEntity(StandEntity stand, Entity target, StandEntityDamageSource dmgSource) {
        LivingEntity living = (LivingEntity) target;

        living.addEffect(new EffectInstance(ModStatusEffects.STUN.get(), 40, 0, false, false, false));

        return super.punchEntity(stand, target, dmgSource).addKnockback(0.5F + stand.getLastHeavyFinisherValue())
                .knockbackXRot(-10.0F);
    }


}



