package fr.quentin.learning.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import fr.quentin.learning.Learning;
import fr.quentin.learning.util.TexturePaths;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GRAY_OAK_LOG = register("gray_oak_log", Blocks.createLogBlock(MapColor.WHITE_GRAY, MapColor.GRAY));
    public static final Block GRAY_OAK_WOOD = register(
            "gray_oak_wood",
            new PillarBlock(
                    AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()
            )
    );
    public static final Block STRIPPED_GRAY_OAK_LOG = register("stripped_gray_oak_log", Blocks.createLogBlock(MapColor.WHITE_GRAY, MapColor.GRAY));
    public static final Block STRIPPED_GRAY_OAK_WOOD = register(
            "stripped_gray_oak_wood",
            new PillarBlock(
                    AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()
            )
    );
    public static final Block GRAY_OAK_PLANKS = register(
            "gray_oak_planks",
            new Block(
                    AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()
            )
    );
    public static final Block GRAY_OAK_STAIRS = register(
            "gray_oak_stairs",
            new StairsBlock(
                    GRAY_OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(GRAY_OAK_PLANKS)
            )
    );
    public static final Block GRAY_OAK_SLAB = register(
            "gray_oak_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()
            )
    );
    public static final Block GRAY_OAK_FENCE = register(
            "gray_oak_fence",
            new FenceBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(GRAY_OAK_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block GRAY_OAK_FENCE_GATE = register(
            "gray_oak_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create().mapColor(GRAY_OAK_PLANKS.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).burnable()
            )
    );
    public static final Block GRAY_OAK_DOOR = register(
            "gray_oak_door",
            new DoorBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(GRAY_OAK_PLANKS.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(3.0F)
                            .nonOpaque()
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block GRAY_OAK_TRAPDOOR = register(
            "gray_oak_trapdoor",
            new TrapdoorBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(3.0F)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .burnable()
            )
    );
    public static final Block GRAY_OAK_PRESSURE_PLATE = register(
            "gray_oak_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(GRAY_OAK_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(0.5F)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block GRAY_OAK_BUTTON = register("gray_oak_button", Blocks.createWoodenButtonBlock(BlockSetType.OAK));
    public static final Block GRAY_OAK_LEAVES = register("gray_oak_leaves", Blocks.createLeavesBlock(BlockSoundGroup.GRASS));
    public static final Block GRAY_OAK_SAPLING = register(
            "gray_oak_sapling",
            new SaplingBlock(
                    SaplingGenerator.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GRAY)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block POTTED_GRAY_OAK_SAPLING = register("potted_gray_oak_sapling", Blocks.createFlowerPotBlock(GRAY_OAK_SAPLING));
    public static final Block GRAY_OAK_SIGN = registerWithoutItem(
            "gray_oak_sign",
            new TerraformSignBlock(
                    TexturePaths.GRAY_OAK_SIGN_TEXTURE,
                    AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().sounds(BlockSoundGroup.WOOD)
            )
    );
    public static final Block GRAY_OAK_WALL_SIGN = registerWithoutItem(
            "gray_oak_wall_sign",
            new TerraformWallSignBlock(
                    TexturePaths.GRAY_OAK_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE_GRAY)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .dropsLike(GRAY_OAK_SIGN)
                            .burnable()
                            .sounds(BlockSoundGroup.WOOD)
            )
    );
    public static final Block GRAY_OAK_HANGING_SIGN = registerWithoutItem(
            "gray_oak_hanging_sign",
            new TerraformHangingSignBlock(
                    TexturePaths.GRAY_OAK_HANGING_SIGN_TEXTURE, TexturePaths.GRAY_OAK_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create().mapColor(GRAY_OAK_LOG.getDefaultMapColor()).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().sounds(BlockSoundGroup.HANGING_SIGN)
            )
    );
    public static final Block GRAY_OAK_WALL_HANGING_SIGN = registerWithoutItem(
            "gray_oak_wall_hanging_sign",
            new TerraformWallHangingSignBlock(
                    TexturePaths.GRAY_OAK_HANGING_SIGN_TEXTURE, TexturePaths.GRAY_OAK_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(GRAY_OAK_LOG.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()
                            .dropsLike(GRAY_OAK_HANGING_SIGN)
                            .sounds(BlockSoundGroup.HANGING_SIGN)
            )
    );
    public static final Block GRAY_TORCH = register(
            "gray_torch",
            new TorchBlock(
                    ParticleTypes.FLAME,
                    AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block GRAY_WALL_TORCH = register(
            "gray_wall_torch",
            new WallTorchBlock(
                    ParticleTypes.FLAME,
                    AbstractBlock.Settings.create()
                            .noCollision()
                            .breakInstantly()
                            .luminance(state -> 14)
                            .sounds(BlockSoundGroup.WOOD)
                            .dropsLike(GRAY_TORCH)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    private static Block register(String name, Block block) {
        registerBlockAsItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Learning.MOD_ID, name), block);
    }

    private static Block registerWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Learning.MOD_ID, name), block);
    }

    private static void registerBlockAsItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Learning.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void initialize() {
        Learning.LOGGER.info("Blocks initialization for " + Learning.MOD_ID);
    }
}
