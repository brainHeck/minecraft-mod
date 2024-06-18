package net.moggeri.projectmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.moggeri.projectmod.entity.ModEntities;
import net.moggeri.projectmod.entity.client.GolemModel;
import net.moggeri.projectmod.entity.client.GolemRenderer;
import net.moggeri.projectmod.entity.client.ModModelLayers;

public class ProjectModClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.GOLEM, GolemRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GOLEM, GolemModel::getTexturedModelData);
    }
}
