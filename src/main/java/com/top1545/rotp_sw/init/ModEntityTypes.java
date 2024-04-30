package com.top1545.rotp_sw.init;

import com.top1545.rotp_sw.RotpSoftAndWet;
import com.top1545.rotp_sw.entity.damaging.projectile.SoftAndWetBubbleEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber(modid = RotpSoftAndWet.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, RotpSoftAndWet.MOD_ID);
    
    public static final RegistryObject<EntityType<SoftAndWetBubbleEntity>> SOFT_AND_WET_BUBBLE = ENTITIES.register("soft_and_wet_bubble", 
            () -> EntityType.Builder.<SoftAndWetBubbleEntity>of(SoftAndWetBubbleEntity::new, EntityClassification.MISC).sized(0.15F, 0.15F).setUpdateInterval(10)
            .build(new ResourceLocation(RotpSoftAndWet.MOD_ID, "soft_and_wet_bubble").toString()));
}

