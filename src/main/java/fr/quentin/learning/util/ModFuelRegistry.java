package fr.quentin.learning.util;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelRegistry {
    public static void register() {
        FuelRegistry.INSTANCE.add(ModBlocks.GRAY_LADDER, 300);
        FuelRegistry.INSTANCE.add(ModBlocks.GRAY_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(ModBlocks.GRAY_CHISELED_BOOKSHELF, 300);
        FuelRegistry.INSTANCE.add(ModItems.GRAY_WOODEN_SWORD, 200);
        FuelRegistry.INSTANCE.add(ModItems.GRAY_WOODEN_SHOVEL, 200);
        FuelRegistry.INSTANCE.add(ModItems.GRAY_WOODEN_PICKAXE, 200);
        FuelRegistry.INSTANCE.add(ModItems.GRAY_WOODEN_AXE, 200);
        FuelRegistry.INSTANCE.add(ModItems.GRAY_WOODEN_HOE, 200);
    }
}
