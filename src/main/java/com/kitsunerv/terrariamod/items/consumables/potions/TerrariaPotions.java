package com.kitsunerv.terrariamod.items.consumables.potions;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaPotions {
	public static final Item LESSER_HEALING_POTION = registerPotionItem("lesser_healing_potion",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerPotionItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaPotionsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Potions Items from " + TerrariaMod.MODID);
	}
}
