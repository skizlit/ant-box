package com.skizlitmods.antbox.utils.constants;

import com.skizlitmods.antbox.BaseMod;
import com.skizlitmods.antbox.utils.exceptions.InstantiabilityException;

public class ModConstants {

    private ModConstants() throws InstantiabilityException {

        throw new InstantiabilityException(this.getClass().getName());
    }

    // Translation Strings
    public static final String CREATIVE_TAB_TRANSLATION = "creativetab." + BaseMod.MOD_ID;
}
