package fr.quentin.learning.datagen.language;

import fr.quentin.learning.item.ModItemGroups;
import fr.quentin.learning.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLanguageProvider extends FabricLanguageProvider {
    public ModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.PLATINUM_ORE, "Platinum Ore");
        translationBuilder.add(ModItems.DEEPSLATE_PLATINUM_ORE, "Deepslate Platinum Ore");
        translationBuilder.add(ModItems.PLATINUM_BLOCK, "Block of Platinum");
        translationBuilder.add(ModItems.PLATINUM, "Platinum");
        translationBuilder.add(ModItems.PLATINUM_SWORD, "Platinum Sword");
        translationBuilder.add(ModItems.PLATINUM_SHOVEL, "Platinum Shovel");
        translationBuilder.add(ModItems.PLATINUM_PICKAXE, "Platinum Pickaxe");
        translationBuilder.add(ModItems.PLATINUM_AXE, "Platinum Axe");
        translationBuilder.add(ModItems.PLATINUM_HOE, "Platinum Hoe");
        translationBuilder.add(ModItems.PLATINUM_BOW, "Platinum Bow");

        translationBuilder.add(ModItemGroups.A_BLOCKS.getDisplayName().getString(), "Blocks");
        translationBuilder.add(ModItemGroups.B_ITEMS.getDisplayName().getString(), "Items");
    }
}
