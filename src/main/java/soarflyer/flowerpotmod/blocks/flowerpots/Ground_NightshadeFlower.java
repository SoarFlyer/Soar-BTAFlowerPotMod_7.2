package soarflyer.flowerpotmod.blocks.flowerpots;

import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class Ground_NightshadeFlower extends BlockFlower {
	public Ground_NightshadeFlower(String key, int id) {
		super(key, id);
		this.setBlockBounds(0.3F, 0.0F, 0.3F, 0.7F, 0.6F, 0.7F);
	}
}
