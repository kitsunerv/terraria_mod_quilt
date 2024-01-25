package com.kitsunerv.terrariamod.items.tools.axes;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaAxes {
	public static final Item WAR_AXE_OF_THE_NIGHT = registerAxeItem("war_axe_of_the_night",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerAxeItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaAxesItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Axes Items from " + TerrariaMod.MODID);
	}
}
