package fr.quentin.learning.world.gen.feature;

import fr.quentin.learning.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModOreConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PLATINUM_SMALL = ModConfiguredFeatures.of("ore_platinum_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PLATINUM_MEDIUM = ModConfiguredFeatures.of("ore_platinum_medium");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PLATINUM_LARGE = ModConfiguredFeatures.of("ore_platinum_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PLATINUM_BURIED = ModConfiguredFeatures.of("ore_platinum_buried");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest stoneOreReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> platinumOresList = List.of(
                OreFeatureConfig.createTarget(stoneOreReplaceables, ModBlocks.PLATINUM_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateOreReplaceables, ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState())
        );

        ModConfiguredFeatures.register(featureRegisterable, ORE_PLATINUM_SMALL, Feature.ORE, new OreFeatureConfig(platinumOresList, 4, 0.5F));
        ModConfiguredFeatures.register(featureRegisterable, ORE_PLATINUM_MEDIUM, Feature.ORE, new OreFeatureConfig(platinumOresList, 8, 0.5F));
        ModConfiguredFeatures.register(featureRegisterable, ORE_PLATINUM_LARGE, Feature.ORE, new OreFeatureConfig(platinumOresList, 12, 0.7F));
        ModConfiguredFeatures.register(featureRegisterable, ORE_PLATINUM_BURIED, Feature.ORE, new OreFeatureConfig(platinumOresList, 8, 1.0F));
    }
}
