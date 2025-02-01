package fr.quentin.learning.item;

import fr.quentin.learning.Learning;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup A_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Learning.MOD_ID, "a_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Blocks.BRICKS))
                    .displayName(Text.translatable("itemGroup." + Learning.MOD_ID + ".blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(Blocks.BRICKS);
                    }).build());
    public static final ItemGroup B_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Learning.MOD_ID, "b_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.IRON_INGOT))
                    .displayName(Text.translatable("itemGroup." + Learning.MOD_ID + ".items"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.IRON_INGOT);
                    }).build());

    public static void initialize() {
        Learning.LOGGER.info("Item Groups initialization for " + Learning.MOD_ID);
    }
}
