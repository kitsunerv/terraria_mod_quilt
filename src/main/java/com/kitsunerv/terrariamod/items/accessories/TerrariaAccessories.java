package com.kitsunerv.terrariamod.items.accessories;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaAccessories {
	public static final Item REGENERATION_BAND = registerAccessoryItem("band_of_regeneration",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item CLOUD_IN_A_BOTTLE = registerAccessoryItem("cloud_in_a_bottle",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item COPPER_WATCH = registerAccessoryItem("copper_watch",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item SILVER_WATCH = registerAccessoryItem("silver_watch",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item GOLD_WATCH = registerAccessoryItem("gold_watch",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item DEPTH_METER = registerAccessoryItem("depth_meter",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item HERMES_BOOTS = registerAccessoryItem("hermes_boots",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerAccessoryItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaAccessoriesItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Accessories Items from " + TerrariaMod.MODID);
	}
}
