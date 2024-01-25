package com.kitsunerv.terrariamod.items.ressources.drops;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaDrops {
	public static final Item ROTTEN_CHUNK = registerDropItem("rotten_chunk",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item WORM_TOOTH = registerDropItem("worm_tooth",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item GEL = registerDropItem("gel",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item LENS = registerDropItem("lens",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item ECTOPLASM = registerDropItem("ectoplasm",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerDropItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaDropsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Drops Items from " + TerrariaMod.MODID);
	}
}
