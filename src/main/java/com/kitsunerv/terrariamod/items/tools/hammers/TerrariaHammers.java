package com.kitsunerv.terrariamod.items.tools.hammers;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaHammers {
	public static final Item IRON_HAMMER = registerHammerItem("iron_hammer",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerHammerItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaHammersItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Hammmers Items from " + TerrariaMod.MODID);
	}
}
