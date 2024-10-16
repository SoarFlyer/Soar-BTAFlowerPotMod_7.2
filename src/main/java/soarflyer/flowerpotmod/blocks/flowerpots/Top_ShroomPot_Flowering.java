package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

import java.util.ArrayList;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Top_ShroomPot_Flowering extends Block {
	public Top_ShroomPot_Flowering(String key, int id) {
		super(key, id, Material.plant);
	}

	/// Change this when making new blocks
	int ChangeID = BlockID + ID_Shroom;
	int ChangeTopID = BlockID + ID_Shroom + 2;


	// Be aware that there's no selection box
	// you can place them, but the only way to remove them is by removing the block under them
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		int MyID = world.getBlockId(x, y, z);
		int UpID = world.getBlockId(x, y + 1, z);
		int DownID = world.getBlockId(x, y - 1, z);
		if (MyID == ChangeTopID && DownID == 0) {
			world.setBlockAndMetadata(x, y, z, 0, world.getBlockMetadata(x, y, z));
		}
	}

	public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
		int MyID = world.getBlockId(x, y, z);
		int UpID = world.getBlockId(x, y + 1, z);
		int DownID = world.getBlockId(x, y - 1, z);
		if (MyID == ChangeTopID && DownID < BlockID) {
			world.setBlockAndMetadata(x, y, z, 0, world.getBlockMetadata(x, y, z));
			world.dropItem(x, y, z, new ItemStack(Block.getBlock(ChangeTopID), 1));
		}
		if (MyID == ChangeTopID && DownID > BlockID + BlockIDMax) {
			world.setBlockAndMetadata(x, y, z, 0, world.getBlockMetadata(x, y, z));
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
