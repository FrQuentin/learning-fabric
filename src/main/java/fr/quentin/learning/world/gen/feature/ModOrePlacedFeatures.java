package fr.quentin.learning.world.gen.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModOrePlacedFeatures {
    public static final RegistryKey<PlacedFeature> ORE_PLATINUM = ModPlacedFeatures.of("ore_platinum");
    public static final RegistryKey<PlacedFeature> ORE_PLATINUM_MEDIUM = ModPlacedFeatures.of("ore_platinum_medium");
    public static final RegistryKey<PlacedFeature> ORE_PLATINUM_LARGE = ModPlacedFeatures.of("ore_platinum_large");
    public static final RegistryKey<PlacedFeature> ORE_PLATINUM_BURIED = ModPlacedFeatures.of("ore_platinum_buried");

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_PLATINUM_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry1 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_PLATINUM_MEDIUM);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry2 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_PLATINUM_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> registryEntry3 = registryEntryLookup.getOrThrow(ModOreConfiguredFeatures.ORE_PLATINUM_BURIED);

        ModPlacedFeatures.register(
                featureRegisterable,
                ORE_PLATINUM,
                registryEntry,
                modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))
        );
        ModPlacedFeatures.register(
                featureRegisterable, ORE_PLATINUM_MEDIUM, registryEntry1, modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-4)))
        );
        ModPlacedFeatures.register(
                featureRegisterable,
                ORE_PLATINUM_LARGE,
                registryEntry2,
                modifiersWithRarity(9, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))
        );
        ModPlacedFeatures.register(
                featureRegisterable,
                ORE_PLATINUM_BURIED,
                registryEntry3,
                modifiersWithCount(4, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))
        );
    }
}
