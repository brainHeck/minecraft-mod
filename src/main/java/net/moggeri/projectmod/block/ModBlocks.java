package net.moggeri.projectmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moggeri.projectmod.ProjectMod;

public class ModBlocks {
    public static final Block DJANIUM_ORE = registerBlock("djanium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block SABAN_ORE = registerBlock("saban_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ProjectMod.MOD_ID, name), block);
    }//Registrovanje samih blokova
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(ProjectMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }//Registrovanje blokova kao item
    public static void registerModBlocks(){
        ProjectMod.LOGGER.info("Registering ModBlocks for" + ProjectMod.MOD_ID);
    }
}
