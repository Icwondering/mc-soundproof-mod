package com.piexelpioneer.soundproof.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SoundproofBlock extends Block {

  // 简单方块：无实体、无 tick，仅作为“隔音墙”的标记
  private static final VoxelShape SHAPE = Block.box(0,0,0,16,16,16);

  public SoundproofBlock(Properties properties) {
    super(properties);
  }

  @Override
  public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
    return SHAPE;
  }
}
