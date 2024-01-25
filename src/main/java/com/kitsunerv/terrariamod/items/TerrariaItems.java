package com.kitsunerv.terrariamod.items;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TerrariaItems {
	private static Item registerItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Items for " + TerrariaMod.MODID);
	}
}
