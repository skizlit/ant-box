package com.skizlitmods.antbox.registries.minecraft;

import com.skizlitmods.antbox.AntBox;
import com.skizlitmods.antbox.utils.exceptions.InstantiabilityException;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntBox.MOD_ID);

    // Used only as a placeholder for the creative tab image.
    public static final RegistryObject<Item> TabImage = null;

    /* Template
        public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
     */

    private ModItems() throws InstantiabilityException {

        throw new InstantiabilityException(this.getClass().getName());
    }

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
