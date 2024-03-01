package com.skizlitmods.antbox.registries.custom.blocks.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import com.skizlitmods.antbox.AntBox;

public class ExampleAdvancedBlockEntity extends BlockEntity {
    private int counter;

    public ExampleAdvancedBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.EXAMPLE_ADVANCED_BLOCK.get(), pos, state);
    }

    @Override
    public void load(@NotNull CompoundTag nbt) {
        super.load(nbt);

        var AntBoxModData = nbt.getCompound(AntBox.MOD_ID);
        this.counter = AntBoxModData.getInt("Counter");
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag nbt) {
        super.saveAdditional(nbt);

        var AntBoxModData = new CompoundTag();
        AntBoxModData.putInt("Counter", this.counter);
        nbt.put(AntBox.MOD_ID, AntBoxModData);
    }

    public int incrementCounter() {
        this.counter++;
        setChanged();
        return this.counter;
    }

    public int getCounter() {
        return this.counter;
    }
}
