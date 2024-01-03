package net.danygames2014.dimando.util;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Util {
    public static boolean setBlock(World world, BlockPos blockPos, int id){
        return world.setBlock(blockPos.x, blockPos.y, blockPos.z, id);
    }
}
