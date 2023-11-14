package net.danygames2014.dimando.block;

import lombok.Setter;
import net.danygames2014.dimando.tileentity.CamoBlockTileEntity;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.block.material.Material;
import net.minecraft.level.BlockView;
import net.minecraft.tileentity.TileEntityBase;
import net.modificationstation.stationapi.api.registry.BlockRegistry;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.template.block.TemplateBlockWithEntity;

public class CamoBlock extends TemplateBlockWithEntity {
    @Setter
    private Identifier blockTexture = ModID.MINECRAFT.id("wool");
    @Setter
    private int blockTextureMeta = 0;

    public CamoBlock(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public int getTextureForSide(BlockView blockView, int x, int y, int z, int side) {
        CamoBlockTileEntity camoBlockTileEntity = (CamoBlockTileEntity)blockView.getTileEntity(x,y,z);
        return BlockRegistry.INSTANCE.get(camoBlockTileEntity.blockTexture).getTextureForSide(side, camoBlockTileEntity.blockTextureMeta);
    }

    @Override
    protected TileEntityBase createTileEntity() {
        return new CamoBlockTileEntity();
    }
}
