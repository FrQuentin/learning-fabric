package fr.quentin.learning.datagen;

import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModArmorMaterials;
import fr.quentin.learning.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;
import net.minecraft.state.property.Properties;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.CHILLI,
                BlockStateModelGenerator.CrossType.NOT_TINTED, Properties.AGE_2, 0, 1, 2);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHILLI_CRATE, TexturedModel.SIDE_END_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor(ModItems.PLATINUM_HELMET, ModArmorMaterials.PLATINUM, "helmet", false);
        itemModelGenerator.registerArmor(ModItems.PLATINUM_CHESTPLATE, ModArmorMaterials.PLATINUM, "chestplate", false);
        itemModelGenerator.registerArmor(ModItems.PLATINUM_LEGGINGS, ModArmorMaterials.PLATINUM, "leggings", false);
        itemModelGenerator.registerArmor(ModItems.PLATINUM_BOOTS, ModArmorMaterials.PLATINUM, "boots", false);
        itemModelGenerator.register(ModItems.CHILLI, Models.GENERATED);
    }
}
