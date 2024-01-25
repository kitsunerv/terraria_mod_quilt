package com.kitsunerv.terrariamod.items.critters;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TerrariaCritters {
	private static Item registerCritterItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaCrittersItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Critters Items from " + TerrariaMod.MODID);
	}
}
