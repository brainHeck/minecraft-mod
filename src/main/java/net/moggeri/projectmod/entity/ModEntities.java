package net.moggeri.projectmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.moggeri.projectmod.ProjectMod;
import net.moggeri.projectmod.entity.custom.GolemEntity;

public class ModEntities {
    public static final EntityType<GolemEntity> GOLEM = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(ProjectMod.MOD_ID, "golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GolemEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());
}
