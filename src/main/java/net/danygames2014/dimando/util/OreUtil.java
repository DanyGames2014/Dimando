package net.danygames2014.dimando.util;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class OreUtil {
    public static boolean setBlock(World world, BlockPos blockPos, int id){
        return setBlock(world, blockPos.x, blockPos.y, blockPos.z, id);
    }

    public static boolean setBlock(World world, int x, int y, int z, int id){
        return world.setBlock(x, y, z, id);
    }

    public static boolean generateOre(World world, int x, int y, int z, int id){
        if((world.getBlockState(x, y, z).getBlock().id == Block.STONE.id) || (world.getBlockState(x, y, z).getBlock().id == 0)){
            return setBlock(world, x, y, z, id);
        }
        return false;
    }

    public static boolean generateOre(World world, BlockPos blockPos, int id){
        return generateOre(world, blockPos.x, blockPos.y, blockPos.z, id);
    }

    public static boolean generateOreWithChance(World world, BlockPos blockPos, int id, Random random, int percentChance){
        if(chance(random, percentChance)){
            return generateOre(world, blockPos, id);
        }
        return false;
    }

    public static boolean generateNeighbourOre(World world, int x, int y, int z, int id, Random random){
        return generateOre(world, NeighbourBlockPos.getRandomNeighbourBlockPosFor(random, x, y, z), id);
    }

    public static boolean generateNeighbourOreWithChance(World  world, int x, int y, int z, int id, Random random, int percentChance){
        if(chance(random, percentChance)){
            return generateNeighbourOre(world, x, y, z, id, random);
        }
        return false;
    }

    public static boolean chance(Random random, int percent){
        boolean result = random.nextInt(0, 100) <= percent;
        System.out.printf("\nChance : %s => Result : %s", percent, result);
        return result;
    }
}
