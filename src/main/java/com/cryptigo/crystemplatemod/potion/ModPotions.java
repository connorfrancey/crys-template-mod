package com.cryptigo.crystemplatemod.potion;

import com.cryptigo.crystemplatemod.CrysTemplateMod;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(CrysTemplateMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        CrysTemplateMod.LOGGER.info("Registering Mod Potions for {}", CrysTemplateMod.MOD_ID);
    }
}
