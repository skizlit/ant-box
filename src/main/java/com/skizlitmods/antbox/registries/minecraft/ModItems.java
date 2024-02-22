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

    // Ant Queen Types
    public static final RegistryObject<Item> ANT_QUEEN_BLACK = ITEMS.register("ant_queen_black",
                                                                              () -> new Item(new Item.Properties()));

    // Test Tube Types
    public static final RegistryObject<Item> TEST_TUBE_EMPTY = ITEMS.register("test_tube_empty",
                                                                              () -> new Item(new Item.Properties()));

    // Used only as a placeholder for the creative tab image.
    public static final RegistryObject<Item> TabImage = ANT_QUEEN_BLACK;

    private ModItems() throws InstantiabilityException {

        throw new InstantiabilityException(this.getClass().getName());
    }

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
