/*
 * Copyright (c) 2026 CollaPoma (Sky Forces / SRT: Sky Radiation Technologies)
 * Licensed under the MIT License. Keep this notice and credit the author.
*/
package com.skyforces.srt.utils;

import com.skyforces.srt.SRTMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SRTMod.MODID)
public class RingHandler {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if(event.phase == TickEvent.Phase.END && !event.player.level.isClientSide) {
            PlayerEntity player = event.player;

            boolean hasFlightRing = false;
            boolean hasNightVisionRing = false;
            boolean hasSpeedRing = false;

            for(ItemStack stack : player.inventory.items) {
                if(stack.getItem() == SRTMod.FLIGHT_RING.get()) {
                    hasFlightRing = true;
                }
                if(stack.getItem() == SRTMod.NIGHT_VISION_RING.get()) {
                    hasNightVisionRing = true;
                }
                if(stack.getItem() == SRTMod.SPEED_RING.get()) {
                    hasSpeedRing = true;
                }
            }

            if (hasFlightRing) {
                player.abilities.mayfly = true;

                if (!player.isOnGround() && !player.abilities.flying) {
                    player.abilities.flying = true;
                }
            } else {
                player.abilities.mayfly = false;
                if (player.abilities.flying) {
                    player.abilities.flying = false;
                }
            }
            player.onUpdateAbilities();

            if(hasNightVisionRing) {
                player.addEffect(new EffectInstance(Effects.NIGHT_VISION, 220, 0, false, false));
            }

            if(hasSpeedRing) {
                player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 220, 1, false, false));
            }
        }
    }
}
