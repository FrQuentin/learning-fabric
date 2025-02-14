package fr.quentin.learning;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItemGroups;
import fr.quentin.learning.item.ModItems;
import fr.quentin.learning.village.ModTradeOffers;
import fr.quentin.learning.world.gen.feature.ModDefaultBiomeFeatures;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Learning implements ModInitializer {
	public static final String MOD_ID = "learning";
	public static final Logger LOGGER = LoggerFactory.getLogger("Learning");

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModBlocks.initialize();
		ModItemGroups.initialize();
		ModDefaultBiomeFeatures.generate();
		ModTradeOffers.register();
	}
}