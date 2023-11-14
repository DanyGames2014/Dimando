package net.danygames2014.dimando.tileentity;

import lombok.Setter;
import net.minecraft.tileentity.TileEntityBase;
import net.minecraft.util.io.CompoundTag;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;

public class CamoBlockTileEntity extends TileEntityBase {
    public Identifier blockTexture = ModID.MINECRAFT.id("wool");
    public int blockTextureMeta = 0;
    @Override
    public void writeIdentifyingData(CompoundTag arg) {
        arg.put("blockIdentifier", blockTexture.toString());
        arg.put("blockMeta", blockTextureMeta);
        super.writeIdentifyingData(arg);
    }

    @Override
    public void readIdentifyingData(CompoundTag arg) {
        blockTexture = Identifier.of(arg.getString("blockIdentifier"));
        blockTextureMeta = arg.getInt("blockMeta");
        super.readIdentifyingData(arg);
    }
}
