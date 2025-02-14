package fr.quentin.learning.datagen;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.tag.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(
                        ModBlocks.PLATINUM_ORE,
                        ModBlocks.DEEPSLATE_PLATINUM_ORE,
                        ModBlocks.PLATINUM_BLOCK
                );
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(
                        ModBlocks.CHILLI,
                        ModBlocks.CHILLI_CRATE
                );
        getOrCreateTagBuilder(ModBlockTags.PLATINUM_ORES).add(ModBlocks.PLATINUM_ORE, ModBlocks.DEEPSLATE_PLATINUM_ORE);
        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS).add(ModBlocks.PLATINUM_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.PLATINUM_ORE, ModBlocks.DEEPSLATE_PLATINUM_ORE, ModBlocks.PLATINUM_BLOCK);
        getOrCreateTagBuilder(ModBlockTags.INCORRECT_FOR_PLATINUM_TOOL);
        getOrCreateTagBuilder(ModBlockTags.NEEDS_PLATINUM_TOOL);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);
        getOrCreateTagBuilder(ModBlockTags.NEEDS_PLATINUM_TOOL).addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_WOODEN_TOOL).addTag(ModBlockTags.NEEDS_PLATINUM_TOOL);
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL).addTag(ModBlockTags.NEEDS_PLATINUM_TOOL);
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL).addTag(ModBlockTags.NEEDS_PLATINUM_TOOL);
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_GOLD_TOOL).addTag(ModBlockTags.NEEDS_PLATINUM_TOOL);
        getOrCreateTagBuilder(BlockTags.CROPS).add(ModBlocks.CHILLI);
        getOrCreateTagBuilder(BlockTags.MAINTAINS_FARMLAND).add(ModBlocks.CHILLI);
    }
}
