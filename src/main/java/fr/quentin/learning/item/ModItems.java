package fr.quentin.learning.item;

import fr.quentin.learning.Learning;
import fr.quentin.learning.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ModItems {
    public static final Item PLATINUM_ORE = register(ModBlocks.PLATINUM_ORE);
    public static final Item DEEPSLATE_PLATINUM_ORE = register(ModBlocks.DEEPSLATE_PLATINUM_ORE);
    public static final Item PLATINUM_BLOCK = register(ModBlocks.PLATINUM_BLOCK);
    public static final Item PLATINUM = register("platinum");

    private static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Learning.MOD_ID, id));
    }

    public static Item register(Block block) {
        return register(block, BlockItem::new);
    }

    public static Item register(Block block, BiFunction<Block, Item.Settings, Item> factory) {
        return register(block, factory, new Item.Settings());
    }

    public static Item register(Block block, BiFunction<Block, Item.Settings, Item> factory, Item.Settings settings) {
        return register(
                RegistryKey.of(RegistryKeys.ITEM, Registries.BLOCK.getId(block)),
                itemSettings -> factory.apply(block, itemSettings),
                settings.useBlockPrefixedTranslationKey()
        );
    }

    public static Item register(String id) {
        return register(keyOf(id), Item::new, new Item.Settings());
    }

    public static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }

    public static void initialize() {
        Learning.LOGGER.info("Items initialization");
    }
}
