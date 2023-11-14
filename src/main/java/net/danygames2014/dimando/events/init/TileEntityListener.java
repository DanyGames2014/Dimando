package net.danygames2014.dimando.events.init;

import net.danygames2014.dimando.tileentity.CamoBlockTileEntity;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.tileentity.TileEntityRegisterEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.util.Null;

public class TileEntityListener {

    @Entrypoint.ModID
    public static final ModID MOD_ID = Null.get();

    @EventListener
    public void registerTileEntities(TileEntityRegisterEvent event){
        event.register(CamoBlockTileEntity.class, "camo_block");
    }
}
