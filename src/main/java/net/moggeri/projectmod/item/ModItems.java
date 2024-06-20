package net.moggeri.projectmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moggeri.projectmod.ProjectMod;

public class ModItems {

    public static final Item DJANIUM = registerItem("djanium", new Item(new FabricItemSettings()));
    //Djanium registrovan kao item koji postoji

    public static final Item SABAN_CRYSTAL = registerItem("saban_crystal", new Item(new FabricItemSettings()));
    //Saban kristal item


    public static final Item DJANIUM_PICKAXE = registerItem("djanium_pickaxe",
            new PickaxeItem(ModToolMaterial.DJANIUM,2,3f, new FabricItemSettings()));
    public static final Item DJANIUM_AXE = registerItem("djanium_axe",
            new AxeItem(ModToolMaterial.DJANIUM,2,3f, new FabricItemSettings()));
    public static final Item DJANIUM_HOE = registerItem("djanium_hoe",
            new HoeItem(ModToolMaterial.DJANIUM,1,2f, new FabricItemSettings()));
    public static final Item DJANIUM_SHOVEL = registerItem("djanium_shovel",
            new ShovelItem(ModToolMaterial.DJANIUM,2,2f, new FabricItemSettings()));
    public static final Item DJANIUM_DAGGER = registerItem("djanium_dagger",
            new SwordItem(ModToolMaterial.DJANIUM,4,3f, new FabricItemSettings()));

    public static final Item SABAN_PICKAXE = registerItem("saban_pickaxe",
            new PickaxeItem(ModToolMaterial.SABAN_CRYSTAL,2,3f, new FabricItemSettings()));
    public static final Item SABAN_AXE = registerItem("saban_axe",
            new AxeItem(ModToolMaterial.SABAN_CRYSTAL,2,3f, new FabricItemSettings()));
    public static final Item SABAN_HOE = registerItem("saban_hoe",
            new HoeItem(ModToolMaterial.SABAN_CRYSTAL,1,2f, new FabricItemSettings()));
    public static final Item SABAN_SHOVEL = registerItem("saban_shovel",
            new ShovelItem(ModToolMaterial.SABAN_CRYSTAL,2,2f, new FabricItemSettings()));
    public static final Item SABAN_DAGGER = registerItem("saban_dagger",
            new SwordItem(ModToolMaterial.SABAN_CRYSTAL,4,3f, new FabricItemSettings()));



    public static final Item SABAN_HELMET = registerItem("saban_helmet",
            new ArmorItem(ModArmorMaterials.SABAN_CRYSTAL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SABAN_CHESTPLATE = registerItem("saban_chestplate",
            new ArmorItem(ModArmorMaterials.SABAN_CRYSTAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SABAN_LEGGINGS = registerItem("saban_leggings",
            new ArmorItem(ModArmorMaterials.SABAN_CRYSTAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SABAN_BOOTS = registerItem("saban_boots",
            new ArmorItem(ModArmorMaterials.SABAN_CRYSTAL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item DJANIUM_HELMET = registerItem("djanium_helmet",
            new ArmorItem(ModArmorMaterials.DJANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DJANIUM_CHESTPLATE = registerItem("djanium_chestplate",
            new ArmorItem(ModArmorMaterials.DJANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DJANIUM_LEGGINGS = registerItem("djanium_leggings",
            new ArmorItem(ModArmorMaterials.DJANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DJANIUM_BOOTS = registerItem("djanium_boots",
            new ArmorItem(ModArmorMaterials.DJANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM , new Identifier(ProjectMod.MOD_ID, name), item);
    }//funkcija za registrovanje itema

    public static void registerModItems() {
        ProjectMod.LOGGER.info("Registering Mod Items for " + ProjectMod.MOD_ID);
    }//registrovanje postojanja itema + kreativ tabova

}
