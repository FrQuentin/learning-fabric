package fr.quentin.learning.util;

import fr.quentin.learning.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelRegistry {
    public static void register() {
        FuelRegistry.INSTANCE.add(ModBlocks.GRAY_LADDER, 300);
    }
}
