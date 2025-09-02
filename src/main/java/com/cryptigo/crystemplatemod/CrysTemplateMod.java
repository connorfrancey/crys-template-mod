package com.cryptigo.crystemplatemod;

import com.cryptigo.crystemplatemod.block.ModBlocks;
import com.cryptigo.crystemplatemod.component.ModDataComponentTypes;
import com.cryptigo.crystemplatemod.item.ModItemGroups;
import com.cryptigo.crystemplatemod.item.ModItems;
import com.cryptigo.crystemplatemod.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrysTemplateMod implements ModInitializer {
	public static final String MOD_ID = "crystemplatemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModDataComponentTypes.registerDataComponentTypes();
		ModSounds.registerSounds();
	}
}