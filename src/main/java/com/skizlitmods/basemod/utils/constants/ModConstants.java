package com.skizlitmods.basemod.utils.constants;

import com.skizlitmods.basemod.BaseMod;
import com.skizlitmods.basemod.utils.exceptions.InstantiabilityException;

public class ModConstants {

    private ModConstants() throws InstantiabilityException {

        throw new InstantiabilityException(this.getClass().getName());
    }

    // Translation Strings
    public static final String CREATIVE_TAB_TRANSLATION = "creativetab." + BaseMod.MOD_ID;
}
