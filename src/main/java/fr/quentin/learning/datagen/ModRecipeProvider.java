package fr.quentin.learning.datagen;

import com.google.common.collect.ImmutableList;
import fr.quentin.learning.Learning;
import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItems;
import fr.quentin.learning.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
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
                createShaped(RecipeCategory.COMBAT, ModItems.PLATINUM_SWORD)
                        .input('#', Items.STICK)
                        .input('X', ModItemTags.PLATINUM_TOOL_MATERIALS)
                        .pattern("X")
                        .pattern("X")
                        .pattern("#")
                        .criterion("has_platinum", conditionsFromTag(ModItemTags.PLATINUM_TOOL_MATERIALS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.PLATINUM_SHOVEL)
                        .input('#', Items.STICK)
                        .input('X', ModItemTags.PLATINUM_TOOL_MATERIALS)
                        .pattern("X")
                        .pattern("#")
                        .pattern("#")
                        .criterion("has_platinum", conditionsFromTag(ModItemTags.PLATINUM_TOOL_MATERIALS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.PLATINUM_PICKAXE)
                        .input('#', Items.STICK)
                        .input('X', ModItemTags.PLATINUM_TOOL_MATERIALS)
                        .pattern("XXX")
                        .pattern(" # ")
                        .pattern(" # ")
                        .criterion("has_platinum", conditionsFromTag(ModItemTags.PLATINUM_TOOL_MATERIALS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.PLATINUM_AXE)
                        .input('#', Items.STICK)
                        .input('X', ModItemTags.PLATINUM_TOOL_MATERIALS)
                        .pattern("XX")
                        .pattern("X#")
                        .pattern(" #")
                        .criterion("has_platinum", conditionsFromTag(ModItemTags.PLATINUM_TOOL_MATERIALS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.TOOLS, ModItems.PLATINUM_HOE)
                        .input('#', Items.STICK)
                        .input('X', ModItemTags.PLATINUM_TOOL_MATERIALS)
                        .pattern("XX")
                        .pattern(" #")
                        .pattern(" #")
                        .criterion("has_platinum", conditionsFromTag(ModItemTags.PLATINUM_TOOL_MATERIALS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.PLATINUM_HELMET)
                        .input('X', ModItems.PLATINUM)
                        .pattern("XXX")
                        .pattern("X X")
                        .criterion("has_platinum", conditionsFromItem(ModItems.PLATINUM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.PLATINUM_CHESTPLATE)
                        .input('X', ModItems.PLATINUM)
                        .pattern("X X")
                        .pattern("XXX")
                        .pattern("XXX")
                        .criterion("has_platinum", conditionsFromItem(ModItems.PLATINUM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.PLATINUM_LEGGINGS)
                        .input('X', ModItems.PLATINUM)
                        .pattern("XXX")
                        .pattern("X X")
                        .pattern("X X")
                        .criterion("has_platinum", conditionsFromItem(ModItems.PLATINUM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.PLATINUM_BOOTS)
                        .input('X', ModItems.PLATINUM)
                        .pattern("X X")
                        .pattern("X X")
                        .criterion("has_platinum", conditionsFromItem(ModItems.PLATINUM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.COMBAT, ModItems.PLATINUM_BOW)
                        .input('#', ModItems.PLATINUM)
                        .input('X', Items.STRING)
                        .pattern(" #X")
                        .pattern("# X")
                        .pattern(" #X")
                        .criterion("has_string", conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return Learning.MOD_ID + " recipes";
    }
}
