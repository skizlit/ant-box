package com.skizlitmods.basemod.datagen.items;

import com.skizlitmods.basemod.BaseMod;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(final PackOutput packOutput, final ExistingFileHelper existingFileHelper) {

        super(packOutput, BaseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //        registerBasicItem(ModItems.SAPPHIRE);
    }

    private ItemModelBuilder registerBasicItem(final RegistryObject<Item> item) {

        return withExistingParent(item.getId().getPath(),
                                  new ResourceLocation("item/generated")).texture("layer0",
                                                                                  new ResourceLocation(BaseMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
