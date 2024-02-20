package com.skizlitmods.antbox.datagen.loottables;

import com.skizlitmods.antbox.AntBox;
import com.skizlitmods.antbox.registries.minecraft.ModItems;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, AntBox.MOD_ID);
    }

    @Override
    protected void start() {
        add("ant_queen_black_from_grass_block", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS_BLOCK).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.ANT_QUEEN_BLACK.get()));

        add("ant_queen_black_from_stone", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.STONE).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.ANT_QUEEN_BLACK.get()));
    }
}
