package com.top1545.rotp_sw.init;

import com.github.standobyte.jojo.action.stand.*;
import com.github.standobyte.jojo.entity.stand.StandPose;
import com.github.standobyte.jojo.init.ModSounds;
import com.top1545.rotp_sw.action.stand.SoftAndWetBubbles;
import com.top1545.rotp_sw.entity.stand.stands.SoftAndWetEntity;
import com.top1545.rotp_sw.RotpSoftAndWet;
import com.github.standobyte.jojo.action.Action;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject;
import com.github.standobyte.jojo.init.power.stand.ModStandsInit;
import com.github.standobyte.jojo.power.impl.stand.StandInstance.StandPart;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;
import com.github.standobyte.jojo.power.impl.stand.type.StandType;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class InitStands {
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<Action<?>> ACTIONS = DeferredRegister.create(
            (Class<Action<?>>) ((Class<?>) Action.class), RotpSoftAndWet.MOD_ID);
    @SuppressWarnings("unchecked")
    public static final DeferredRegister<StandType<?>> STANDS = DeferredRegister.create(
            (Class<StandType<?>>) ((Class<?>) StandType.class), RotpSoftAndWet.MOD_ID);
    
 // ======================================== Soft And Wet ========================================

    public static final RegistryObject<StandEntityAction> SOFT_AND_WET_PUNCH = ACTIONS.register("soft_and_wet_punch",
            () -> new StandEntityLightAttack(new StandEntityLightAttack.Builder()
                    .punchSound(InitSounds.SOFT_AND_WET_PUNCH_LIGHT)
                    .standSound(StandEntityAction.Phase.WINDUP, InitSounds.SOFT_AND_WET_ORA)));

    public static final RegistryObject<StandEntityAction> SOFT_AND_WET_BARRAGE = ACTIONS.register("soft_and_wet_barrage",
            () -> new StandEntityMeleeBarrage(new StandEntityMeleeBarrage.Builder()
                    .barrageHitSound(InitSounds.SOFT_AND_WET_BARRAGE)
                    .standSound(InitSounds.SOFT_AND_WET_ORA_ORA_ORA)));
    
    public static final RegistryObject<StandEntityHeavyAttack> SOFT_AND_WET_COMBO_PUNCH = ACTIONS.register("soft_and_wet_combo_punch",
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .resolveLevelToUnlock(1).isTrained()
                    .punchSound(InitSounds.SOFT_AND_WET_PUNCH_HEAVY)
                    .standSound(StandEntityAction.Phase.WINDUP, InitSounds.SOFT_AND_WET_ORA_LONG)
                    .partsRequired(StandPart.ARMS)));
    
    public static final RegistryObject<StandEntityHeavyAttack> SOFT_AND_WET_HEAVY_PUNCH = ACTIONS.register("soft_and_wet_heavy_punch",
            () -> new StandEntityHeavyAttack(new StandEntityHeavyAttack.Builder()
                    .punchSound(InitSounds.SOFT_AND_WET_PUNCH_HEAVY)
                    .standSound(StandEntityAction.Phase.WINDUP, InitSounds.SOFT_AND_WET_ORA_LONG)
                    .partsRequired(StandPart.ARMS)
                    .setFinisherVariation(SOFT_AND_WET_COMBO_PUNCH)
                    .shiftVariationOf(SOFT_AND_WET_PUNCH).shiftVariationOf(SOFT_AND_WET_BARRAGE)));

    public static final RegistryObject<SoftAndWetBubbles> SOFT_AND_WET_BUBBLES = ACTIONS.register("soft_and_wet_bubbles",
            () -> new SoftAndWetBubbles(new StandEntityAction.Builder().standPerformDuration(30).standRecoveryTicks(20).staminaCostTick(3)
                    .resolveLevelToUnlock(3).isTrained()
                    .standOffsetFront().standPose(StandPose.RANGED_ATTACK).shout(InitSounds.JOSUKE_BUBBLE_SHOOT).standSound(InitSounds.SOFT_AND_WET_BUBBLES)
                    .partsRequired(StandPart.ARMS)));

    public static final RegistryObject<StandEntityAction> SOFT_AND_WET_BLOCK = ACTIONS.register("soft_and_wet_block",
            () -> new StandEntityBlock());
    
    public static final EntityStandRegistryObject<EntityStandType<StandStats>, StandEntityType<SoftAndWetEntity>> STAND_SOFT_AND_WET =
            new EntityStandRegistryObject<>("soft_and_wet",
                    STANDS, 
                    () -> new EntityStandType<StandStats>(
                            0xADD8E6, ModStandsInit.PART_8_NAME,

                            new StandAction[] {
                                    SOFT_AND_WET_PUNCH.get(),
                                    SOFT_AND_WET_BARRAGE.get()},
                            new StandAction[] {
                                    SOFT_AND_WET_BLOCK.get(),
                                    SOFT_AND_WET_BUBBLES.get()},

                            StandStats.class, new StandStats.Builder()
                            .tier(5)
                            .power(10.8)
                            .speed(13.8)
                            .range(2.4, 4.8)
                            .durability(13.8)
                            .precision(10.8)
                            .build("Soft And Wet"),

                            new StandType.StandTypeOptionals()
                            .addSummonShout(InitSounds.JOSUKE_SOFT_AND_WET)
                            .addOst(InitSounds.SOFT_AND_WET_OST)),

                    InitEntities.ENTITIES, 
                    () -> new StandEntityType<SoftAndWetEntity>(SoftAndWetEntity::new, 0.66F, 2.0F)
                    .summonSound(InitSounds.SOFT_AND_WET_SUMMON)
                    .unsummonSound(InitSounds.SOFT_AND_WET_UNSUMMON))
            .withDefaultStandAttributes();
}
