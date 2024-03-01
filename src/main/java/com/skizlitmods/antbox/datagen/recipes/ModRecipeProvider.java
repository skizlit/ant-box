package com.skizlitmods.antbox.datagen.recipes;

import org.jetbrains.annotations.NotNull;

import com.skizlitmods.antbox.registries.minecraft.ModItems;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(final PackOutput packOutput) {

        super(packOutput);
    }

    @Override
    protected void buildRecipes(final @NotNull RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TEST_TUBE_EMPTY.get(), 6)
                           .pattern("   ")
                           .pattern("S S")
                           .pattern(" S ")
                           .define('S', Tags.Items.GLASS_PANES)
                           .unlockedBy(getHasName(Items.GLASS_PANE), has(Tags.Items.GLASS_PANES))
                           .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TEST_TUBE_FOUNDED.get(), 1)
                              .requires(ModItems.TEST_TUBE_EMPTY.get())
                              .requires(ModItems.ANT_QUEEN_BLACK.get())
                              .unlockedBy(getHasName(ModItems.TEST_TUBE_EMPTY.get()), has(ModItems.TEST_TUBE_EMPTY.get()))
                              .unlockedBy(getHasName(ModItems.ANT_QUEEN_BLACK.get()), has(ModItems.ANT_QUEEN_BLACK.get()))
                              .save(recipeOutput);
    }
}
