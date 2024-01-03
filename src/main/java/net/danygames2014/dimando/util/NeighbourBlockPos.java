package net.danygames2014.dimando.util;

import net.minecraft.util.math.BlockPos;

import java.util.Random;

public enum NeighbourBlockPos {
    // Above
    POSITIVE_Y(0,1,0),
    POSITIVE_Y_NEGATIVE_Z(0,1,-1),
    POSITIVE_Y_POSITIVE_Z(0,1,1),
    POSITIVE_Y_POSITIVE_X(1,1,0),
    POSITIVE_Y_POSITIVE_X_NEGATIVE_Z(1,1,-1),
    POSITIVE_Y_POSITIVE_X_POSITIVE_Z(1,1,1),
    POSITIVE_Y_NEGATIVE_X(-1,1,0),
    POSITIVE_Y_NEGATIVE_X_POSITIVE_Z(-1,1,1),
    POSITIVE_Y_NEGATIVE_X_NEGATIVE_Z(-1,1,-1),

    // Level
    POSITIVE_X(1,0,0),
    NEGATIVE_X(-1,0,0),
    POSITIVE_Z(0,0,1),
    NEGATIVE_Z(0,0,-1),
    POSITIVE_X_POSITIVE_Z(1,0,1),
    POSITIVE_X_NEGATIVE_Z(1,0,-1),
    NEGATIVE_X_POSITIVE_Z(-1,0,1),
    NEGATIVE_X_NEGATIVE_Z(-1,0,-1),

    // Below
    NEGATIVE_Y(0,-1,0),
    NEGATIVE_Y_NEGATIVE_Z(0,-1,-1),
    NEGATIVE_Y_POSITIVE_Z(0,-1,1),
    NEGATIVE_Y_POSITIVE_X(1,-1,0),
    NEGATIVE_Y_POSITIVE_X_NEGATIVE_Z(1,-1,-1),
    NEGATIVE_Y_POSITIVE_X_POSITIVE_Z(1,-1,1),
    NEGATIVE_Y_NEGATIVE_X(-1,-1,0),
    NEGATIVE_Y_NEGATIVE_X_POSITIVE_Z(-1,-1,1),
    NEGATIVE_Y_NEGATIVE_X_NEGATIVE_Z(-1,-1,-1);

    private final int offsetX;
    private final int offsetY;
    private final int offsetZ;

    NeighbourBlockPos(int offsetX, int offsetY, int offsetZ) {
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.offsetZ = offsetZ;
    };

    public BlockPos getOffsetBlockPosFor(int x, int y, int z){
        return new BlockPos(x+this.offsetX, y+this.offsetY, z+this.offsetZ);
    }

    public static BlockPos getRandomNeighbourBlockPos(Random random, int x, int y, int z){
        int randomValue = random.nextInt(0,NeighbourBlockPos.values().length-1);

        NeighbourBlockPos sorroundingBlockPos = NeighbourBlockPos.values()[randomValue];

        return sorroundingBlockPos.getOffsetBlockPosFor(x,y,z);
    }
}
