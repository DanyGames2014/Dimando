package net.danygames2014.dimando.block;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class DimandoOreBlock extends TemplateBlock {
    public DimandoOreBlock(Identifier identifier) {
        super(identifier, Material.STONE);
        this.hardness = 5F;
        this.resistance = 10F;
        this.soundGroup = Block.STONE_SOUND_GROUP;
    }
}
