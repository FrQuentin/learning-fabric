package fr.quentin.learning.util;

import fr.quentin.learning.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelRegistry {
    public static void register() {
        FuelRegistry.INSTANCE.add(ModBlocks.GRAY_LADDER, 300);
        FuelRegistry.INSTANCE.add(ModBlocks.GRAY_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(ModBlocks.GRAY_CHISELED_BOOKSHELF, 300);
    }
}
