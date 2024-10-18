package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.LightLayer;
import net.minecraft.core.item.IBonemealable;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

import java.util.ArrayList;
import java.util.Random;


import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Bottom_CocoaTreePot extends Block implements IBonemealable {
	public Bottom_CocoaTreePot(String key, int id) {
		super(key, id, Material.dirt);
		super.setTicking(true);
	}

	/// Change this when making new blocks
	int ChangeID = BlockID + ID_Cocoa;
	int ChangeTopID = BlockID + ID_Cocoa + 1;

	int ChangeTopID_Flower = BlockID + ID_Cocoa + 2;
	int ChangeTopID_Fruit = BlockID + ID_Cocoa + 3;


	// for growing
	int RandyBig = 12500;
	float RandyInc = 0.01f;
	float RandyComp = RandyBig;

	/// base settings for reference, 100 of each pot, growing for 70 minutes
	// tick rate 100 for all
	// cherry randybig = 15000 / 1or2 drops
	// cocoa randybig = 17500 / 1 drop
	// shroom randybig = 20000 / 1or2or3 red/brown or 1or2 white
	/// after 70 minutes
	// 84 cherries
	// 41 cocoa
	// 66 shrooms 21R/27B/18W
	// harvested again 10 minutes later and got ~1/6ish+- the drops
	/// considering that you need a tree farm to even make that many pots, I think that's an ok return
	/// mushrooms may be high tho




	@Override
	public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
		int MyID = world.getBlockId(x, y, z);
		int UpID = world.getBlockId(x, y + 1, z);
		//int DownID = world.getBlockId(x, y - 1, z);
		if (MyID == ChangeID && UpID == 0) {
			world.setBlockAndMetadata(x, y + 1, z, ChangeTopID, world.getBlockMetadata(x, y, z));
		}
	}

	// Don't know if this works
	// Tops remove themselves anyway
	@Override
	public void onBlockRemoved(World world, int x, int y, int z, int data) {
		int MyID = world.getBlockId(x, y, z);
		int UpID = world.getBlockId(x, y + 1, z);
		//int DownID = world.getBlockId(x, y - 1, z);
		if (MyID == ChangeID && UpID == ChangeTopID) {
			world.setBlockAndMetadata(x, y + 1, z, 0, world.getBlockMetadata(x, y, z));
		}
	}



	@Override
	public boolean onBlockRightClicked(World world, int x, int y, int z, EntityPlayer player, Side side, double xHit, double yHit) {
		int MyID = world.getBlockId(x, y, z);
		int UpID = world.getBlockId(x, y + 1, z);
		//int DownID = world.getBlockId(x, y - 1, z);
		if (MyID == ChangeID && UpID == ChangeTopID_Fruit) {
			world.dropItem(x, y, z, new ItemStack(Item.dye, 1, 3)); // thanks luke /^.^ \  <-- evil face
			world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.5, (double)z + 0.5, "random.pop", 0.3F, 1.0f);
			world.setBlockAndMetadataWithNotify(x, y + 1, z, ChangeTopID_Flower, world.getBlockMetadata(x, y, z));
			player.swingItem();
			return true;
		}else if (player.getHeldItem() != null) { // this NEEDS to be its own if, or the game always crashes | cannot check for null and !null
			if ((player.getHeldItem().getItem() == Item.toolShears) || (player.getHeldItem().getItem() == Item.toolShearsSteel)) {
				if (((UpID >= BlockID) && (UpID <= BlockID + BlockIDMax)) && ((UpID != ChangeTopID_Flower) && UpID != ChangeTopID_Fruit)) {
					world.setBlockAndMetadataWithNotify(x, y + 1, z, 0, world.getBlockMetadata(x, y, z));
					world.dropItem(x, y, z, new ItemStack(Block.getBlock(UpID), 1));
					// this is a bit janky
					// but now you can mix and match pots!!!!!
					// :)
					world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.5, (double)z + 0.5, "random.pop", 0.3F, 1.0f);
					// can't find the shear sound path :(
				}
			} else if ((UpID == ChangeTopID_Flower) && (player.getHeldItem().getItem() == Item.foodAppleGold)) {
				if (player.getGamemode().isPlayerInvulnerable()) {
					world.setBlockAndMetadataWithNotify(x, y + 1, z, ChangeTopID_Fruit, world.getBlockMetadata(x, y, z));
				}
				// nested ifs look better than a long ass line I gotta horizontally scroll through
			}
		}
		return super.onBlockRightClicked(world, x, y, z, player, side, xHit, yHit);
	}

	public boolean onBonemealUsed(ItemStack itemStack, EntityPlayer entityPlayer, World world, int i, int j, int k, Side side, double d, double e) {
		int MyID = world.getBlockId(i, j, k);
		int UpID = world.getBlockId(i, j + 1, k);
		//int DownID = world.getBlockId(i, j - 1, k);
		if (MyID == ChangeID && UpID == ChangeTopID) {
			world.setBlockAndMetadataWithNotify(i, j + 1, k, ChangeTopID_Flower, world.getBlockMetadata(i, j, k));
			if (entityPlayer.getGamemode().consumeBlocks()) {
				--itemStack.stackSize;
			}
			return true;
		}else {
			return false;
		}

	}

	@Override
	public int tickRate() {
		return 100;
	}

	@Override // idk how this shit works dude i just typed out a screenshot useless posted
	public void updateTick(World world, int x, int y, int z, Random rand) {
		boolean flag = world.scheduledUpdatesAreImmediate;
		int MyID = world.getBlockId(x, y, z);
		int UpID = world.getBlockId(x, y + 1, z);
		//int DownID = world.getBlockId(x, y - 1, z);
		if ((MyID == ChangeID && UpID == ChangeTopID_Flower) && ((world.getSavedLightValue(LightLayer.Block,x,y+1,z) >= 5) || (((world.getSavedLightValue(LightLayer.Sky,x,y+1,z) - world.skyDarken) >= 5) && (world.canBlockSeeTheSky(x,y+1,z))))){ // jesus christ
			if ((rand.nextInt(RandyBig) > RandyComp)){
				RandyComp = RandyBig;
				world.setBlockAndMetadataWithNotify(x, y + 1, z, ChangeTopID_Fruit, world.getBlockMetadata(x, y, z));
			} else {
				RandyComp -= RandyInc;
			}
		}
		world.scheduleBlockUpdate(x,y,z,this.id,this.tickRate());
		world.scheduledUpdatesAreImmediate = flag; // why set x to y and then y to x ???
		// wtf is a flag???????
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
