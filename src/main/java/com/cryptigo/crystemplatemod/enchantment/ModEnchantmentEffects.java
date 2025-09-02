package com.cryptigo.crystemplatemod.enchantment;

import com.cryptigo.crystemplatemod.CrysTemplateMod;
import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {

    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(CrysTemplateMod.MOD_ID, name), codec);
    }

    public static void registerEnchantmentEffects() {
        CrysTemplateMod.LOGGER.info("Registering Mod Enchantment Effects for {}", CrysTemplateMod.MOD_ID);
    }
}
