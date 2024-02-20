package com.skizlitmods.antbox.datagen.recipes;

import java.util.function.Consumer;

import org.jetbrains.annotations.NotNull;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(final PackOutput packOutput) {

        super(packOutput);
    }

    @Override
    protected void buildRecipes(final @NotNull RecipeOutput recipeOutput) {

    }
}
