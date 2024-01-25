package com.kitsunerv.terrariamod.items.consumables;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaConsumables {

	public static final Item LIFE_CRYSTAL = registerConsumablesItem("life_crystal",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerConsumablesItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaConsumablesItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Consumables Items from " + TerrariaMod.MODID);
	}
}
