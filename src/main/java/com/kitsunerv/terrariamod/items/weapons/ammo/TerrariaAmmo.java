package com.kitsunerv.terrariamod.items.weapons.ammo;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaAmmo {

	public static final Item FLAMING_ARROW = registerAmmoItem("flaming_arrow",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item UNHOLY_ARROW = registerAmmoItem("unholy_arrow",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item JESTERS_ARROW = registerAmmoItem("jesters_arrow",
			new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	private static Item registerAmmoItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaAmmoItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Ammo Items for " + TerrariaMod.MODID);
	}
}
