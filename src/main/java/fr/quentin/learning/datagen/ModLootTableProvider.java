package fr.quentin.learning.datagen;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.block.custom.ChilliBlock;
import fr.quentin.learning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PLATINUM_ORE, block -> oreDrops(block, ModItems.PLATINUM));
        addDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE, block -> oreDrops(block, ModItems.PLATINUM));
        addDrop(ModBlocks.PLATINUM_BLOCK);
        LootCondition.Builder chilliBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.CHILLI)
                .properties(StatePredicate.Builder.create().exactMatch(ChilliBlock.AGE, 2));
        addDrop(ModBlocks.CHILLI, cropDrops(ModBlocks.CHILLI, ModItems.CHILLI, ModItems.CHILLI_SEEDS, chilliBuilder));
        addDrop(ModBlocks.CHILLI_CRATE);
    }
}
