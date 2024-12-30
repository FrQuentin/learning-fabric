package fr.quentin.learning.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import fr.quentin.learning.Learning;
import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.entity.ModBoats;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GRAY_OAK_SIGN = register("gray_oak_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.GRAY_OAK_SIGN, ModBlocks.GRAY_OAK_WALL_SIGN));
    public static final Item GRAY_OAK_HANGING_SIGN = register(
            "gray_oak_hanging_sign", new HangingSignItem(ModBlocks.GRAY_OAK_HANGING_SIGN, ModBlocks.GRAY_OAK_WALL_HANGING_SIGN, new Item.Settings().maxCount(16))
    );
    public static final Item GRAY_OAK_BOAT = TerraformBoatItemHelper.registerBoatItem(Identifier.of(ModBoats.GRAY_OAK_BOAT_ID + "_boat"), ModBoats.GRAY_OAK_BOAT_KEY, false);
    public static final Item GRAY_OAK_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(Identifier.of(ModBoats.GRAY_OAK_CHEST_BOAT_ID + "_boat"), ModBoats.GRAY_OAK_BOAT_KEY, true);

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Learning.MOD_ID, name), item);
    }

    public static void initialize() {
        Learning.LOGGER.info("Items initialization for " + Learning.MOD_ID);
    }
}
