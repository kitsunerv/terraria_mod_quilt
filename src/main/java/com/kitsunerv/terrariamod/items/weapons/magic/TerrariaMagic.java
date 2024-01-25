package com.kitsunerv.terrariamod.items.weapons.magic;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TerrariaMagic {
	private static Item registerMagicItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaMagicItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Magic Items for " + TerrariaMod.MODID);
	}
}
