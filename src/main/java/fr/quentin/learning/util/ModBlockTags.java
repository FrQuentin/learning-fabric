package fr.quentin.learning.util;

import fr.quentin.learning.Learning;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> PLATINUM_ORES = create("platinum_ores");
    public static final TagKey<Block> INCORRECT_FOR_PLATINUM_TOOL = create("incorrect_for_platinum_tool");
    public static final TagKey<Block> NEEDS_PLATINUM_TOOL = create("needs_platinum_tool");

    private static TagKey<Block> create(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Learning.MOD_ID, name));
    }
}
