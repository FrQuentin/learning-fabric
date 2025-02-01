package fr.quentin.learning;

import fr.quentin.learning.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Learning implements ModInitializer {
	public static final String MOD_ID = "learning";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.initialize();
	}
}