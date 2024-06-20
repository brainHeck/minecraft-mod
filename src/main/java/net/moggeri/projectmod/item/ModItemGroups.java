package net.moggeri.projectmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.moggeri.projectmod.ProjectMod;
import net.moggeri.projectmod.block.ModBlocks;

import javax.swing.text.html.parser.Entity;

public class ModItemGroups {
    public static final ItemGroup DJACONIC_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ProjectMod.MOD_ID, "djanium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.djanium"))
                    .icon(() -> new ItemStack(ModItems.DJANIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DJANIUM);
                        entries.add(ModItems.SABAN_CRYSTAL);

                        entries.add(ModBlocks.DJANIUM_ORE);
                        entries.add(ModBlocks.SABAN_ORE);

                        entries.add(ModItems.DJANIUM_HELMET);
                        entries.add(ModItems.DJANIUM_CHESTPLATE);
                        entries.add(ModItems.DJANIUM_LEGGINGS);
                        entries.add(ModItems.DJANIUM_BOOTS);

                        entries.add(ModItems.SABAN_HELMET);
                        entries.add(ModItems.SABAN_CHESTPLATE);
                        entries.add(ModItems.SABAN_LEGGINGS);
                        entries.add(ModItems.SABAN_BOOTS);

                        entries.add(ModItems.DJANIUM_DAGGER);
                        entries.add(ModItems.DJANIUM_PICKAXE);
                        entries.add(ModItems.DJANIUM_AXE);
                        entries.add(ModItems.DJANIUM_SHOVEL);
                        entries.add(ModItems.DJANIUM_HOE);

                        entries.add(ModItems.SABAN_DAGGER);
                        entries.add(ModItems.SABAN_PICKAXE);
                        entries.add(ModItems.SABAN_AXE);
                        entries.add(ModItems.SABAN_SHOVEL);
                        entries.add(ModItems.SABAN_HOE);

                    }).build());//Dodavanje custom creative table i dodavanje itema u nju
    public static void registeritemGroups(){
        ProjectMod.LOGGER.info("Registering item Groups for"+ ProjectMod.MOD_ID);
    }
}
