package fr.quentin.learning.util;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import fr.quentin.learning.entity.ModBoats;

public class ModRenderModelLayers {
    public static void register() {
        TerraformBoatClientHelper.registerModelLayers(ModBoats.GRAY_OAK_BOAT_ID, false);
    }
}
