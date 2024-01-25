package com.kitsunerv.terrariamod.items.ressources;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaRessources {
	public static final Item COPPER_COIN = registerRessourceItem("copper_coin",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item SILVER_COIN = registerRessourceItem("silver_coin",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item GOLD_COIN = registerRessourceItem("gold_coin",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item PLATINUM_COIN = registerRessourceItem("platinum_coin",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerRessourceItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaRessourcesItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Ressources Items from " + TerrariaMod.MODID);
	}
}
