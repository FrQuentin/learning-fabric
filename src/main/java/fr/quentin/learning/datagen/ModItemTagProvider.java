package fr.quentin.learning.datagen;

import fr.quentin.learning.item.ModItems;
import fr.quentin.learning.util.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.PLATINUM_ORES).add(ModItems.PLATINUM_ORE, ModItems.DEEPSLATE_PLATINUM_ORE);
        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS).add(ModItems.PLATINUM);
        getOrCreateTagBuilder(ModItemTags.PLATINUM_TOOL_MATERIALS).add(ModItems.PLATINUM);
        getOrCreateTagBuilder(ModItemTags.REPAIRS_PLATINUM_ARMOR).add(ModItems.PLATINUM);
    }
}
