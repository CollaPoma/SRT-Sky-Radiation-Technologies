/*
 * Copyright (c) 2026 CollaPoma (Sky Forces / SRT: Sky Radiation Technologies)
 * Licensed under the MIT License. Keep this notice and credit the author.
*/
package com.skyforces.srt;

import com.skyforces.srt.items.ItemFlightRing;
import com.skyforces.srt.items.ItemNightVisionRing;
import com.skyforces.srt.items.ItemSpeedRing;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(SRTMod.MODID)
public class SRTMod {
    public static final String MODID = "srt";

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item> FLIGHT_RING = ITEMS.register("flight_ring", ItemFlightRing::new);
    public static final RegistryObject<Item> NIGHT_VISION_RING = ITEMS.register("night_vision_ring", ItemNightVisionRing::new);
    public static final RegistryObject<Item> SPEED_RING = ITEMS.register("speed_ring", ItemSpeedRing::new);

    public SRTMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modEventBus);
    }
}