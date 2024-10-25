package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.IBonemealable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Ground_WintergreenFlower extends BlockFlower implements IBonemealable {
	public Ground_WintergreenFlower(String key, int id) {
		super(key, id);
		this.setBlockBounds(0.3F, 0.0F, 0.3F, 0.7F, 0.6F, 0.7F);
	}

	int ThisFlower = BlockID - ID_WintergreenFlower;

	// this is some straight ooga booga shit
	@Override
	public boolean onBonemealUsed(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, Side side, double d, double e) {
		Random rand = world.rand;

		//int MyID = world.getBlockId(x, y, z);

		int NorthID = world.getBlockId(x+1, y, z);
		int SouthID = world.getBlockId(x-1, y, z);
		int EastID = world.getBlockId(x, y, z+1);
		int WestID = world.getBlockId(x, y, z-1);

		int NorthEastID = world.getBlockId(x+1, y, z+1);
		int SouthEastID = world.getBlockId(x-1, y, z+1);
		int NorthWestID = world.getBlockId(x+1, y, z-1);
		int SouthWestID = world.getBlockId(x-1, y, z-1);

		int NorthDID = world.getBlockId(x+1, y-1, z);
		int SouthDID = world.getBlockId(x-1, y-1, z);
		int EastDID = world.getBlockId(x, y-1, z+1);
		int WestDID = world.getBlockId(x, y-1, z-1);

		int NorthEastDID = world.getBlockId(x+1, y-1, z+1);
		int SouthEastDID = world.getBlockId(x-1, y-1, z+1);
		int NorthWestDID = world.getBlockId(x+1, y-1, z-1);
		int SouthWestDID = world.getBlockId(x-1, y-1, z-1);

		if (!world.isClientSide) {
			if (entityPlayer.getGamemode().consumeBlocks()) {
				--itemStack.stackSize;
			}

			if (rand.nextInt(15) < 10) {
				if ((NorthID == 0 || NorthID == Block.layerSnow.id) && !(Block.blocksList[NorthDID] == null || !Block.blocksList[NorthDID].hasTag(BlockTags.GROWS_FLOWERS))) {
					world.setBlockAndMetadataWithNotify(x + 1, y, z, ThisFlower, world.getBlockMetadata(x, y, z));
				}
			}
			if (rand.nextInt(15) < 10) {
				if ((SouthID == 0 || SouthID == Block.layerSnow.id) && !(Block.blocksList[SouthDID] == null || !Block.blocksList[SouthDID].hasTag(BlockTags.GROWS_FLOWERS))) {
					world.setBlockAndMetadataWithNotify(x - 1, y, z, ThisFlower, world.getBlockMetadata(x, y, z));
				}
			}
			if (rand.nextInt(15) < 10) {
				if ((EastID == 0 || EastID == Block.layerSnow.id) && !(Block.blocksList[EastDID] == null || !Block.blocksList[EastDID].hasTag(BlockTags.GROWS_FLOWERS))) {
					world.setBlockAndMetadataWithNotify(x, y, z + 1, ThisFlower, world.getBlockMetadata(x, y, z));
				}
			}
			if (rand.nextInt(15) < 10) {
				if ((WestID == 0 || WestID == Block.layerSnow.id) && !(Block.blocksList[WestDID] == null || !Block.blocksList[WestDID].hasTag(BlockTags.GROWS_FLOWERS))) {
					world.setBlockAndMetadataWithNotify(x, y, z - 1, ThisFlower, world.getBlockMetadata(x, y, z));
				}
			}

			if (rand.nextInt(20) < 10) {
				if ((NorthEastID == 0 || NorthEastID == Block.layerSnow.id) && !(Block.blocksList[NorthEastDID] == null || !Block.blocksList[NorthEastDID].hasTag(BlockTags.GROWS_FLOWERS))) {
					world.setBlockAndMetadataWithNotify(x + 1, y, z + 1, ThisFlower, world.getBlockMetadata(x, y, z));
				}
			}
			if (rand.nextInt(20) < 10) {
				if ((NorthWestID == 0 || NorthWestID == Block.layerSnow.id) && !(Block.blocksList[NorthWestDID] == null || !Block.blocksList[NorthWestDID].hasTag(BlockTags.GROWS_FLOWERS))) {
					world.setBlockAndMetadataWithNotify(x + 1, y, z - 1, ThisFlower, world.getBlockMetadata(x, y, z));
				}
			}
			if (rand.nextInt(20) < 10) {
				if ((SouthEastID == 0 || SouthEastID == Block.layerSnow.id) && !(Block.blocksList[SouthEastDID] == null || !Block.blocksList[SouthEastDID].hasTag(BlockTags.GROWS_FLOWERS))) {
					world.setBlockAndMetadataWithNotify(x - 1, y, z + 1, ThisFlower, world.getBlockMetadata(x, y, z));
				}
			}
			if (rand.nextInt(20) < 10) {
				if ((SouthWestID == 0 || SouthWestID == Block.layerSnow.id) && !(Block.blocksList[SouthWestDID] == null || !Block.blocksList[SouthWestDID].hasTag(BlockTags.GROWS_FLOWERS))) {
					world.setBlockAndMetadataWithNotify(x - 1, y, z - 1, ThisFlower, world.getBlockMetadata(x, y, z));
				}
			}
		}
		return true;
	}
}
