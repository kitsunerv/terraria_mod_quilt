package com.kitsunerv.terrariamod.items.ressources.bars;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaBars {
	public static final Item TIN_BAR = registerBarItem("tin_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item LEAD_BAR = registerBarItem("lead_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item SILVER_BAR = registerBarItem("silver_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item TUNGSTEN_BAR = registerBarItem("tungsten_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item PLATINUM_BAR = registerBarItem("platinum_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item METEORITE_BAR = registerBarItem("meteorite_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item CRIMTANE_BAR = registerBarItem("crimtane_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item DEMONITE_BAR = registerBarItem("demonite_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item HELLSTONE_BAR = registerBarItem("hellstone_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item COBALT_BAR = registerBarItem("cobalt_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item PALLADIUM_BAR = registerBarItem("palladium_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item MYTHRIL_BAR = registerBarItem("mythril_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item ORICHALCUM_BAR = registerBarItem("orichalcum_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item ADAMANTITE_BAR = registerBarItem("adamantite_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item TITANIUM_BAR = registerBarItem("titanium_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item HALLOWED_BAR = registerBarItem("hallowed_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item CHLOROPHYTE_BAR = registerBarItem("chlorophyte_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item SHROOMITE_BAR = registerBarItem("shroomite_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item LUMINITE_BAR = registerBarItem("luminite_bar",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerBarItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaBarsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Bars Items from " + TerrariaMod.MODID);
	}
}
