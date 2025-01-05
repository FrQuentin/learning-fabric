package fr.quentin.learning.datagen;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.GRAY_OAK_LOG).log(ModBlocks.GRAY_OAK_LOG).wood(ModBlocks.GRAY_OAK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_GRAY_OAK_LOG).log(ModBlocks.STRIPPED_GRAY_OAK_LOG).wood(ModBlocks.STRIPPED_GRAY_OAK_WOOD);
        var grayOakPlanksFamily = new BlockFamily.Builder(ModBlocks.GRAY_OAK_PLANKS)
                .stairs(ModBlocks.GRAY_OAK_STAIRS)
                .slab(ModBlocks.GRAY_OAK_SLAB)
                .fence(ModBlocks.GRAY_OAK_FENCE)
                .fenceGate(ModBlocks.GRAY_OAK_FENCE_GATE)
                .pressurePlate(ModBlocks.GRAY_OAK_PRESSURE_PLATE)
                .button(ModBlocks.GRAY_OAK_BUTTON)
                .sign(ModBlocks.GRAY_OAK_SIGN, ModBlocks.GRAY_OAK_WALL_SIGN)
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(grayOakPlanksFamily.getBaseBlock()).family(grayOakPlanksFamily);
        blockStateModelGenerator.registerDoor(ModBlocks.GRAY_OAK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GRAY_OAK_TRAPDOOR);
        blockStateModelGenerator.registerSingleton(ModBlocks.GRAY_OAK_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GRAY_OAK_SAPLING, ModBlocks.POTTED_GRAY_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_GRAY_OAK_LOG, ModBlocks.GRAY_OAK_HANGING_SIGN, ModBlocks.GRAY_OAK_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerTorch(ModBlocks.GRAY_TORCH, ModBlocks.GRAY_WALL_TORCH);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.GRAY_LADDER);
        blockStateModelGenerator.registerItemModel(ModBlocks.GRAY_LADDER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GRAY_OAK_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_OAK_CHEST_BOAT, Models.GENERATED);
    }
}
