package com.top1545.rotp_sw.init;

import java.util.function.Supplier;

import com.top1545.rotp_sw.RotpSoftAndWet;
import com.github.standobyte.jojo.util.mc.OstSoundList;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RotpSoftAndWet.MOD_ID);
    
    public static final RegistryObject<SoundEvent> JOSUKE_SOFT_AND_WET = SOUNDS.register("josuke_soft_and_wet",
            () -> new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID, "josuke_soft_and_wet")));

    public static final RegistryObject<SoundEvent> JOSUKE_BUBBLE_SHOOT = SOUNDS.register("josuke_bubble_shoot",
            () -> new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID, "josuke_bubble_shoot")));

    public static final Supplier<SoundEvent> SOFT_AND_WET_SUMMON = SOUNDS.register("soft_and_wet_summon",
            ()->new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID,"soft_and_wet_summon")));

    public static final Supplier<SoundEvent> SOFT_AND_WET_UNSUMMON = SOUNDS.register("soft_and_wet_unsummon",
            ()->new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID,"soft_and_wet_unsummon")));

    public static final Supplier<SoundEvent> SOFT_AND_WET_BUBBLES = SOUNDS.register("soft_and_wet_bubbles",
            ()->new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID,"soft_and_wet_bubbles")));

    public static final Supplier<SoundEvent> SOFT_AND_WET_PUNCH_LIGHT = SOUNDS.register("soft_and_wet_punch",
            ()->new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID,"soft_and_wet_punch")));

    public static final Supplier<SoundEvent> SOFT_AND_WET_PUNCH_HEAVY = SOUNDS.register("soft_and_wet_punch_heavy",
            ()->new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID,"soft_and_wet_punch_heavy")));

    public static final Supplier<SoundEvent> SOFT_AND_WET_BARRAGE = InitSounds.SOFT_AND_WET_PUNCH_LIGHT;

    public static final RegistryObject<SoundEvent> SOFT_AND_WET_ORA = SOUNDS.register("soft_and_wet_ora",
            () -> new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID, "soft_and_wet_ora")));

    public static final RegistryObject<SoundEvent> SOFT_AND_WET_ORA_LONG = SOUNDS.register("soft_and_wet_ora_long",
            () -> new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID, "soft_and_wet_ora_long")));
    
    public static final RegistryObject<SoundEvent> SOFT_AND_WET_ORA_ORA_ORA = SOUNDS.register("soft_and_wet_ora_ora_ora",
            () -> new SoundEvent(new ResourceLocation(RotpSoftAndWet.MOD_ID, "soft_and_wet_ora_ora_ora")));
    
    static final OstSoundList SOFT_AND_WET_OST = new OstSoundList(new ResourceLocation(RotpSoftAndWet.MOD_ID, "soft_and_wet_ost"), SOUNDS);

}
