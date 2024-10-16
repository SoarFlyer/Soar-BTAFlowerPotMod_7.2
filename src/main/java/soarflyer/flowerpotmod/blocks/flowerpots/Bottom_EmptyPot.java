package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

import java.util.ArrayList;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Bottom_EmptyPot extends Block {
	public Bottom_EmptyPot(String key, int id) {
		super(key, id, Material.dirt);

	}

	/// Change this when making new blocks
	//int ChangeID = BlockID + ID_Empty;
	//int ChangeTopID = BlockID + ID_Empty + 1;



	@Override
	public boolean onBlockRightClicked(World world, int x, int y, int z, EntityPlayer player, Side side, double xHit, double yHit) {
		int UpID = world.getBlockId(x, y + 1, z);
		if (player.getHeldItem() != null){
			if ((player.getHeldItem().getItem() == Item.toolShears) || (player.getHeldItem().getItem() == Item.toolShearsSteel)){
				if ((UpID >= BlockID) && (UpID <= BlockID + BlockIDMax)) {
					world.setBlockAndMetadataWithNotify(x, y + 1, z, 0, world.getBlockMetadata(x, y, z));
					world.dropItem(x, y, z, new ItemStack(Block.getBlock(UpID), 1));
					// this is a bit janky
					// but now you can mix and match pots!!!!!
					// :)
				}
			}
		}
		return super.onBlockRightClicked(world, x, y, z, player, side, xHit, yHit);
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