package net.danygames2014.dimando.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

@SuppressWarnings("unused")
public class ItemListener {

    @Entrypoint.Namespace
    public static final Namespace MOD_ID = Null.get();

    public static Item dimando;
    public static Item small_dimando;
    public static Item tiny_dimando;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        dimando = new TemplateItem(MOD_ID.id("dimando")).setTranslationKey(MOD_ID, "dimando");
        small_dimando = new TemplateItem(MOD_ID.id("small_dimando")).setTranslationKey(MOD_ID, "small_dimando");
        tiny_dimando = new TemplateItem(MOD_ID.id("tiny_dimando")).setTranslationKey(MOD_ID, "tiny_dimando");
    }
}
