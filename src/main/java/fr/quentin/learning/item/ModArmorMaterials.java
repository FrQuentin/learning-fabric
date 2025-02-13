package fr.quentin.learning.item;

import fr.quentin.learning.Learning;
import fr.quentin.learning.util.ModItemTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ModArmorMaterials {
    public static final int PLATINUM_DURABILITY = 33;
    public static final RegistryKey<EquipmentAsset> PLATINUM = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(Learning.MOD_ID, "platinum"));
    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            PLATINUM_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 8,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3
            ), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, ModItemTags.REPAIRS_PLATINUM_ARMOR, PLATINUM
    );
}
