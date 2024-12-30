package fr.quentin.learning.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import fr.quentin.learning.Learning;
import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier GRAY_OAK_BOAT_ID = Identifier.of(Learning.MOD_ID, "gray_oak");
    public static final Identifier GRAY_OAK_CHEST_BOAT_ID = Identifier.of(Learning.MOD_ID, "gray_oak_chest");
    public static final RegistryKey<TerraformBoatType> GRAY_OAK_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GRAY_OAK_BOAT_ID);

    public static void initialize() {
        Learning.LOGGER.info("Boats initialization for " + Learning.MOD_ID);

        register(GRAY_OAK_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.GRAY_OAK_BOAT)
                .chestItem(ModItems.GRAY_OAK_CHEST_BOAT)
                .planks(ModBlocks.GRAY_OAK_PLANKS.asItem())
                .build());
    }

    public static TerraformBoatType register(RegistryKey<TerraformBoatType> key, TerraformBoatType type) {
        return Registry.register(TerraformBoatTypeRegistry.INSTANCE, key, type);
    }
}
