package com.kitsunerv.terrariamod.items.consumables.food;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TerrariaFoods {
	private static Item registerFoodItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaFoodsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Foods Items from " + TerrariaMod.MODID);
	}
}
