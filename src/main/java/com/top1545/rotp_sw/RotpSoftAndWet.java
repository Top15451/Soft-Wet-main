package com.top1545.rotp_sw;

import com.top1545.rotp_sw.init.ModEntityTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.top1545.rotp_sw.init.InitEntities;
import com.top1545.rotp_sw.init.InitSounds;
import com.top1545.rotp_sw.init.InitStands;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RotpSoftAndWet.MOD_ID)
public class RotpSoftAndWet {
    public static final String MOD_ID = "rotp_sw";
    private static final Logger LOGGER = LogManager.getLogger();

    public RotpSoftAndWet() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        InitEntities.ENTITIES.register(modEventBus);
        InitSounds.SOUNDS.register(modEventBus);
        InitStands.ACTIONS.register(modEventBus);
        InitStands.STANDS.register(modEventBus);

        ModEntityTypes.ENTITIES.register(modEventBus);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
