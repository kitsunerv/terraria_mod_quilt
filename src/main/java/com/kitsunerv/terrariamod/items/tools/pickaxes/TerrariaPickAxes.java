package com.kitsunerv.terrariamod.items.tools.pickaxes;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TerrariaPickAxes {
	private static Item registerAxeItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaAxesItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria PickAxes Items from " + TerrariaMod.MODID);
	}
}
