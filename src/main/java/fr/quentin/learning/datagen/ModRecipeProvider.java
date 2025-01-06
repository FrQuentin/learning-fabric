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
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_OAK_FENCE, 3)
                .group("wooden_fence")
                .input('P', ModBlocks.GRAY_OAK_PLANKS)
                .input('S', ModItems.GRAY_STICK)
                .pattern("PSP")
                .pattern("PSP")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GRAY_OAK_FENCE_GATE, 1)
                .group("wooden_fence_gate")
                .input('P', ModBlocks.GRAY_OAK_PLANKS)
                .input('S', ModItems.GRAY_STICK)
                .pattern("SPS")
                .pattern("SPS")
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.GRAY_OAK_SIGN, 3)
                .group("wooden_sign")
                .input('P', ModBlocks.GRAY_OAK_PLANKS)
                .input('S', ModItems.GRAY_STICK)
                .pattern("PPP")
                .pattern("PPP")
                .pattern(" S ")
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_TORCH, 4)
                .input('#', ModItems.GRAY_STICK)
                .input('X', Ingredient.ofItems(Items.COAL, Items.CHARCOAL))
                .pattern("X")
                .pattern("#")
                .criterion("has_stone_pickaxe", conditionsFromItem(Items.STONE_PICKAXE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRAY_LADDER, 3)
                .input('#', ModItems.GRAY_STICK)
                .pattern("# #")
                .pattern("###")
                .pattern("# #")
                .criterion("has_stick", conditionsFromItem(ModItems.GRAY_STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_BOOKSHELF)
                .input('#', ModBlocks.GRAY_OAK_PLANKS)
                .input('X', Items.BOOK)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion("has_book", conditionsFromItem(Items.BOOK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CHISELED_BOOKSHELF)
                .input('#', ModBlocks.GRAY_OAK_PLANKS)
                .input('X', ModBlocks.GRAY_OAK_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion("has_book", conditionsFromItem(Items.BOOK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GRAY_STICK, 4)
                .input('#', ModBlocks.GRAY_OAK_PLANKS)
                .pattern("#")
                .pattern("#")
                .group("sticks")
                .criterion("has_planks", conditionsFromItem(ModBlocks.GRAY_OAK_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GRAY_WOODEN_SWORD)
                .input('#', ModItems.GRAY_STICK)
                .input('X', ModBlocks.GRAY_OAK_PLANKS)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .criterion("has_stick", conditionsFromItem(ModItems.GRAY_STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRAY_WOODEN_SHOVEL)
                .input('#', ModItems.GRAY_STICK)
                .input('X', ModBlocks.GRAY_OAK_PLANKS)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .criterion("has_stick", conditionsFromItem(ModItems.GRAY_STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRAY_WOODEN_PICKAXE)
                .input('#', ModItems.GRAY_STICK)
                .input('X', ModBlocks.GRAY_OAK_PLANKS)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .criterion("has_stick", conditionsFromItem(ModItems.GRAY_STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRAY_WOODEN_AXE)
                .input('#', ModItems.GRAY_STICK)
                .input('X', ModBlocks.GRAY_OAK_PLANKS)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .criterion("has_stick", conditionsFromItem(ModItems.GRAY_STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GRAY_WOODEN_HOE)
                .input('#', ModItems.GRAY_STICK)
                .input('X', ModBlocks.GRAY_OAK_PLANKS)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .criterion("has_stick", conditionsFromItem(ModItems.GRAY_STICK))
                .offerTo(exporter);
    }
}
