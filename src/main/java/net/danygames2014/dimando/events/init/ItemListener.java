package net.danygames2014.dimando.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;
import net.modificationstation.stationapi.api.util.Null;

public class ItemListener {

    @Entrypoint.ModID
    public static final ModID MOD_ID = Null.get();

    ItemBase dimando;
    ItemBase small_dimando;
    ItemBase tiny_dimando;

    @EventListener
    public void registerItems(ItemRegistryEvent event){
        dimando = new TemplateItemBase(MOD_ID.id("dimando")).setTranslationKey(MOD_ID, "dimando");
        small_dimando = new TemplateItemBase(MOD_ID.id("small_dimando")).setTranslationKey(MOD_ID, "small_dimando");
        tiny_dimando = new TemplateItemBase(MOD_ID.id("tiny_dimando")).setTranslationKey(MOD_ID, "tiny_dimando");
    }
}
