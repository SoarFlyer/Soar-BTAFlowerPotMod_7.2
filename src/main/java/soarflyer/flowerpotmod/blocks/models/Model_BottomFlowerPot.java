package soarflyer.flowerpotmod.blocks.models;

import net.minecraft.client.render.RenderBlocks;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;

import javax.annotation.Nullable;

public class Model_BottomFlowerPot<T extends Block> extends BlockModelStandard<T> {
	public Model_BottomFlowerPot(Block block) {
		super(block);
	}

	@Override
	public boolean render(Tessellator tessellator, int x, int y, int z) {

		renderBlocks.enableAO = false;
		RenderBlocks.enableDirectionalLight = false;

		boolean flag = false;
		block.setBlockBounds(0.1875, 0, 0.1875, 0.8125, 0.5, 0.8125);
		flag |= this.renderStandardBlock(tessellator, this.block, x, y, z);

		this.block.setBlockBoundsBasedOnState(BlockModelStandard.renderBlocks.blockAccess, x, y, z);
		return flag;
	}


	// Inventory model
	// -----------------------------------------------------------------------------------------------------------------------------------
	@Override
	public void renderBlockOnInventory(Tessellator tessellator, int metadata, float brightness, float alpha, @Nullable Integer lightmapCoordinate) {
		// Draw the lower cube of the model
		block.setBlockBounds(0.1875, 0.0, 0.1875, 0.8125, 0.5, 0.8125);
		super.renderBlockOnInventory(tessellator, metadata, 10.0f, alpha, lightmapCoordinate);
	}
}
