package com.skizlitmods.antbox.registries.minecraft;

import com.skizlitmods.antbox.BaseMod;
import com.skizlitmods.antbox.utils.constants.ModConstants;
import com.skizlitmods.antbox.utils.exceptions.InstantiabilityException;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BaseMod.MOD_ID);

    // Template
    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB =
            CREATIVE_MODE_TABS.register(BaseMod.MOD_ID,
                                        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TabImage.get()))
                                                             .title(Component.translatable(ModConstants.CREATIVE_TAB_TRANSLATION))
                                                             .displayItems((parameters, output) -> {
                                                                 // TO DO: Add tab items in order of display preference.
                                                                 // pOutput.accept(ModItems.SAPPHIRE.get());
                                                             })
                                                             .build());

    private ModCreativeModeTabs() throws InstantiabilityException {

        throw new InstantiabilityException(this.getClass().getName());
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
