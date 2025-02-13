package fr.quentin.learning.world.gen.feature;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModDefaultBiomeFeatures {
    public static void generate() {
        addOres();
    }

    private static void addOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModOrePlacedFeatures.ORE_PLATINUM);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModOrePlacedFeatures.ORE_PLATINUM_MEDIUM);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModOrePlacedFeatures.ORE_PLATINUM_LARGE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModOrePlacedFeatures.ORE_PLATINUM_BURIED);
    }
}
