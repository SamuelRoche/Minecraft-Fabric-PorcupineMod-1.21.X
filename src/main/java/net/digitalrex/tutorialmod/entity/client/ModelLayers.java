package net.digitalrex.tutorialmod.entity.client;

import net.digitalrex.tutorialmod.TutorialMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer( Identifier.of(TutorialMod.MOD_ID, "porcupine"), "main");
}
