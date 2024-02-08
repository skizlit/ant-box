package com.skizlitmods.basemod.registries.custom.tags;

import com.skizlitmods.basemod.utils.exceptions.InstantiabilityException;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class ModFluidTags {

    private ModFluidTags() throws InstantiabilityException {

        throw new InstantiabilityException(this.getClass().getName());
    }

    private static TagKey<Fluid> createFluidTag(String mod, String path) {

        return TagKey.create(Registries.FLUID, new ResourceLocation(mod, path));
    }
}
