package fr.quentin.learning.item;

import fr.quentin.learning.Learning;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Learning.MOD_ID, name), item);
    }

    public static void initialize() {
        Learning.LOGGER.info("Items initialization for " + Learning.MOD_ID);
    }
}
