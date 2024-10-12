package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Top_WeedFlowerPot extends Block {
	public Top_WeedFlowerPot(String key, int id) {
		super(key, id, Material.grass);
	}

	/// Change this when making new blocks
	int ChangeID = BlockID + ID_Weed;
	int ChangeTopID = BlockID + ID_Weed + 1;


	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		int myId = world.getBlockId(x, y, z);
		int myMetadata = world.getBlockMetadata(x, y, z);
		int upId = world.getBlockId(x, y + 1, z);
		int downId = world.getBlockId(x, y - 1, z);
		if (myId == ChangeTopID && downId == 0) {
			world.setBlockAndMetadata(x, y, z, 0, myMetadata);
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
