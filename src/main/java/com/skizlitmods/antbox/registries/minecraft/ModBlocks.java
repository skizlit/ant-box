package com.skizlitmods.antbox.registries.minecraft;

import java.util.function.Supplier;

import com.skizlitmods.antbox.AntBox;
import com.skizlitmods.antbox.registries.custom.blocks.ExampleAdvancedBlock;
import com.skizlitmods.antbox.utils.exceptions.InstantiabilityException;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntBox.MOD_ID);

    /* Template
        public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
     */

    public static final RegistryObject<ExampleAdvancedBlock> EXAMPLE_ADVANCED_BLOCK = BLOCKS.register("example_advanced_block",
                                                                                                      () -> new ExampleAdvancedBlock(BlockBehaviour.Properties.copy(Blocks.ANVIL)
                                                                                                                                                              .mapColor(MapColor.TERRACOTTA_YELLOW)
                                                                                                                                                              .strength(5.0f, 15f)
                                                                                                                                                              .noLootTable()
                                                                                                      ));

    private ModBlocks() throws InstantiabilityException {

        throw new InstantiabilityException(this.getClass().getName());
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {

        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
    }
}
