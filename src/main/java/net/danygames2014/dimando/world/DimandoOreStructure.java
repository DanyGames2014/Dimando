package net.danygames2014.dimando.world;

import net.danygames2014.dimando.Dimando;
import net.danygames2014.dimando.events.init.BlockListener;
import net.danygames2014.dimando.util.NeighbourBlockPos;
import net.danygames2014.dimando.util.OreUtil;
import net.minecraft.class_239;
import net.minecraft.world.World;

import java.util.Random;

import static net.danygames2014.dimando.util.OreUtil.*;

public class DimandoOreStructure extends class_239 {
    @Override
    public boolean method_1142(World world, Random random, int x, int y, int z) {
        int richness = random.nextInt(0, 10);

        switch (richness) {
            case 9:
                generateNeighbourOreWithChance(world, x, y, z, BlockListener.rich_dimando_ore.id, random, 75);
            case 8:
                generateOre(world, x, y, z, BlockListener.rich_dimando_ore.id);
                generateNeighbourOreWithChance(world, x, y, z, BlockListener.dimando_ore.id, random, 35);
                return true;

            case 7:
                generateNeighbourOreWithChance(world, x, y, z, BlockListener.dimando_ore.id, random, 75);
            case 6:
                generateNeighbourOreWithChance(world, x, y, z, BlockListener.dimando_ore.id, random, 35);
            case 5:
                generateNeighbourOreWithChance(world, x, y, z, BlockListener.poor_dimando_ore.id, random, 50);
                generateOre(world, x, y, z, BlockListener.dimando_ore.id);
                return true;

            case 4:
                generateNeighbourOreWithChance(world, x, y, z, BlockListener.dimando_ore.id, random, 40);
            case 3:
                generateNeighbourOreWithChance(world, x, y, z, BlockListener.poor_dimando_ore.id, random, 90);
            case 2:
                generateNeighbourOreWithChance(world, x, y, z, BlockListener.poor_dimando_ore.id, random, 65);
            case 1:
                generateNeighbourOreWithChance(world, x, y, z, BlockListener.poor_dimando_ore.id, random, 35);
            case 0:
                generateOre(world, x, y, z, BlockListener.poor_dimando_ore.id);
                return true;

            default:
                Dimando.logger.error("Richness was " + richness + ", this shouldn't happen");
                return false;

        }
    }
}
