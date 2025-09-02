package com.cryptigo.crystemplatemod.item;

import com.cryptigo.crystemplatemod.CrysTemplateMod;
import com.cryptigo.crystemplatemod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CRYSTEMPLATEMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CrysTemplateMod.MOD_ID, "crystemplatemod"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TEST_ITEM))
                    .displayName(Text.translatable("itemGroup.crystemplatemod"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TEST_ITEM);
                        entries.add(ModBlocks.TEST_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        CrysTemplateMod.LOGGER.info("Registering Item Groups for {}", CrysTemplateMod.MOD_ID);
    }
}
