package com.top1545.rotp_sw.entity.damaging.projectile;

import com.github.standobyte.jojo.entity.damaging.projectile.ModdedProjectileEntity;
import com.github.standobyte.jojo.init.ModStatusEffects;
import com.top1545.rotp_sw.init.ModEntityTypes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.World;

public class SoftAndWetBubblesStunEntity extends ModdedProjectileEntity {

    public SoftAndWetBubblesStunEntity(LivingEntity shooter, World world) {
        super(ModEntityTypes.SOFT_AND_WET_BUBBLE.get(), shooter, world);
    }

    public SoftAndWetBubblesStunEntity(EntityType<? extends SoftAndWetBubblesStunEntity> type, World world) {
        super(type, world);
    }

    @Override
    public boolean standDamage() {
        return true;
    }

    @Override
    public float getBaseDamage() {
        return 0.5F;
    }

    @Override
    protected float getMaxHardnessBreakable() {
        return 0.0F;
    }

    @Override
    public int ticksLifespan() {
        return 100;
    }

    @Override
    protected void afterEntityHit(EntityRayTraceResult entityRayTraceResult, boolean entityHurt){
        Entity entity = entityRayTraceResult.getEntity();
        if(entity instanceof LivingEntity){
            LivingEntity living = (LivingEntity) entity;
            living.addEffect(new EffectInstance(ModStatusEffects.STUN.get(),80,1));
        }
    }

    @Override
    protected void addAdditionalSaveData(CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
    }

    @Override
    protected void readAdditionalSaveData(CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
    }

    @Override
    public void writeSpawnData(PacketBuffer buffer) {
        super.writeSpawnData(buffer);
    }

    @Override
    public void readSpawnData(PacketBuffer additionalData) {
        super.readSpawnData(additionalData);
    }
}
