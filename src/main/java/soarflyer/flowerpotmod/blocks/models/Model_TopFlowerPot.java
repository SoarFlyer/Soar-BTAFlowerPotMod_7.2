package soarflyer.flowerpotmod.blocks.models;

import net.minecraft.client.render.RenderBlocks;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;

import javax.annotation.Nullable;
// AO go away
// go away AO
// AO I don't want you here
// shoo shoo AO
// AO go away
public class Model_TopFlowerPot<T extends Block> extends BlockModelStandard<T> {
	public Model_TopFlowerPot(Block block) {
		super(block);
	}
	public boolean render(Tessellator tessellator, int x, int y, int z) {
		renderBlocks.enableAO = false;
		this.block.setBlockBoundsBasedOnState(renderBlocks.blockAccess, x, y, z);

		renderBlocks.enableAO = false; // does this work?????
		RenderBlocks.enableDirectionalLight = false;

		// I could not get texture flipping to work without an actual flipped .png file for some reason
		// spent too much on this problem I give up who caaares
		boolean flag = false;
		flag |= this.renderBlocks.enableAO = false;
		// Draw North
		block.setBlockBounds(1, -0.5, 0.5625, 0, 0.5, 0.5625);
			renderBlocks.flipTexture = true;
		flag |= this.renderBlocks.enableAO = false;
		this.renderBlocks.enableAO = false;
		flag |= this.renderStandardBlock(tessellator, this.block, x ,y ,z );
		// Draw South
		block.setBlockBounds(1, -0.5, 0.4375, 0, 0.5, 0.4375);
			renderBlocks.flipTexture = false;
		flag |= this.renderBlocks.enableAO = false;
		this.renderBlocks.enableAO = false;
		flag |= this.renderStandardBlock(tessellator, this.block, x, y, z);

		// Draw West
		block.setBlockBounds(0.4375, -0.5, 1, 0.4375, 0.5, 0);
			renderBlocks.flipTexture = true;
		flag |= this.renderBlocks.enableAO = false;
		this.renderBlocks.enableAO = false;
		flag |= this.renderStandardBlock(tessellator, this.block, x, y, z);
		// Draw East
		block.setBlockBounds(0.5625, -0.5, 1, 0.5625, 0.5, 0);
			renderBlocks.flipTexture = false;
		flag |= this.renderBlocks.enableAO = false;
		this.renderBlocks.enableAO = false;
		flag |= this.renderStandardBlock(tessellator, this.block, x, y, z);

		renderBlocks.enableAO = false; //PLEADEFDS

		this.block.setBlockBoundsBasedOnState(BlockModelStandard.renderBlocks.blockAccess, x, y, z);
		return flag;
	}


	// Inventory model
	// -----------------------------------------------------------------------------------------------------------------------------------
	@Override
	public void renderBlockOnInventory(Tessellator tessellator, int metadata, float brightness, float alpha, @Nullable Integer lightmapCoordinate) {
		// Draw North
		block.setBlockBounds(1, 0, 0.5625, 0, 1, 0.5625);
		// Draw South
		block.setBlockBounds(1, 0, 0.4375, 0, 1, 0.4375);

		// Draw West
		block.setBlockBounds(0.4375, 0, 1, 0.4375, 1, 0);
		// Draw East
		block.setBlockBounds(0.5625, 0, 1, 0.5625, 1, 0);
		super.renderBlockOnInventory(tessellator, metadata, 15.0f, alpha, lightmapCoordinate);
	}
}
