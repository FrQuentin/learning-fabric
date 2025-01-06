package fr.quentin.learning.block;

import fr.quentin.learning.Learning;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static Block register(String name, Block block) {
        registerBlockAsItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Learning.MOD_ID, name), block);
    }

    private static Block registerWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Learning.MOD_ID, name), block);
    }

    private static void registerBlockAsItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Learning.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void initialize() {
        Learning.LOGGER.info("Blocks initialization for " + Learning.MOD_ID);
    }
}
