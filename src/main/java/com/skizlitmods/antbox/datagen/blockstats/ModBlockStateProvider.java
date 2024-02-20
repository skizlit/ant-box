package com.skizlitmods.antbox.datagen.blockstats;

import com.skizlitmods.antbox.BaseMod;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(final PackOutput packOutput, final ExistingFileHelper existingFileHelper) {

        super(packOutput, BaseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
    }

    private void blockWithItem(final RegistryObject<Block> blockRegistryObject) {

        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
