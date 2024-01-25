package com.kitsunerv.terrariamod.items.tools.multitools;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TerrariaMultiTools {
	private static Item registerMultiToolItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaMultiToolsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria MultiTools Items from " + TerrariaMod.MODID);
	}
}
