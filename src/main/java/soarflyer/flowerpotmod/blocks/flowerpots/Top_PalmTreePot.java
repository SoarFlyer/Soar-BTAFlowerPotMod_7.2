package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.ArrayList;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Top_PalmTreePot extends Block {
	public Top_PalmTreePot(String key, int id) {
		super(key, id, Material.plant);
	}

	/// Change this when making new blocks
	//int ChangeID = BlockID + ID_Palm;
	int ChangeTopID = BlockID + ID_Palm + 1;


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
			if (!world.isClientSide) {
				world.dropItem(x, y, z, new ItemStack(Block.getBlock(ChangeTopID), 1));
			}
		}
		if (MyID == ChangeTopID && DownID > BlockID + BlockIDMax) {
			world.setBlockAndMetadataWithNotify(x, y, z, 0, world.getBlockMetadata(x, y, z));
			if (!world.isClientSide) {
				world.dropItem(x, y, z, new ItemStack(Block.getBlock(ChangeTopID), 1));
			}
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

	@Override
	public void getCollidingBoundingBoxes(World world, int x, int y, int z, AABB aabb, ArrayList<AABB> aabbList) {
		// Adds the collision box for the bottom section of the block
		setBlockBounds(0.2, -1, 0.2, 0.8, -0.5, 0.8);
		super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
	}
}

