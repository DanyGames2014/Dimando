package net.danygames2014.dimando.mixin;

import net.danygames2014.dimando.block.CamoBlock;
import net.danygames2014.dimando.events.init.BlockListener;
import net.danygames2014.dimando.tileentity.CamoBlockTileEntity;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.Block;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.registry.BlockRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Block.class)
public class ItemBaseMixin {
    @Inject(method = "useOnTile", at = @At("HEAD"), cancellable = true)
    public void camoBlockUse(ItemInstance itemInstance, PlayerBase playerBase, Level world, int x, int y, int z, int par7, CallbackInfoReturnable<Boolean> cir){
        if((world.getBlockState(x, y, z).getBlock().id == BlockListener.camoBlock.id) && !(((Block) itemInstance.getType()).getBlock() == BlockListener.camoBlock)){
            CamoBlock block = (CamoBlock)world.getBlockState(x,y,z).getBlock();
            CamoBlockTileEntity tileEntity = (CamoBlockTileEntity)world.getTileEntity(x,y,z);
            tileEntity.blockTexture = BlockRegistry.INSTANCE.getId(((Block)itemInstance.getType()).getBlock());
            tileEntity.blockTextureMeta = itemInstance.getDamage();

            world.method_243(x,y,z);
            /*
            block.setBlockTexture(
                    BlockRegistry.INSTANCE.getId(
                            ((Block)itemInstance.getType()).getBlock()
                    )
            );
            block.setBlockTextureMeta(itemInstance.getDamage());
            */
            cir.cancel();
        }
    }
}
