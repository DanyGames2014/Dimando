package net.danygames2014.dimando.block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

public class DimandoOreBlock extends TemplateBlockBase {
    public DimandoOreBlock(Identifier identifier) {
        super(identifier, Material.STONE);
        this.hardness = 5F;
        this.resistance = 10F;
        this.sounds = BlockBase.STONE_SOUNDS;
    }
}
