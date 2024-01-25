package com.kitsunerv.terrariamod.items.ressources.plants;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaPlants {
	public static final Item MUSHROOM = registerPlantItem("mushroom",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item VILE_MUSHROOM = registerPlantItem("vile_mushroom",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item GLOWING_MUSHROOM = registerPlantItem("glowing_mushroom",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item GRASS_SEEDS = registerPlantItem("grass_seeds",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item CORRUPT_SEEDS = registerPlantItem("corrupt_seeds",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerPlantItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaPlantsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Plants Items from " + TerrariaMod.MODID);
	}
}
