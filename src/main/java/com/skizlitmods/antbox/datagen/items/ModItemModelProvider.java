package com.skizlitmods.antbox.datagen.items;

import com.skizlitmods.antbox.AntBox;
import com.skizlitmods.antbox.registries.minecraft.ModItems;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(final PackOutput packOutput, final ExistingFileHelper existingFileHelper) {

        super(packOutput, AntBox.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        registerBasicItem(ModItems.ANT_QUEEN_BLACK);
        registerBasicItem(ModItems.TEST_TUBE_EMPTY);
    }

    private ItemModelBuilder registerBasicItem(final RegistryObject<Item> item) {

        return withExistingParent(item.getId().getPath(),
                                  new ResourceLocation("item/generated")).texture("layer0",
                                                                                  new ResourceLocation(AntBox.MOD_ID, "item/" + item.getId().getPath()));
    }
}
