package com.kitsunerv.terrariamod.items.weapons.guns;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TerrariaGuns {
	private static Item registerGunItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaGunsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Guns Items for " + TerrariaMod.MODID);
	}
}
