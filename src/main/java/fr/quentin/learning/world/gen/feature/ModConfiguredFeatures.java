package fr.quentin.learning.world.gen.feature;

import fr.quentin.learning.Learning;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

public class ModConfiguredFeatures {
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        ModOreConfiguredFeatures.bootstrap(featureRegisterable);
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Learning.MOD_ID, id));
    }

    public static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                  RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
