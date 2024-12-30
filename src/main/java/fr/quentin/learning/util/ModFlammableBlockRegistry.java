package fr.quentin.learning.util;

import fr.quentin.learning.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void register() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlockTags.GRAY_OAK_LOGS, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_OAK_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_OAK_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_OAK_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_OAK_LEAVES, 30, 60);
    }
}
