package fr.quentin.learning.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import fr.quentin.learning.Learning;
import fr.quentin.learning.block.ModBlocks;
import fr.quentin.learning.entity.ModBoats;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModItems {
    public static final Item GRAY_OAK_SIGN = register("gray_oak_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.GRAY_OAK_SIGN, ModBlocks.GRAY_OAK_WALL_SIGN));
    public static final Item GRAY_OAK_HANGING_SIGN = register(
            "gray_oak_hanging_sign", new HangingSignItem(ModBlocks.GRAY_OAK_HANGING_SIGN, ModBlocks.GRAY_OAK_WALL_HANGING_SIGN, new Item.Settings().maxCount(16))
    );
    public static final Item GRAY_OAK_BOAT = TerraformBoatItemHelper.registerBoatItem(Identifier.of(ModBoats.GRAY_OAK_BOAT_ID + "_boat"), ModBoats.GRAY_OAK_BOAT_KEY, false);
    public static final Item GRAY_OAK_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(Identifier.of(ModBoats.GRAY_OAK_CHEST_BOAT_ID + "_boat"), ModBoats.GRAY_OAK_BOAT_KEY, true);
    public static final Item GRAY_TORCH = Items.register(
            new VerticallyAttachableBlockItem(ModBlocks.GRAY_TORCH, ModBlocks.GRAY_WALL_TORCH, new Item.Settings(), Direction.DOWN)
    );
    public static final Item GRAY_STICK = register("gray_stick", new Item(new Item.Settings()));
    public static final Item GRAY_WOODEN_SWORD = register(
            "gray_wooden_sword", new SwordItem(ModToolMaterials.GRAY_WOOD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GRAY_WOOD, 3, -2.4F)))
    );
    public static final Item GRAY_WOODEN_SHOVEL = register(
            "gray_wooden_shovel",
            new ShovelItem(ModToolMaterials.GRAY_WOOD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GRAY_WOOD, 1.5F, -3.0F)))
    );
    public static final Item GRAY_WOODEN_PICKAXE = register(
            "gray_wooden_pickaxe",
            new PickaxeItem(ModToolMaterials.GRAY_WOOD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GRAY_WOOD, 1.0F, -2.8F)))
    );
    public static final Item GRAY_WOODEN_AXE = register(
            "gray_wooden_axe", new AxeItem(ModToolMaterials.GRAY_WOOD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GRAY_WOOD, 6.0F, -3.2F)))
    );
    public static final Item GRAY_WOODEN_HOE = register(
            "gray_wooden_hoe", new HoeItem(ModToolMaterials.GRAY_WOOD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GRAY_WOOD, 0.0F, -3.0F)))
    );

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Learning.MOD_ID, name), item);
    }

    public static void initialize() {
        Learning.LOGGER.info("Items initialization for " + Learning.MOD_ID);
    }
}
