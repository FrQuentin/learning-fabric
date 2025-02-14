package fr.quentin.learning;

import fr.quentin.learning.render.ModRenderLayer;
import net.fabricmc.api.ClientModInitializer;

public class LearningClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderLayer.render();
    }
}
