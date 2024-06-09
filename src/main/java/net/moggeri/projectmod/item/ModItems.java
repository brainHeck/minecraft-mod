package net.moggeri.projectmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moggeri.projectmod.ProjectMod;
public class ModItems {

    public static final Item DJANIUM = registerItem("djanium", new Item(new FabricItemSettings()));
    //Djanium registrovan kao item koji postoji
    public static final Item SABAN_CRYSTAL = registerItem("saban_crystal", new Item(new FabricItemSettings()));

    /*private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(DJANIUM);
        entries.add(SABAN_CRYSTAL);
    }//Dodavanje itema u Ingredients creativ tabove*/
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM , new Identifier(ProjectMod.MOD_ID, name), item);
    }//funkcija za registrovanje itema
    public static void registerModItems() {
        ProjectMod.LOGGER.info("Registering Mod Items for " + ProjectMod.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup); OVO JE ZA DODAVANJE U INGREDIENTS KREATIV TAB, NIJE POTREBNO AKO IMA CUSTOM
    }//registrovanje postojanja itema + kreativ tabova

}
