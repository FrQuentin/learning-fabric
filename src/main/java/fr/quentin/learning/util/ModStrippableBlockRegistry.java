package fr.quentin.learning.util;

import fr.quentin.learning.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    public static void register() {
        StrippableBlockRegistry.register(ModBlocks.GRAY_OAK_LOG, ModBlocks.STRIPPED_GRAY_OAK_LOG);
        StrippableBlockRegistry.register(ModBlocks.GRAY_OAK_WOOD, ModBlocks.STRIPPED_GRAY_OAK_WOOD);
    }
}
