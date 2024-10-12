package soarflyer.flowerpotmod.blocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import soarflyer.flowerpotmod.blocks.flowerpots.*;
import soarflyer.flowerpotmod.blocks.models.Model_BottomFlowerPot;
import soarflyer.flowerpotmod.blocks.models.Model_TopFlowerPot;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.util.ConfigHandler;

import java.util.Properties;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class BlockInitializer {

	public static Block custom_block;

	public void Initialize() {

		/// this is so dumb
		/// oh well

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///// Bottom
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		BlockBuilder standard_block_builder = new BlockBuilder(MOD_ID); // BlockBuilder is available from Halplibe since 7.1

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder1 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_SimpleFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_SimpleFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_SimpleFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);


		custom_block = new Bottom_SimpleFlowerPot("flowerpot_simplebottom", BlockID + ID_Simple);
		custom_block_builder1.build(custom_block);

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder2 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_VariedFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_VariedFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_VariedFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_VariedFlowerPot("flowerpot_variedbottom", BlockID + ID_Varied);
		custom_block_builder2.build(custom_block);

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder4 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_WarmFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_WarmFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_WarmFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_WarmFlowerPot("flowerpot_warmbottom", BlockID + ID_Warm);
		custom_block_builder4.build(custom_block);

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder5 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_CoolFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_CoolFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_CoolFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_CoolFlowerPot("flowerpot_coolbottom", BlockID + ID_Cool);
		custom_block_builder5.build(custom_block);

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder6 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_WeedFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_WeedFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_WeedFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_WeedFlowerPot("flowerpot_weedbottom", BlockID + ID_Weed);
		custom_block_builder6.build(custom_block);

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///// TOP
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder3 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_SimpleFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_SimpleFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_SimpleFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_SimpleFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_SimpleFlowerPot("flowerpot_simpletop", BlockID + ID_Simple + 1);
		custom_block_builder3.build(custom_block);

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder7 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_VariedFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_VariedFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_VariedFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_VariedFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_VariedFlowerPot("flowerpot_variedtop", BlockID + ID_Varied + 1);
		custom_block_builder7.build(custom_block);

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder8 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_WarmFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_WarmFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_WarmFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_WarmFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_WarmFlowerPot("flowerpot_warmtop", BlockID + ID_Warm + 1);
		custom_block_builder8.build(custom_block);

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder9 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_CoolFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_CoolFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_CoolFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_CoolFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_CoolFlowerPot("flowerpot_cooltop", BlockID + ID_Cool + 1);
		custom_block_builder9.build(custom_block);

		// Creating blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder10 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_WeedFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_WeedFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_WeedFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_WeedFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_WeedFlowerPot("flowerpot_weedtop", BlockID + ID_Weed + 1);
		custom_block_builder10.build(custom_block);
	}
}
