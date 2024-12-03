package net.digitalrex.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.digitalrex.tutorialmod.TutorialMod;
import net.digitalrex.tutorialmod.entity.ModEntities;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;


import static net.minecraft.item.Items.register;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(PORCUPINE_SPAWN_EGG);
    }


    public static final Item PORCUPINE_SPAWN_EGG = registerItem("porcupine_spawn_egg",
            new SpawnEggItem(ModEntities.PORCUPINE, 0xa86518, 0x3b260f, new Item.Settings()));


    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
