package net.moggeri.projectmod.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.moggeri.projectmod.ProjectMod;

public class ModModelLayers {

    public static final EntityModelLayer GOLEM =
            new EntityModelLayer(new Identifier(ProjectMod.MOD_ID,  "golem"), "main");

}
