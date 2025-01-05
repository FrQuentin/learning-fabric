package fr.quentin.learning.item;

import fr.quentin.learning.Learning;
import fr.quentin.learning.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup A_LEARNING_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Learning.MOD_ID, "a_learning_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Blocks.GRASS_BLOCK))
                    .displayName(Text.translatable("itemGroup." + Learning.MOD_ID + ".learningBlocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GRAY_OAK_LOG);
                        entries.add(ModBlocks.GRAY_OAK_WOOD);
                        entries.add(ModBlocks.STRIPPED_GRAY_OAK_LOG);
                        entries.add(ModBlocks.STRIPPED_GRAY_OAK_WOOD);
                        entries.add(ModBlocks.GRAY_OAK_PLANKS);
                        entries.add(ModBlocks.GRAY_OAK_STAIRS);
                        entries.add(ModBlocks.GRAY_OAK_SLAB);
                        entries.add(ModBlocks.GRAY_OAK_FENCE);
                        entries.add(ModBlocks.GRAY_OAK_FENCE_GATE);
                        entries.add(ModBlocks.GRAY_OAK_DOOR);
                        entries.add(ModBlocks.GRAY_OAK_TRAPDOOR);
                        entries.add(ModBlocks.GRAY_OAK_PRESSURE_PLATE);
                        entries.add(ModBlocks.GRAY_OAK_BUTTON);
                        entries.add(ModBlocks.GRAY_OAK_LEAVES);
                        entries.add(ModBlocks.GRAY_OAK_SAPLING);
                    }).build());

    public static final ItemGroup B_LEARNING_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Learning.MOD_ID, "b_learning_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.IRON_INGOT))
                    .displayName(Text.translatable("itemGroup." + Learning.MOD_ID + ".learningItems"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GRAY_OAK_SIGN);
                        entries.add(ModItems.GRAY_OAK_HANGING_SIGN);
                        entries.add(ModItems.GRAY_OAK_BOAT);
                        entries.add(ModItems.GRAY_OAK_CHEST_BOAT);
                        entries.add(ModItems.GRAY_TORCH);
                    }).build());

    public static void initialize() {
        Learning.LOGGER.info("Item Groups initialization for " + Learning.MOD_ID);
    }
}
