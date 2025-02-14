package fr.quentin.learning.block.custom;

import com.mojang.serialization.MapCodec;
import fr.quentin.learning.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class ChilliBlock extends CropBlock {
    public static final MapCodec<ChilliBlock> CODEC = createCodec(ChilliBlock::new);
    public static final IntProperty AGE = Properties.AGE_2;
    private static final VoxelShape[] SHAPES = new VoxelShape[]{
            Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 6.0, 11.0),
            Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 8.0, 12.0),
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 14.0, 14.0)
    };

    @Override
    public MapCodec<ChilliBlock> getCodec() {
        return CODEC;
    }

    public ChilliBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES[this.getAge(state)];
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 2;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CHILLI_SEEDS;
    }

    @Override
    public BlockState withAge(int age) {
        return this.getDefaultState().with(AGE, Math.min(age, getMaxAge()));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(3) != 0) {
            super.randomTick(state, world, pos, random);
        }
    }

    @Override
    protected int getGrowthAmount(World world) {
        return 1;
    }
}
