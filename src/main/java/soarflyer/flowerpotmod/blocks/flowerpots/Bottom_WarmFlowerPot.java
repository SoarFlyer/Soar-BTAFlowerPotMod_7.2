package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

import java.util.ArrayList;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Bottom_WarmFlowerPot extends Block {
	public Bottom_WarmFlowerPot(String key, int id) {
		super(key, id, Material.dirt);

	}

	/// Change this when making new blocks
	int ChangeID = BlockID + ID_Warm;
	int ChangeTopID = BlockID + ID_Warm + 1;



	@Override
	public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
		int myId = world.getBlockId(x, y, z);
		int myMetadata = world.getBlockMetadata(x, y, z);
		int upId = world.getBlockId(x, y + 1, z);
		int downId = world.getBlockId(x, y - 1, z);
		if (myId == ChangeID && upId == 0) {
			world.setBlockAndMetadata(x, y + 1, z, ChangeTopID, myMetadata);
		}
	}

	// Don't know if this works
	// Tops remove themselves anyway
	@Override
	public void onBlockRemoved(World world, int x, int y, int z, int data) {
		int myId = world.getBlockId(x, y, z);
		int myMetadata = world.getBlockMetadata(x, y, z);
		int upId = world.getBlockId(x, y + 1, z);
		int downId = world.getBlockId(x, y - 1, z);
		if (myId == ChangeID && upId == ChangeTopID) {
			world.setBlockAndMetadata(x, y + 1, z, 0, myMetadata);
		}
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


	// Selection box
	@Override
	public void setBlockBoundsBasedOnState(WorldSource world, int x, int y, int z) {
		// Resets block bounds
		this.setBlockBounds(0.1475, 0.0, 0.1475, 0.8525, 0.75, 0.8525);
	}
	// Player collision box
	@Override
	public void getCollidingBoundingBoxes(World world, int x, int y, int z, AABB aabb, ArrayList<AABB> aabbList) {
		// Adds the collision box for the bottom section of the block
		setBlockBounds(0.2, 0, 0.2, 0.8, 0.5, 0.8);
		super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
	}
}
