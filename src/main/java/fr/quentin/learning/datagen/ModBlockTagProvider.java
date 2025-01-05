package fr.quentin.learning.datagen;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.util.ModBlockTags;
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
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(
                        ModBlocks.GRAY_OAK_LEAVES
                );
        getOrCreateTagBuilder(ModBlockTags.GRAY_OAK_LOGS)
                .add(
                        ModBlocks.GRAY_OAK_LOG,
                        ModBlocks.GRAY_OAK_WOOD,
                        ModBlocks.STRIPPED_GRAY_OAK_LOG,
                        ModBlocks.STRIPPED_GRAY_OAK_WOOD
                );
        getOrCreateTagBuilder(BlockTags.LOGS).addTag(ModBlockTags.GRAY_OAK_LOGS);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).addTag(ModBlockTags.GRAY_OAK_LOGS);
        getOrCreateTagBuilder(BlockTags.OVERWORLD_NATURAL_LOGS).add(ModBlocks.GRAY_OAK_LOG);
        getOrCreateTagBuilder(BlockTags.PLANKS).add(ModBlocks.GRAY_OAK_PLANKS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(ModBlocks.GRAY_OAK_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(ModBlocks.GRAY_OAK_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(ModBlocks.GRAY_OAK_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.GRAY_OAK_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(ModBlocks.GRAY_OAK_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(ModBlocks.GRAY_OAK_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.GRAY_OAK_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(ModBlocks.GRAY_OAK_BUTTON);
        getOrCreateTagBuilder(BlockTags.LEAVES).add(ModBlocks.GRAY_OAK_LEAVES);
        getOrCreateTagBuilder(BlockTags.SAPLINGS).add(ModBlocks.GRAY_OAK_SAPLING);
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS).add(ModBlocks.POTTED_GRAY_OAK_SAPLING);
        getOrCreateTagBuilder(BlockTags.SIGNS).add(ModBlocks.GRAY_OAK_SIGN, ModBlocks.GRAY_OAK_WALL_SIGN);
        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS).add(ModBlocks.GRAY_OAK_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS).add(ModBlocks.GRAY_OAK_WALL_SIGN);
        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS).add(ModBlocks.GRAY_OAK_HANGING_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS).add(ModBlocks.GRAY_OAK_WALL_HANGING_SIGN);
        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE).add(ModBlocks.GRAY_TORCH);
    }
}
