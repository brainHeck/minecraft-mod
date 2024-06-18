package net.moggeri.projectmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.moggeri.projectmod.block.ModBlocks;
import net.moggeri.projectmod.entity.ModEntities;
import net.moggeri.projectmod.entity.custom.GolemEntity;
import net.moggeri.projectmod.item.ModItemGroups;
import net.moggeri.projectmod.item.ModItems;
import net.moggeri.projectmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectMod implements ModInitializer {
	public static final String MOD_ID = "projectmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registeritemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

		FabricDefaultAttributeRegistry.register(ModEntities.GOLEM, GolemEntity.createGolemAttributes());
	}

}