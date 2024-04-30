package com.top1545.rotp_sw.client;

import com.top1545.rotp_sw.client.render.entity.renderer.stand.SoftAndWetRenderer;
import com.top1545.rotp_sw.client.render.entity.renderer.damaging.projectile.SoftAndWetBubbleRenderer;
import com.top1545.rotp_sw.init.ModEntityTypes;
import com.top1545.rotp_sw.init.AddonStands;
import com.top1545.rotp_sw.RotpSoftAndWet;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = RotpSoftAndWet.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientInit {
    
    @SubscribeEvent
    public static void onFMLClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(AddonStands.SOFT_AND_WET.getEntityType(), SoftAndWetRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SOFT_AND_WET_BUBBLE.get(), SoftAndWetBubbleRenderer::new);
    }
}
