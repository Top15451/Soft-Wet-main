package com.top1545.rotp_sw.entity.damaging.projectile;

import com.github.standobyte.jojo.JojoModConfig;
import com.github.standobyte.jojo.entity.damaging.projectile.ModdedProjectileEntity;
import com.github.standobyte.jojo.init.ModBlocks;
import com.top1545.rotp_sw.init.ModEntityTypes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class SoftAndWetBubbleExplosionEntity extends ModdedProjectileEntity {

    public SoftAndWetBubbleExplosionEntity(LivingEntity shooter, World world) {
        super(ModEntityTypes.SOFT_AND_WET_BUBBLE.get(), shooter, world);
    }

    public SoftAndWetBubbleExplosionEntity(EntityType<? extends SoftAndWetBubbleExplosionEntity> type, World world) {
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
    protected boolean hurtTarget(Entity target, LivingEntity owner){
        double mul = JojoModConfig.getCommonConfigInstance(false).standDamageMultiplier.get();

        level.explode(this, target.getX(),target.getY(),target.getZ(),1, Explosion.Mode.NONE);
        return target.hurt(DamageSource.explosion(owner),14* (float)mul);
    }

    @Override
    protected void onHitBlock(BlockRayTraceResult blockRayTraceResult) {
        super.onHitBlock(blockRayTraceResult);
        double mul = JojoModConfig.getCommonConfigInstance(false).standDamageMultiplier.get();
        level.explode(this, this.getX(),this.getY(),this.getZ(),2, Explosion.Mode.NONE);

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
