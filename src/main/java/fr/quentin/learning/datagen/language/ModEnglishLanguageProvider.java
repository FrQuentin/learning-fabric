package fr.quentin.learning.datagen.language;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItemGroups;
import fr.quentin.learning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLanguageProvider extends FabricLanguageProvider {
    public ModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.GRAY_OAK_LOG, "Gray Oak Log");
        translationBuilder.add(ModBlocks.GRAY_OAK_WOOD, "Gray Oak Wood");
        translationBuilder.add(ModBlocks.STRIPPED_GRAY_OAK_LOG, "Stripped Gray Oak Log");
        translationBuilder.add(ModBlocks.STRIPPED_GRAY_OAK_WOOD, "Stripped Gray Oak Wood");
        translationBuilder.add(ModBlocks.GRAY_OAK_PLANKS, "Gray Oak Planks");
        translationBuilder.add(ModBlocks.GRAY_OAK_STAIRS, "Gray Oak Stairs");
        translationBuilder.add(ModBlocks.GRAY_OAK_SLAB, "Gray Oak Slab");
        translationBuilder.add(ModBlocks.GRAY_OAK_FENCE, "Gray Oak Fence");
        translationBuilder.add(ModBlocks.GRAY_OAK_FENCE_GATE, "Gray Oak Fence Gate");
        translationBuilder.add(ModBlocks.GRAY_OAK_DOOR, "Gray Oak Door");
        translationBuilder.add(ModBlocks.GRAY_OAK_TRAPDOOR, "Gray Oak Trapdoor");
        translationBuilder.add(ModBlocks.GRAY_OAK_PRESSURE_PLATE, "Gray Oak Pressure Plate");
        translationBuilder.add(ModBlocks.GRAY_OAK_BUTTON, "Gray Oak Button");
        translationBuilder.add(ModBlocks.GRAY_OAK_LEAVES, "Gray Oak Leaves");
        translationBuilder.add(ModBlocks.GRAY_OAK_SAPLING, "Gray Oak Sapling");
        translationBuilder.add(ModBlocks.GRAY_OAK_SIGN, "Gray Oak Sign");
        translationBuilder.add(ModBlocks.GRAY_OAK_HANGING_SIGN, "Gray Oak Hanging Sign");
        translationBuilder.add(ModItems.GRAY_OAK_BOAT, "Gray Oak Boat");
        translationBuilder.add(ModItems.GRAY_OAK_CHEST_BOAT, "Gray Oak Chest Boat");

        translationBuilder.add(ModItemGroups.A_LEARNING_BLOCKS.getDisplayName().getString(), "Blocks");
        translationBuilder.add(ModItemGroups.B_LEARNING_ITEMS.getDisplayName().getString(), "Items");
    }
}
