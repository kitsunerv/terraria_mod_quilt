package com.kitsunerv.terrariamod.items.weapons.bows;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaBows {

	public static final Item DEMON_BOW = registerBowItem("demon_bow",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerBowItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaBowsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Bows Items for " + TerrariaMod.MODID);
	}
}
