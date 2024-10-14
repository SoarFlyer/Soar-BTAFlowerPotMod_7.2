package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.world.World;

public class Ground_WintergreenFlower extends BlockFlower {

	public Ground_WintergreenFlower(String key, int id) {
		super(key, id);
		this.setBlockBounds(0.3F, 0.0F, 0.3F, 0.7F, 0.6F, 0.7F);
	}
}
