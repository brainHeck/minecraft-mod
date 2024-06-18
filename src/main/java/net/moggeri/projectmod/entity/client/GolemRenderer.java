package net.moggeri.projectmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.moggeri.projectmod.ProjectMod;
import net.moggeri.projectmod.entity.custom.GolemEntity;

public class GolemRenderer extends MobEntityRenderer<GolemEntity, GolemModel<GolemEntity>> {
    private static final Identifier TEXTURE = new Identifier(ProjectMod.MOD_ID, "textures/entity/golem.png");

    public GolemRenderer(EntityRendererFactory.Context context) {
        super(context, new GolemModel<>(context.getPart(ModModelLayers.GOLEM)), 0.6f);
    }

    @Override
    public Identifier getTexture(GolemEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(GolemEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby())
        {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
