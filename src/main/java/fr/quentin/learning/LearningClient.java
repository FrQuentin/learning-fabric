package fr.quentin.learning;

import fr.quentin.learning.util.ModBlockRenderLayerMap;
import fr.quentin.learning.util.ModFlammableBlockRegistry;
import fr.quentin.learning.util.ModRenderModelLayers;
import fr.quentin.learning.util.ModStrippableBlockRegistry;
import net.fabricmc.api.ClientModInitializer;

public class LearningClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModBlockRenderLayerMap.register();
        ModRenderModelLayers.register();
        ModFlammableBlockRegistry.register();
        ModStrippableBlockRegistry.register();
    }
}
