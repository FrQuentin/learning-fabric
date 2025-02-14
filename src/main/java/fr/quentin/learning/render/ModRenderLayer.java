package fr.quentin.learning.render;

import fr.quentin.learning.block.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ModRenderLayer {
    public static void render() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHILLI, RenderLayer.getCutout());
    }
}
