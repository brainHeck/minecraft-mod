package net.moggeri.projectmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.moggeri.projectmod.block.ModBlocks;
import net.moggeri.projectmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SABAN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DJANIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DJANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABAN_CRYSTAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.DJANIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DJANIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DJANIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DJANIUM_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.SABAN_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABAN_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABAN_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABAN_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.SABAN_DAGGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABAN_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABAN_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABAN_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABAN_HOE, Models.GENERATED);

        itemModelGenerator.register(ModItems.DJANIUM_DAGGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DJANIUM_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DJANIUM_AXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DJANIUM_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DJANIUM_HOE, Models.GENERATED);

    }
}
