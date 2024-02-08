package com.skizlitmods.basemod.registries.custom.tags;

import com.skizlitmods.basemod.utils.exceptions.InstantiabilityException;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class ModBlockTags {

    private ModBlockTags() throws InstantiabilityException {

        throw new InstantiabilityException(this.getClass().getName());
    }

    private static TagKey<Block> createBlockTag(String mod, String path) {

        return TagKey.create(Registries.BLOCK, new ResourceLocation(mod, path));
    }
}
