package emt.tile.solar.fire;

import emt.init.EMTBlocks;
import emt.util.EMTConfigHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class TileEntityDoubleFireSolar extends TileEntityFireSolar {

	public TileEntityDoubleFireSolar() {
		output = EMTConfigHandler.doubleCompressedSolarOutput;
	}

	@Override
	public ItemStack getWrenchDrop(EntityPlayer entityPlayer) {
		return new ItemStack(EMTBlocks.emtSolars, 1, 13);
	}
}
