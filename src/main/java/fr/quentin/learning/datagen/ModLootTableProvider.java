package fr.quentin.learning.datagen;

import fr.quentin.learning.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GRAY_OAK_LOG);
        addDrop(ModBlocks.GRAY_OAK_WOOD);
        addDrop(ModBlocks.STRIPPED_GRAY_OAK_LOG);
        addDrop(ModBlocks.STRIPPED_GRAY_OAK_WOOD);
        addDrop(ModBlocks.GRAY_OAK_PLANKS);
        addDrop(ModBlocks.GRAY_OAK_STAIRS);
        addDrop(ModBlocks.GRAY_OAK_SLAB, this::slabDrops);
        addDrop(ModBlocks.GRAY_OAK_FENCE);
        addDrop(ModBlocks.GRAY_OAK_FENCE_GATE);
        addDrop(ModBlocks.GRAY_OAK_DOOR, this::doorDrops);
        addDrop(ModBlocks.GRAY_OAK_TRAPDOOR);
        addDrop(ModBlocks.GRAY_OAK_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_OAK_BUTTON);
        addDrop(ModBlocks.GRAY_OAK_LEAVES, block -> leavesDrops(block, ModBlocks.GRAY_OAK_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.GRAY_OAK_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_GRAY_OAK_SAPLING);
        addDrop(ModBlocks.GRAY_OAK_SIGN);
        addDrop(ModBlocks.GRAY_OAK_HANGING_SIGN);
        addDrop(ModBlocks.GRAY_TORCH);
        addDrop(ModBlocks.GRAY_LADDER);
        addDrop(ModBlocks.GRAY_BOOKSHELF, block -> drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0F)));
        addDropWithSilkTouch(ModBlocks.GRAY_CHISELED_BOOKSHELF);
    }
}
