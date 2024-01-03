package net.danygames2014.dimando.world;

import net.danygames2014.dimando.Dimando;
import net.danygames2014.dimando.events.init.BlockListener;
import net.danygames2014.dimando.util.NeighbourBlockPos;
import net.danygames2014.dimando.util.Util;
import net.minecraft.class_239;
import net.minecraft.world.World;

import java.util.Random;

public class DimandoOreStructure extends class_239 {
    @Override
    public boolean method_1142(World world, Random random, int x, int y, int z) {
        int richness = random.nextInt(0, 10);

        switch (richness) {
            case 9:
            case 8:
                world.setBlock(x, y, z, BlockListener.rich_dimando_ore.id);
                return true;

            case 7:
            case 6:
            case 5:
                world.setBlock(x, y, z, BlockListener.dimando_ore.id);
                return true;

            case 4:
            case 3:
            case 2:
                Util.setBlock(world, NeighbourBlockPos.getRandomNeighbourBlockPos(random, x, y, z), BlockListener.poor_dimando_ore.id);
            case 1:
                Util.setBlock(world, NeighbourBlockPos.getRandomNeighbourBlockPos(random, x, y, z), BlockListener.poor_dimando_ore.id);
            case 0:
                world.setBlock(x, y, z, BlockListener.poor_dimando_ore.id);
                return true;

            default:
                Dimando.logger.error("Richness was " + richness + ", this shouldn't happen");
                return false;

        }
    }
}
