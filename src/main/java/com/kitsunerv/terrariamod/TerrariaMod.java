package com.kitsunerv.terrariamod;

import com.kitsunerv.terrariamod.items.TerrariaItems;
import com.kitsunerv.terrariamod.items.accessories.TerrariaAccessories;
import com.kitsunerv.terrariamod.items.bosssummon.TerrariaBossSummoningItems;
import com.kitsunerv.terrariamod.items.consumables.TerrariaConsumables;
import com.kitsunerv.terrariamod.items.consumables.food.TerrariaFoods;
import com.kitsunerv.terrariamod.items.consumables.potions.TerrariaPotions;
import com.kitsunerv.terrariamod.items.critters.TerrariaCritters;
import com.kitsunerv.terrariamod.items.ressources.TerrariaRessources;
import com.kitsunerv.terrariamod.items.ressources.bars.TerrariaBars;
import com.kitsunerv.terrariamod.items.ressources.drops.TerrariaDrops;
import com.kitsunerv.terrariamod.items.ressources.ores.TerrariaOres;
import com.kitsunerv.terrariamod.items.ressources.plants.TerrariaPlants;
import com.kitsunerv.terrariamod.items.tools.TerrariaTools;
import com.kitsunerv.terrariamod.items.tools.axes.TerrariaAxes;
import com.kitsunerv.terrariamod.items.tools.hammers.TerrariaHammers;
import com.kitsunerv.terrariamod.items.tools.multitools.TerrariaMultiTools;
import com.kitsunerv.terrariamod.items.tools.pickaxes.TerrariaPickAxes;
import com.kitsunerv.terrariamod.items.weapons.TerrariaWeapons;
import com.kitsunerv.terrariamod.items.weapons.ammo.TerrariaAmmo;
import com.kitsunerv.terrariamod.items.weapons.bows.TerrariaBows;
import com.kitsunerv.terrariamod.items.weapons.guns.TerrariaGuns;
import com.kitsunerv.terrariamod.items.weapons.magic.TerrariaMagic;
import com.kitsunerv.terrariamod.items.weapons.melee.TerrariaMelee;
import com.kitsunerv.terrariamod.items.weapons.summoning.TerrariaSummoning;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TerrariaMod implements ModInitializer {
	public static final String MODID = "terrariamod";
	public static final Logger LOGGER = LoggerFactory.getLogger("Terraria Mod");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		TerrariaItems.registerTerrariaItems();
		TerrariaAccessories.registerTerrariaAccessoriesItems();
		TerrariaBossSummoningItems.registerTerrariaBossSummoningItems();
		TerrariaConsumables.registerTerrariaConsumablesItems();
		TerrariaFoods.registerTerrariaFoodsItems();
		TerrariaPotions.registerTerrariaPotionsItems();
		TerrariaCritters.registerTerrariaCrittersItems();
		TerrariaRessources.registerTerrariaRessourcesItems();
		TerrariaBars.registerTerrariaBarsItems();
		TerrariaDrops.registerTerrariaDropsItems();
		TerrariaOres.registerTerrariaOresItems();
		TerrariaPlants.registerTerrariaPlantsItems();
		TerrariaTools.registerTerrariaToolsItems();
		TerrariaAxes.registerTerrariaAxesItems();
		TerrariaHammers.registerTerrariaHammersItems();
		TerrariaMultiTools.registerTerrariaMultiToolsItems();
		TerrariaPickAxes.registerTerrariaAxesItems();
		TerrariaWeapons.registerTerrariaWeaponsItems();
		TerrariaAmmo.registerTerrariaAmmoItems();
		TerrariaBows.registerTerrariaBowsItems();
		TerrariaGuns.registerTerrariaGunsItems();
		TerrariaMagic.registerTerrariaMagicItems();
		TerrariaMelee.registerTerrariaMeleeItems();
		TerrariaSummoning.registerTerrariaSummonItems();

	}
}
