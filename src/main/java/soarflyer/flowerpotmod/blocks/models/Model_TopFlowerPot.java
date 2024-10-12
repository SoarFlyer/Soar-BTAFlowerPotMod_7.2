package soarflyer.flowerpotmod.blocks.models;

import net.minecraft.client.render.RenderBlocks;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;

import javax.annotation.Nullable;

public class Model_TopFlowerPot<T extends Block> extends BlockModelStandard<T> {
	public Model_TopFlowerPot(Block block) {
		super(block);
	}
	public boolean render(Tessellator tessellator, int x, int y, int z) {
		this.block.setBlockBoundsBasedOnState(renderBlocks.blockAccess, x, y, z);

		renderBlocks.enableAO = false;
		RenderBlocks.enableDirectionalLight = false;

		boolean flag = false;
		// Draw the upper cube of the model
		block.setBlockBounds(1, -0.5, 0.575, 0, 0.5, 0.575);
			renderBlocks.flipTexture = true;
		flag |= this.renderStandardBlock(tessellator, this.block, x ,y ,z );
		//mirror
		block.setBlockBounds(1, -0.5, 0.425, 0, 0.5, 0.425);
			renderBlocks.flipTexture = false;
		flag |= this.renderStandardBlock(tessellator, this.block, x, y, z);

		// Draw the upper cube of the model
		block.setBlockBounds(0.425, -0.5, 1, 0.425, 0.5, 0);
			renderBlocks.flipTexture = true;
		flag |= this.renderStandardBlock(tessellator, this.block, x, y, z);
		//mirror
		block.setBlockBounds(0.575, -0.5, 1, 0.575, 0.5, 0);
			renderBlocks.flipTexture = false;
		flag |= this.renderStandardBlock(tessellator, this.block, x, y, z);

		this.block.setBlockBoundsBasedOnState(BlockModelStandard.renderBlocks.blockAccess, x, y, z);
		return flag;

	}

	@Override
	public void renderBlockOnInventory(Tessellator tessellator, int metadata, float brightness, float alpha, @Nullable Integer lightmapCoordinate) {
		// Draw the lower cube of the model
		block.setBlockBounds(0, 0.0, 0.425, 1, 1.0, 0.425);
		//mirror
		block.setBlockBounds(1, 0.0, 0.575, 0, 1.0, 0.575);

		// Draw the upper cube of the model
		block.setBlockBounds(0.425, 0.0, 0, 0.425, 1.0, 1);
		//mirror
		block.setBlockBounds(0.575, 0.0, 1, 0.575, 1.0, 0);
		super.renderBlockOnInventory(tessellator, metadata, 15.0f, alpha, lightmapCoordinate);
	}
}
