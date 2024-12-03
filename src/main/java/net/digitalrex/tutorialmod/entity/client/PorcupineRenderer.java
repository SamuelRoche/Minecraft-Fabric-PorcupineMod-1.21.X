package net.digitalrex.tutorialmod.entity.client;

import net.digitalrex.tutorialmod.TutorialMod;
import net.digitalrex.tutorialmod.entity.custom.PorcupineEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class PorcupineRenderer extends MobEntityRenderer<PorcupineEntity, PorcupineModel<PorcupineEntity>> {
    private static final Identifier TEXTURE = Identifier.of(TutorialMod.MOD_ID, "textures/entity/porcupine.png");

    public PorcupineRenderer(EntityRendererFactory.Context context) {
        super(context, new PorcupineModel<>(context.getPart(ModelLayers.PORCUPINE)), 0.6f);
    }

    @Override
    public Identifier getTexture(PorcupineEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(PorcupineEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        if(livingEntity.isBaby())
        {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        }
        else{
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
