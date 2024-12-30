package fr.quentin.learning.util;

import fr.quentin.learning.Learning;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> GRAY_OAK_LOGS = create("gray_oak_logs");

    private static TagKey<Item> create(String name) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Learning.MOD_ID, name));
    }
}
