package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;
import soarflyer.flowerpotmod.blocks.BlockInitializer;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Top_CoolFlowerPot extends Block {
	public Top_CoolFlowerPot(String key, int id) {
		super(key, id, Material.plant);
	}

	/// Change this when making new blocks
	int ChangeID = BlockID + ID_Cool;
	int ChangeTopID = BlockID + ID_Cool + 1;


	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
		int MyID = world.getBlockId(x, y, z);
		int UpID = world.getBlockId(x, y + 1, z);
		int DownID = world.getBlockId(x, y - 1, z);
		if (MyID == ChangeTopID && DownID == 0) {
			world.setBlockAndMetadata(x, y, z, 0, world.getBlockMetadata(x, y, z));
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
