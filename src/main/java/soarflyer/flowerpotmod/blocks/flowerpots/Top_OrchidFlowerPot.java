package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Top_OrchidFlowerPot extends Block {
	public Top_OrchidFlowerPot(String key, int id) {
		super(key, id, Material.plant);
	}

	/// Change this when making new blocks
	//int ChangeID = BlockID + ID_Orchid;
	int ChangeTopID = BlockID + ID_Orchid + 1;


	// Be aware that there's no selection box
	// you can place them, but the only way to remove them is by removing the block under them
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		int MyID = world.getBlockId(x, y, z);
		//int UpID = world.getBlockId(x, y + 1, z);
		int DownID = world.getBlockId(x, y - 1, z);
		if (MyID == ChangeTopID && DownID == 0) {
			world.setBlockAndMetadataWithNotify(x, y, z, 0, world.getBlockMetadata(x, y, z));
		}
	}


	public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
		int MyID = world.getBlockId(x, y, z);
		//int UpID = world.getBlockId(x, y + 1, z);
		int DownID = world.getBlockId(x, y - 1, z);
		if (MyID == ChangeTopID && DownID < BlockID) {
			world.setBlockAndMetadataWithNotify(x, y, z, 0, world.getBlockMetadata(x, y, z));
			world.dropItem(x, y, z, new ItemStack(Block.getBlock(ChangeTopID), 1));
		}
		if (MyID == ChangeTopID && DownID > BlockID + BlockIDMax) {
			world.setBlockAndMetadataWithNotify(x, y, z, 0, world.getBlockMetadata(x, y, z));
			world.dropItem(x, y, z, new ItemStack(Block.getBlock(ChangeTopID), 1));
		}

	}

	@Override
	public boolean isCollidable() {
		return false;
	}
	@Override
	// Determines if the block pushes you out and can suffocate you
	public boolean isSolidRender() {
		return false;
	}
	@Override
	// Determines if neighboring blocks should cull their sides, among many other things
	public boolean renderAsNormalBlock() {
		return false;
	}
}
