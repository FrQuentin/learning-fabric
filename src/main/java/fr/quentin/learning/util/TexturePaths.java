package fr.quentin.learning.util;

import fr.quentin.learning.Learning;
import net.minecraft.util.Identifier;

public interface TexturePaths {
    Identifier GRAY_OAK_SIGN_TEXTURE = Identifier.of(Learning.MOD_ID, "entity/signs/gray_oak");
    Identifier GRAY_OAK_HANGING_SIGN_TEXTURE = Identifier.of(Learning.MOD_ID, "entity/signs/hanging/gray_oak");
    Identifier GRAY_OAK_HANGING_SIGN_GUI_TEXTURE = Identifier.of(Learning.MOD_ID, "textures/gui/hanging_signs/gray_oak");
}
