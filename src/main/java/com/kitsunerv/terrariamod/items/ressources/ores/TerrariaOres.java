package com.kitsunerv.terrariamod.items.ressources.ores;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaOres {
	public static final Item TIN_ORE = registerOreItem("tin_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item LEAD_ORE = registerOreItem("lead_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item SILVER_ORE = registerOreItem("silver_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item TUNGSTEN_ORE = registerOreItem("tungsten_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item PLATInUM_ORE = registerOreItem("platinum_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item METEORITE = registerOreItem("meteorite",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item CRIMTANE_ORE = registerOreItem("crimtane_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item DEMONITE_ORE = registerOreItem("demonite_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item HELLSTONE = registerOreItem("hellstone",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item COBALT_ORE = registerOreItem("cobalt_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item PALLADIUM_ORE = registerOreItem("palladium_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item MYTHRIL_ORE = registerOreItem("mythril_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item ORICHALCUM_ORE = registerOreItem("orichalcum_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item ADAMANTITE_ORE = registerOreItem("adamantite_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item TITANIUM_ORE = registerOreItem("titanium_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item CHLOROPHYTE_ORE = registerOreItem("chlorophyte_ore",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item LUMINITE = registerOreItem("luminite",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerOreItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaOresItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Ores Items from " + TerrariaMod.MODID);
	}
}
