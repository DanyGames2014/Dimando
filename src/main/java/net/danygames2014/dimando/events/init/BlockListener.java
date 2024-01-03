package net.danygames2014.dimando.events.init;

import net.danygames2014.dimando.block.DimandoOreBlock;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class BlockListener {
    @Entrypoint.Namespace
    public static final Namespace MOD_ID = Null.get();

    public static Block poor_dimando_ore;
    public static Block dimando_ore;
    public static Block rich_dimando_ore;

    @EventListener
    public void registerBlock(BlockRegistryEvent event) {
        poor_dimando_ore = new DimandoOreBlock(MOD_ID.id("poor_dimando_ore")).setTranslationKey(MOD_ID, "poor_dimando_ore");
        dimando_ore = new DimandoOreBlock(MOD_ID.id("dimando_ore")).setTranslationKey(MOD_ID, "dimando_ore");
        rich_dimando_ore = new DimandoOreBlock(MOD_ID.id("rich_dimando_ore")).setTranslationKey(MOD_ID, "rich_dimando_ore");
    }
}
