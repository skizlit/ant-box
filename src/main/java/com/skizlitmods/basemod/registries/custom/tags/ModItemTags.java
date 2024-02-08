package com.skizlitmods.basemod.registries.custom.tags;

import com.skizlitmods.basemod.utils.exceptions.InstantiabilityException;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    private ModItemTags() throws InstantiabilityException {

        throw new InstantiabilityException(this.getClass().getName());
    }

    private static TagKey<Item> createItemTag(String mod, String path) {

        return TagKey.create(Registries.ITEM, new ResourceLocation(mod, path));
    }
}
