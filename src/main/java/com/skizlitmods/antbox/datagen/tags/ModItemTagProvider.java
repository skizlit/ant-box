package com.skizlitmods.antbox.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import com.skizlitmods.antbox.BaseMod;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(final PackOutput packOutput, final CompletableFuture<HolderLookup.Provider> provider, final CompletableFuture<TagLookup<Block>> blockTagsProvider, final @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, provider, blockTagsProvider, BaseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(final @NotNull HolderLookup.Provider provider) {

    }
}
