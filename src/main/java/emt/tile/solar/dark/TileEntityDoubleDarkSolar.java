package emt.tile.solar.dark;

import emt.init.EMTBlocks;
import emt.util.EMTConfigHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class TileEntityDoubleDarkSolar extends TileEntityDarkSolar {

	public TileEntityDoubleDarkSolar() {
		output = EMTConfigHandler.doubleCompressedSolarOutput;
	}

	@Override
	public ItemStack getWrenchDrop(EntityPlayer entityPlayer) {
		return new ItemStack(EMTBlocks.emtSolars, 1, 7);
	}
}
