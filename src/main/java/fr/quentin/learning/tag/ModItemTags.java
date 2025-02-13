package fr.quentin.learning.tag;

import fr.quentin.learning.Learning;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> PLATINUM_ORES = create("platinum_ores");
    public static final TagKey<Item> PLATINUM_TOOL_MATERIALS = create("platinum_tool_materials");
    public static final TagKey<Item> REPAIRS_PLATINUM_ARMOR = create("repairs_platinum_armor");

    private static TagKey<Item> create(String name) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Learning.MOD_ID, name));
    }
}
