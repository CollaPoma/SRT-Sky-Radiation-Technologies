/*
 * Copyright (c) 2026 CollaPoma (Sky Forces / SRT: Sky Radiation Technologies)
 * Licensed under the MIT License. Keep this notice and credit the author.
*/
package com.skyforces.srt.tabs;

import com.skyforces.srt.SRTMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TabSRT extends ItemGroup {
    public static final TabSRT TAB = new TabSRT();

    public TabSRT() {
        super("srt_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(SRTMod.FLIGHT_RING.get());
    }

}