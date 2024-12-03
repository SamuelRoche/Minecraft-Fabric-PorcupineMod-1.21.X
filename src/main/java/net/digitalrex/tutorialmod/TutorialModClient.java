package net.digitalrex.tutorialmod;

import net.digitalrex.tutorialmod.entity.ModEntities;
import net.digitalrex.tutorialmod.entity.client.ModelLayers;
import net.digitalrex.tutorialmod.entity.client.PorcupineModel;
import net.digitalrex.tutorialmod.entity.client.PorcupineRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);
    }
}
