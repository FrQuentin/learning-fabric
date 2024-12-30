package fr.quentin.learning.datagen;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItems;
import fr.quentin.learning.util.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.GRAY_OAK_LOGS)
                .add(
                        ModBlocks.GRAY_OAK_LOG.asItem(),
                        ModBlocks.GRAY_OAK_WOOD.asItem(),
                        ModBlocks.STRIPPED_GRAY_OAK_LOG.asItem(),
                        ModBlocks.STRIPPED_GRAY_OAK_WOOD.asItem()
                );
        getOrCreateTagBuilder(ItemTags.LOGS).addTag(ModItemTags.GRAY_OAK_LOGS);
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).addTag(ModItemTags.GRAY_OAK_LOGS);
        getOrCreateTagBuilder(ItemTags.PLANKS).add(ModBlocks.GRAY_OAK_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS).add(ModBlocks.GRAY_OAK_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS).add(ModBlocks.GRAY_OAK_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES).add(ModBlocks.GRAY_OAK_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.FENCE_GATES).add(ModBlocks.GRAY_OAK_FENCE_GATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS).add(ModBlocks.GRAY_OAK_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS).add(ModBlocks.GRAY_OAK_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.GRAY_OAK_PRESSURE_PLATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS).add(ModBlocks.GRAY_OAK_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.LEAVES).add(ModBlocks.GRAY_OAK_LEAVES.asItem());
        getOrCreateTagBuilder(ItemTags.SAPLINGS).add(ModBlocks.GRAY_OAK_SAPLING.asItem());
        getOrCreateTagBuilder(ItemTags.SIGNS).add(ModBlocks.GRAY_OAK_SIGN.asItem());
        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS).add(ModBlocks.GRAY_OAK_HANGING_SIGN.asItem());
        getOrCreateTagBuilder(ItemTags.BOATS).add(ModItems.GRAY_OAK_BOAT);
        getOrCreateTagBuilder(ItemTags.CHEST_BOATS).add(ModItems.GRAY_OAK_CHEST_BOAT);
    }
}
