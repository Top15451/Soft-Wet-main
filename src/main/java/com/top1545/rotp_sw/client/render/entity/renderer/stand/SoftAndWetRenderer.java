package com.top1545.rotp_sw.client.render.entity.renderer.stand;

import com.top1545.rotp_sw.RotpSoftAndWet;
import com.top1545.rotp_sw.client.render.entity.model.stand.SoftAndWetModel;
import com.top1545.rotp_sw.entity.stand.stands.SoftAndWetEntity;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class SoftAndWetRenderer extends StandEntityRenderer<SoftAndWetEntity, SoftAndWetModel> {
    
    public SoftAndWetRenderer(EntityRendererManager renderManager) {
        super(renderManager, new SoftAndWetModel(), new ResourceLocation(RotpSoftAndWet.MOD_ID, "textures/entity/stand/soft_and_wet.png"), 0);
    }
}
