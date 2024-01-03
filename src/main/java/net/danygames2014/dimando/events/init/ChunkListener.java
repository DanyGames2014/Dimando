package net.danygames2014.dimando.events.init;

import net.danygames2014.dimando.world.DimandoOreStructure;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.world.dimension.OverworldDimension;
import net.modificationstation.stationapi.api.event.world.gen.WorldGenEvent;

public class ChunkListener {

    public static DimandoOreStructure dimandoOreStructure = new DimandoOreStructure();

    @EventListener
    public void populate(WorldGenEvent.ChunkDecoration event){
        if (event.world.dimension instanceof OverworldDimension) populateOverworld(event);
    }

    public void populateOverworld(WorldGenEvent.ChunkDecoration event){
        // x and z start at the 0,0 edge of the chunk border
        int x = event.random.nextInt(0,15);
        int y = event.random.nextInt(-3,3);
        int z = event.random.nextInt(0,15);
        dimandoOreStructure.method_1142(event.world,event.random,event.x+x,70+y,event.z+z);
    }
}
