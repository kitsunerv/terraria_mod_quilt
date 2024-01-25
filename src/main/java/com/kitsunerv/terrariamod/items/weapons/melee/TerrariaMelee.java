package com.kitsunerv.terrariamod.items.weapons.melee;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaMelee {

	public static final Item ENCHANTED_BOOMERANG = registerMeleeItem("enchanted_boomerang",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item IRON_SHORTSWORD = registerMeleeItem("iron_shortsword",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item LIGHTS_BANE = registerMeleeItem("lights_bane",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item STARFURY = registerMeleeItem("starfury",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item VILETHORN = registerMeleeItem("vilethorn",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerMeleeItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaMeleeItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Melee Items for " + TerrariaMod.MODID);
	}
}
