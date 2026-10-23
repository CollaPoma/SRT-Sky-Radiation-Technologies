/*
 * Copyright (c) 2026 CollaPoma (Sky Forces / SRT: Sky Radiation Technologies)
 * Licensed under the MIT License. Keep this notice and credit the author.
 */
package com.skyforces.srt.items;

import com.skyforces.srt.tabs.TabSRT;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class ItemSpeedRing extends Item{
    public ItemSpeedRing() {
        super(new Properties().tab(TabSRT.TAB)
                .tab(TabSRT.TAB)
                .rarity(Rarity.RARE)
        );
    }
}