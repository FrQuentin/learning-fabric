package fr.quentin.learning.datagen;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
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
    }
}
