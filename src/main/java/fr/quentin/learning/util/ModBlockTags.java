package fr.quentin.learning.util;

import fr.quentin.learning.Learning;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> GRAY_OAK_LOGS = create("gray_oak_logs");

    private static TagKey<Block> create(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Learning.MOD_ID, name));
    }
}
