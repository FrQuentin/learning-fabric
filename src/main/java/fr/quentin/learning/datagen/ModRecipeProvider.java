package fr.quentin.learning.datagen;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItems;
import fr.quentin.learning.util.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerBarkBlockRecipe(exporter, ModBlocks.GRAY_OAK_WOOD, ModBlocks.GRAY_OAK_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_GRAY_OAK_WOOD, ModBlocks.STRIPPED_GRAY_OAK_LOG);
        offerPlanksRecipe(exporter, ModBlocks.GRAY_OAK_PLANKS, ModItemTags.GRAY_OAK_LOGS, 4);
        createStairsRecipe(ModBlocks.GRAY_OAK_STAIRS, Ingredient.ofItems(ModBlocks.GRAY_OAK_PLANKS))
                .group("wooden_stairs")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_OAK_SLAB, Ingredient.ofItems(ModBlocks.GRAY_OAK_PLANKS))
                .group("wooden_slab")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.GRAY_OAK_FENCE, Ingredient.ofItems(ModBlocks.GRAY_OAK_PLANKS))
                .group("wooden_fence")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.GRAY_OAK_FENCE_GATE, Ingredient.ofItems(ModBlocks.GRAY_OAK_PLANKS))
                .group("wooden_fence_gate")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.GRAY_OAK_DOOR, Ingredient.ofItems(ModBlocks.GRAY_OAK_PLANKS))
                .group("wooden_door")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.GRAY_OAK_TRAPDOOR, Ingredient.ofItems(ModBlocks.GRAY_OAK_PLANKS))
                .group("wooden_trapdoor")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.GRAY_OAK_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.GRAY_OAK_PLANKS))
                .group("wooden_pressure_plate")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GRAY_OAK_BUTTON)
                .group("wooden_button")
                .input(ModBlocks.GRAY_OAK_PLANKS)
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        createSignRecipe(ModBlocks.GRAY_OAK_SIGN, Ingredient.ofItems(ModBlocks.GRAY_OAK_PLANKS))
                .group("wooden_sign")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_OAK_HANGING_SIGN, 6)
                .group("hanging_sign")
                .input('#', ModBlocks.STRIPPED_GRAY_OAK_LOG)
                .input('C', Blocks.CHAIN)
                .pattern("C C")
                .pattern("###")
                .pattern("###")
                .criterion("has_stripped_logs", conditionsFromItem(ModBlocks.STRIPPED_GRAY_OAK_LOG))
                .offerTo(exporter);
        offerBoatRecipe(exporter, ModItems.GRAY_OAK_BOAT, ModBlocks.GRAY_OAK_PLANKS);
        offerChestBoatRecipe(exporter, ModItems.GRAY_OAK_CHEST_BOAT, ModItems.GRAY_OAK_BOAT);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_BOOKSHELF)
                .input('#', ModBlocks.GRAY_OAK_PLANKS)
                .input('X', Items.BOOK)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion("has_book", conditionsFromItem(Items.BOOK))
                .offerTo(exporter);
    }
}
