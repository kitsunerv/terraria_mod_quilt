package com.kitsunerv.terrariamod.items.bosssummon;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaBossSummoningItems {
	public static final Item SUSPICIOUS_EYE = registerBossSummoningItem("suspicious_eye",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item WORM_FOOD = registerBossSummoningItem("worm_food",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));

	private static Item registerBossSummoningItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaBossSummoningItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Boss Summoning Items from " + TerrariaMod.MODID);
	}
}
