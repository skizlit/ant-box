package com.skizlitmods.antbox.registries.custom.blocks.entity;

import java.util.function.Supplier;

import com.skizlitmods.antbox.AntBox;
import com.skizlitmods.antbox.registries.minecraft.ModBlocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AntBox.MOD_ID);

    public static final RegistryObject<BlockEntityType<ExampleAdvancedBlockEntity>> EXAMPLE_ADVANCED_BLOCK =
            BLOCK_ENTITIES.register("example_advanced_block",
                                    () -> BlockEntityType.Builder.of(ExampleAdvancedBlockEntity::new, ModBlocks.EXAMPLE_ADVANCED_BLOCK.get())
                                                                 .build(null));

    public static void register(IEventBus eventBus) {

        BLOCK_ENTITIES.register(eventBus);
    }
}
