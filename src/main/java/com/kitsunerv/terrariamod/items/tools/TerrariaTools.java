package com.kitsunerv.terrariamod.items.tools;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaTools {
	public static final Item MAGIC_MIRROR = registerToolItem("magic_mirror",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item PURIFICATION_POWDER = registerToolItem("purification_powder",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item VILE_POWDER = registerToolItem("vile_powder",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerToolItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaToolsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Tools Items for " + TerrariaMod.MODID);
	}
}
