package fr.quentin.learning.datagen;

import com.google.common.collect.ImmutableList;
import fr.quentin.learning.Learning;
import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final ImmutableList<ItemConvertible> PLATINUM_ORES = ImmutableList.of(ModItems.PLATINUM_ORE, ModItems.DEEPSLATE_PLATINUM_ORE);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                offerSmelting(PLATINUM_ORES, RecipeCategory.MISC, ModItems.PLATINUM, 1.0F, 200, "platinum");
                offerBlasting(PLATINUM_ORES, RecipeCategory.MISC, ModItems.PLATINUM, 1.0F, 100, "platinum");
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLATINUM_BLOCK, 1)
                        .input('#', ModItems.PLATINUM)
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .criterion("has_platinum", conditionsFromItem(ModItems.PLATINUM))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.PLATINUM, 9)
                        .input(ModBlocks.PLATINUM_BLOCK)
                        .criterion("has_platinum_block", conditionsFromItem(ModBlocks.PLATINUM_BLOCK))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return Learning.MOD_ID + " recipes";
    }
}
