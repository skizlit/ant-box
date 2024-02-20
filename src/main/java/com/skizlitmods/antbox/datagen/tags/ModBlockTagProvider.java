package com.skizlitmods.antbox.datagen.tags;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.skizlitmods.antbox.BaseMod;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(final PackOutput packOutput, final CompletableFuture<HolderLookup.Provider> provider, final @Nullable ExistingFileHelper existingFileHelper) {

        super(packOutput, provider, BaseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(final @NotNull HolderLookup.Provider provider) {

    }
}
