package net.danygames2014.dimando.world;

import net.danygames2014.dimando.Dimando;
import net.danygames2014.dimando.events.init.BlockListener;
import net.minecraft.level.Level;
import net.minecraft.level.structure.Structure;

import java.util.Random;

public class DimandoOreStructure extends Structure {
    @Override
    public boolean generate(Level world, Random random, int x, int y, int z) {
        int richness = random.nextInt(0, 10);

        switch (richness) {
            case 9:
            case 8:
                world.setTileInChunk(x, y, z, BlockListener.rich_dimando_ore.id);
                return true;

            case 7:
            case 6:
            case 5:
                world.setTileInChunk(x, y, z, BlockListener.dimando_ore.id);
                return true;

            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                world.setTileInChunk(x, y, z, BlockListener.poor_dimando_ore.id);
                return true;

            default:
                Dimando.logger.error("Richness was " + richness + ", this shouldn't happen");
                return false;

        }
    }
}
