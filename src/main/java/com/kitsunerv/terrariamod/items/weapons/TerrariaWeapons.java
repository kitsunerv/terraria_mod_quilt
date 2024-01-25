package com.kitsunerv.terrariamod.items.weapons;

import com.kitsunerv.terrariamod.TerrariaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class TerrariaWeapons {
	private static Item registerWeaponItem(String name, Item item){
		return Registry.register(Registry.ITEM, new Identifier(TerrariaMod.MODID, name), item);
	}
	public static void registerTerrariaWeaponsItems(){
		TerrariaMod.LOGGER.debug("Registering Terraria Weapons Items for " + TerrariaMod.MODID);
	}
}
