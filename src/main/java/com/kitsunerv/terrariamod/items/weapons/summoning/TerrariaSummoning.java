package com.kitsunerv.terrariamod.items.weapons.summoning;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TerrariaSummoning {
	private static Item registerSummonItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaSummonItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Summoning Items for " + TerrariaMod.MODID);
	}
}
