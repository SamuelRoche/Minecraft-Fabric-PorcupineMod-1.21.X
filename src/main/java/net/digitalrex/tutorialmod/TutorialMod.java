package net.digitalrex.tutorialmod;

import net.digitalrex.tutorialmod.entity.ModEntities;
import net.digitalrex.tutorialmod.entity.custom.PorcupineEntity;
import net.digitalrex.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.digitalrex.tutorialmod.entity.ModEntities.registerModEntities;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		registerModEntities();
		ModItems.registerModItems();
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
	}
}