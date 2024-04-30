package com.top1545.rotp_sw.client.render.entity.renderer.damaging.projectile;

import com.top1545.rotp_sw.RotpSoftAndWet;
import com.top1545.rotp_sw.client.render.entity.model.projectile.SoftAndWetBubbleModel;
import com.github.standobyte.jojo.client.render.entity.renderer.SimpleEntityRenderer;
import com.top1545.rotp_sw.entity.damaging.projectile.SoftAndWetBubbleEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class SoftAndWetBubbleRenderer extends SimpleEntityRenderer<SoftAndWetBubbleEntity, SoftAndWetBubbleModel> {

    public SoftAndWetBubbleRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SoftAndWetBubbleModel(), new ResourceLocation(RotpSoftAndWet.MOD_ID, "textures/entity/projectiles/sw_bubble.png"));
    }

}
