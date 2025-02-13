package fr.quentin.learning.item;

import fr.quentin.learning.Learning;
import fr.quentin.learning.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.*;
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
    public static final Item PLATINUM_SWORD = register("platinum_sword", settings -> new SwordItem(ModToolMaterial.PLATINUM, 3.0F, -2.4F, settings));
    public static final Item PLATINUM_SHOVEL = register("platinum_shovel", settings -> new ShovelItem(ModToolMaterial.PLATINUM, 1.5F, -3.0F, settings));
    public static final Item PLATINUM_PICKAXE = register("platinum_pickaxe", settings -> new PickaxeItem(ModToolMaterial.PLATINUM, 1.0F, -2.8F, settings));
    public static final Item PLATINUM_AXE = register("platinum_axe", settings -> new AxeItem(ModToolMaterial.PLATINUM, 5.0F, -3.0F, settings));
    public static final Item PLATINUM_HOE = register("platinum_hoe", settings -> new HoeItem(ModToolMaterial.PLATINUM, -3.0F, 0.0F, settings));
    public static final Item PLATINUM_BOW = register("platinum_bow", BowItem::new, new Item.Settings().maxDamage(576).enchantable(1));

    private static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Learning.MOD_ID, id));
    }

    public static Item register(Block block) {
        return register(block, BlockItem::new);
    }

    public static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return register(keyOf(id), factory, settings);
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

    public static Item register(String id, Function<Item.Settings, Item> factory) {
        return register(keyOf(id), factory, new Item.Settings());
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
