package net.danygames2014.dimando.world;

import net.danygames2014.dimando.Dimando;
import net.danygames2014.dimando.events.init.BlockListener;
import net.minecraft.level.Level;
import net.minecraft.level.structure.Structure;

import java.util.Random;

public class DimandoOreStructure extends Structure {
    @Override
    public boolean generate(Level world, Random random, int x, int y, int z) {
        int richness = random.nextInt(0,10);

        // POOR
        if(richness <= 4){
            world.setTileInChunk(x,y,z, BlockListener.poor_dimando_ore.id);
            return true;

        // NORMAL
        } else if (richness <= 8) {
            world.setTileInChunk(x,y,z, BlockListener.dimando_ore.id);
            return true;

        // RICH
        } else if (richness == 9) {
            world.setTileInChunk(x,y,z, BlockListener.rich_dimando_ore.id);
            return true;

        // WHAT?!
        } else{
            Dimando.logger.error("Richness was " + richness + ", this shouldn't happen");
            return false;
        }
    }
}
