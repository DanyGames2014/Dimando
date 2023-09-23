package net.danygames2014.dimando.events.init;

import net.danygames2014.dimando.block.DimandoOreBlock;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.BlockBase;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.util.Null;

public class BlockListener {
    @Entrypoint.ModID
    public static final ModID MOD_ID = Null.get();

    public static BlockBase poor_dimando_ore;
    public static BlockBase dimando_ore;
    public static BlockBase rich_dimando_ore;

    @EventListener
    public void registerBlock(BlockRegistryEvent event){
        poor_dimando_ore = new DimandoOreBlock(MOD_ID.id("poor_dimando_ore")).setTranslationKey(MOD_ID, "poor_dimando_ore");
        dimando_ore = new DimandoOreBlock(MOD_ID.id("dimando_ore")).setTranslationKey(MOD_ID, "dimando_ore");
        rich_dimando_ore = new DimandoOreBlock(MOD_ID.id("rich_dimando_ore")).setTranslationKey(MOD_ID, "rich_dimando_ore");
    }
}
