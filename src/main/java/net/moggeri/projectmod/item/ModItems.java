package net.moggeri.projectmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
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
            new PickaxeItem(ModToolMaterial.DJANIUM,2,4f, new FabricItemSettings()));



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
