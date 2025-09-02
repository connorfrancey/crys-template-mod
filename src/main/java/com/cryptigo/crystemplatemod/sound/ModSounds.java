package com.cryptigo.crystemplatemod.sound;

import com.cryptigo.crystemplatemod.CrysTemplateMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(CrysTemplateMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        CrysTemplateMod.LOGGER.info("Registering Mod Sounds for {}", CrysTemplateMod.MOD_ID);
    }
}
