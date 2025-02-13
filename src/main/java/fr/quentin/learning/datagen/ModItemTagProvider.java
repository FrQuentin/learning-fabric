package fr.quentin.learning.datagen;

import fr.quentin.learning.item.ModItems;
import fr.quentin.learning.tag.ModItemTags;
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
        getOrCreateTagBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES).add(ModItems.PLATINUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.PLATINUM_SWORD);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.PLATINUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.PLATINUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.PLATINUM_AXE);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.PLATINUM_HOE);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR).add(ModItems.PLATINUM_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR).add(ModItems.PLATINUM_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR).add(ModItems.PLATINUM_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR).add(ModItems.PLATINUM_BOOTS);
        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.PLATINUM_BOW);
        getOrCreateTagBuilder(ItemTags.BOW_ENCHANTABLE).add(ModItems.PLATINUM_BOW);
    }
}
