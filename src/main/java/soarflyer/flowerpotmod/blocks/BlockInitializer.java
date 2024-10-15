package soarflyer.flowerpotmod.blocks;

import net.minecraft.client.render.block.model.BlockModelCrossedSquares;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import soarflyer.flowerpotmod.blocks.flowerpots.*;
import soarflyer.flowerpotmod.blocks.models.Model_BottomFlowerPot;
import soarflyer.flowerpotmod.blocks.models.Model_TopFlowerPot;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.EntityHelper;

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

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder1 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_SimpleFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_SimpleFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_SimpleFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);


		custom_block = new Bottom_SimpleFlowerPot("flowerpot_simplebottom", BlockID + ID_Simple);
		custom_bottom_builder1.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder2 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_VariedFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_VariedFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_VariedFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_VariedFlowerPot("flowerpot_variedbottom", BlockID + ID_Varied);
		custom_bottom_builder2.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder3 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_WarmFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_WarmFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_WarmFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_WarmFlowerPot("flowerpot_warmbottom", BlockID + ID_Warm);
		custom_bottom_builder3.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder4 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_CoolFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_CoolFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_CoolFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_CoolFlowerPot("flowerpot_coolbottom", BlockID + ID_Cool);
		custom_bottom_builder4.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_block_builder5 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_WeedFlowerPot")
			.setSideTextures("flowerpotmod:block/Side_WeedFlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_WeedFlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_WeedFlowerPot("flowerpot_weedbottom", BlockID + ID_Weed);
		custom_block_builder5.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder6 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_OakTreePot("flowerpot_oakbottom", BlockID + ID_Oak);
		custom_bottom_builder6.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder7 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_BirchTreePot("flowerpot_birchbottom", BlockID + ID_Birch);
		custom_bottom_builder7.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder8 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_PineTreePot("flowerpot_pinebottom", BlockID + ID_Pine);
		custom_bottom_builder8.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder9 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTicking(true)
			.setTopTexture("flowerpotmod:block/Top_FruitingTreePot")
			.setSideTextures("flowerpotmod:block/Side_FruitingTreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_FruitingTreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_CherryTreePot("flowerpot_cherrybottom", BlockID + ID_Cherry);
		custom_bottom_builder9.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder10 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_PalmTreePot("flowerpot_palmbottom", BlockID + ID_Palm);
		custom_bottom_builder10.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder11 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_ThornTreePot("flowerpot_thornbottom", BlockID + ID_Thorn);
		custom_bottom_builder11.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder12 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_EucalyptusTreePot("flowerpot_eucalyptusbottom", BlockID + ID_Eucalyptus);
		custom_bottom_builder12.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder13 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_ShrubTreePot("flowerpot_shrubbottom", BlockID + ID_Shrub);
		custom_bottom_builder13.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder14 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_MossyTreePot("flowerpot_mossybottom", BlockID + ID_Mossy);
		custom_bottom_builder14.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder15 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FruitingTreePot")
			.setSideTextures("flowerpotmod:block/Side_FruitingTreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_FruitingTreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_CocoaTreePot("flowerpot_cocoabottom", BlockID + ID_Cocoa);
		custom_bottom_builder15.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder16 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_RetroTreePot("flowerpot_retrobottom", BlockID + ID_Retro);
		custom_bottom_builder16.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder17 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FlowerPot")
			.setSideTextures("flowerpotmod:block/Side_FlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_RoseFlowerPot("flowerpot_rosebottom", BlockID + ID_Rose);
		custom_bottom_builder17.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder18 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FlowerPot")
			.setSideTextures("flowerpotmod:block/Side_FlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_DandelionFlowerPot("flowerpot_dandelionbottom", BlockID + ID_Dandelion);
		custom_bottom_builder18.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder19 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FlowerPot")
			.setSideTextures("flowerpotmod:block/Side_FlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_MarigoldFlowerPot("flowerpot_marigoldbottom", BlockID + ID_Marigold);
		custom_bottom_builder19.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder20 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FlowerPot")
			.setSideTextures("flowerpotmod:block/Side_FlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_BluebellFlowerPot("flowerpot_bluebellbottom", BlockID + ID_Bluebell);
		custom_bottom_builder20.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder21 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FlowerPot")
			.setSideTextures("flowerpotmod:block/Side_FlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_HeatherFlowerPot("flowerpot_heatherbottom", BlockID + ID_Heather);
		custom_bottom_builder21.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder22 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FlowerPot")
			.setSideTextures("flowerpotmod:block/Side_FlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_OrchidFlowerPot("flowerpot_orchidbottom", BlockID + ID_Orchid);
		custom_bottom_builder22.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder23 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FlowerPot")
			.setSideTextures("flowerpotmod:block/Side_FlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_GloryFlowerPot("flowerpot_glorybottom", BlockID + ID_Glory);
		custom_bottom_builder23.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder24 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FlowerPot")
			.setSideTextures("flowerpotmod:block/Side_FlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_WintergreenFlowerPot("flowerpot_wintergreenbottom", BlockID + ID_Wintergreen);
		custom_bottom_builder24.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder25 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FlowerPot")
			.setSideTextures("flowerpotmod:block/Side_FlowerPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FlowerPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_NightshadeFlowerPot("flowerpot_nightshadebottom", BlockID + ID_Nightshade);
		custom_bottom_builder25.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder26 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FungusPot")
			.setSideTextures("flowerpotmod:block/Side_FungusPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FungusPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_BrownShroomPot("flowerpot_brownshroombottom", BlockID + ID_BrownShroom);
		custom_bottom_builder26.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder27 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FungusPot")
			.setSideTextures("flowerpotmod:block/Side_FungusPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FungusPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_RedShroomPot("flowerpot_redshroombottom", BlockID + ID_RedShroom);
		custom_bottom_builder27.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder28 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_FungusPot")
			.setSideTextures("flowerpotmod:block/Side_FungusPot")
			.setBottomTexture("flowerpotmod:block/Bottom_FungusPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_WhiteShroomPot("flowerpot_whiteshroombottom", BlockID + ID_WhiteShroom);
		custom_bottom_builder28.build(custom_block);

		// Creating BOTTOM blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_bottom_builder29 = standard_block_builder
			.setBlockModel(Model_BottomFlowerPot::new)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(0.5F)
			.setTopTexture("flowerpotmod:block/Top_ShroomPot")
			.setSideTextures("flowerpotmod:block/Side_ShroomPot")
			.setBottomTexture("flowerpotmod:block/Bottom_ShroomPot")
			.setTags(BlockTags.PREVENT_MOB_SPAWNS, BlockTags.MINEABLE_BY_PICKAXE);

		custom_block = new Bottom_ShroomPot("flowerpot_shroombottom", BlockID + ID_Shroom);
		custom_bottom_builder29.build(custom_block);


		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///// TOP
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder1 = standard_block_builder
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
		custom_top_builder1.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder2 = standard_block_builder
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
		custom_top_builder2.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder3 = standard_block_builder
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
		custom_top_builder3.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder4 = standard_block_builder
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
		custom_top_builder4.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder5 = standard_block_builder
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
		custom_top_builder5.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder6 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_OakTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_OakTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_OakTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_OakTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_OakTreePot("flowerpot_oaktop", BlockID + ID_Oak + 1);
		custom_top_builder6.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder7 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_BirchTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_BirchTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_BirchTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_BirchTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_BirchTreePot("flowerpot_birchtop", BlockID + ID_Birch + 1);
		custom_top_builder7.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder8 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_PineTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_PineTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_PineTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_PineTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_PineTreePot("flowerpot_pinetop", BlockID + ID_Pine + 1);
		custom_top_builder8.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder9 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_CherryTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_CherryTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_CherryTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_CherryTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_CherryTreePot("flowerpot_cherrytop", BlockID + ID_Cherry + 1);
		custom_top_builder9.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder9b = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_CherryTreePot_Flowering")
			.setEastTexture("flowerpotmod:block/Arrangement_CherryTreePot_Flowering")
			.setSouthTexture("flowerpotmod:block/ArrangementF_CherryTreePot_Flowering")
			.setWestTexture("flowerpotmod:block/ArrangementF_CherryTreePot_Flowering")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_CherryTreePot_Flowering("flowerpot_cherrytop_flowering", BlockID + ID_Cherry + 2);
		custom_top_builder9b.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder9c = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_CherryTreePot_Fruiting")
			.setEastTexture("flowerpotmod:block/Arrangement_CherryTreePot_Fruiting")
			.setSouthTexture("flowerpotmod:block/ArrangementF_CherryTreePot_Fruiting")
			.setWestTexture("flowerpotmod:block/ArrangementF_CherryTreePot_Fruiting")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_CherryTreePot_Fruiting("flowerpot_cherrytop_fruiting", BlockID + ID_Cherry + 3);
		custom_top_builder9c.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder10 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_PalmTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_PalmTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_PalmTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_PalmTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_PalmTreePot("flowerpot_palmtop", BlockID + ID_Palm + 1);
		custom_top_builder10.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder11 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_ThornTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_ThornTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_ThornTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_ThornTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_ThornTreePot("flowerpot_palmtop", BlockID + ID_Thorn + 1);
		custom_top_builder11.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder12 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_EucalyptusTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_EucalyptusTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_EucalyptusTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_EucalyptusTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_EucalyptusTreePot("flowerpot_eucalyptustop", BlockID + ID_Eucalyptus + 1);
		custom_top_builder12.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder13 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_ShrubTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_ShrubTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_ShrubTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_ShrubTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_ShrubTreePot("flowerpot_shrubtop", BlockID + ID_Shrub + 1);
		custom_top_builder13.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder14 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_MossyTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_MossyTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_MossyTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_MossyTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_MossyTreePot("flowerpot_mossytop", BlockID + ID_Mossy + 1);
		custom_top_builder14.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder15 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_CocoaTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_CocoaTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_CocoaTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_CocoaTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_CocoaTreePot("flowerpot_cocoatop", BlockID + ID_Cocoa + 1);
		custom_top_builder15.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder15b = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_CocoaTreePot_Flowering")
			.setEastTexture("flowerpotmod:block/Arrangement_CocoaTreePot_Flowering")
			.setSouthTexture("flowerpotmod:block/ArrangementF_CocoaTreePot_Flowering")
			.setWestTexture("flowerpotmod:block/ArrangementF_CocoaTreePot_Flowering")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_CocoaTreePot_Flowering("flowerpot_cocoatop_flowering", BlockID + ID_Cocoa + 2);
		custom_top_builder15b.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder15c = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_CocoaTreePot_Fruiting")
			.setEastTexture("flowerpotmod:block/Arrangement_CocoaTreePot_Fruiting")
			.setSouthTexture("flowerpotmod:block/ArrangementF_CocoaTreePot_Fruiting")
			.setWestTexture("flowerpotmod:block/ArrangementF_CocoaTreePot_Fruiting")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_CocoaTreePot_Fruiting("flowerpot_cocoatop_fruiting", BlockID + ID_Cocoa + 3);
		custom_top_builder15c.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder16 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_RetroTreePot")
			.setEastTexture("flowerpotmod:block/Arrangement_RetroTreePot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_RetroTreePot")
			.setWestTexture("flowerpotmod:block/ArrangementF_RetroTreePot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_RetroTreePot("flowerpot_retrotop", BlockID + ID_Retro + 1);
		custom_top_builder16.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder17 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_RoseFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_RoseFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_RoseFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_RoseFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_RoseFlowerPot("flowerpot_rosetop", BlockID + ID_Rose + 1);
		custom_top_builder17.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder18 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_DandelionFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_DandelionFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_DandelionFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_DandelionFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_DandelionFlowerPot("flowerpot_dandeliontop", BlockID + ID_Dandelion + 1);
		custom_top_builder18.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder19 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_MarigoldFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_MarigoldFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_MarigoldFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_MarigoldFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_MarigoldFlowerPot("flowerpot_marigoldtop", BlockID + ID_Marigold + 1);
		custom_top_builder19.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder20 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_BluebellFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_BluebellFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_BluebellFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_BluebellFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_BluebellFlowerPot("flowerpot_bluebelltop", BlockID + ID_Bluebell + 1);
		custom_top_builder20.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder21 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_HeatherFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_HeatherFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_HeatherFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_HeatherFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_HeatherFlowerPot("flowerpot_heathertop", BlockID + ID_Heather + 1);
		custom_top_builder21.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder22 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_OrchidFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_OrchidFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_OrchidFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_OrchidFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_OrchidFlowerPot("flowerpot_orchidtop", BlockID + ID_Orchid + 1);
		custom_top_builder22.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder23 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_GloryFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_GloryFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_GloryFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_GloryFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_GloryFlowerPot("flowerpot_glorytop", BlockID + ID_Glory + 1);
		custom_top_builder23.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder24 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_WintergreenFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_WintergreenFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_WintergreenFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_WintergreenFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_WintergreenFlowerPot("flowerpot_wintergreentop", BlockID + ID_Wintergreen + 1);
		custom_top_builder24.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder25 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_NightshadeFlowerPot")
			.setEastTexture("flowerpotmod:block/Arrangement_NightshadeFlowerPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_NightshadeFlowerPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_NightshadeFlowerPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_NightshadeFlowerPot("flowerpot_nightshadetop", BlockID + ID_Nightshade + 1);
		custom_top_builder25.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder26 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_BrownShroomPot")
			.setEastTexture("flowerpotmod:block/Arrangement_BrownShroomPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_BrownShroomPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_BrownShroomPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_BrownShroomPot("flowerpot_brownshroomtop", BlockID + ID_BrownShroom + 1);
		custom_top_builder26.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder27 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_RedShroomPot")
			.setEastTexture("flowerpotmod:block/Arrangement_RedShroomPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_RedShroomPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_RedShroomPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_RedShroomPot("flowerpot_redshroomtop", BlockID + ID_RedShroom + 1);
		custom_top_builder27.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder28 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_WhiteShroomPot")
			.setEastTexture("flowerpotmod:block/Arrangement_WhiteShroomPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_WhiteShroomPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_WhiteShroomPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_WhiteShroomPot("flowerpot_whiteshroomtop", BlockID + ID_WhiteShroom + 1);
		custom_top_builder28.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder29 = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_ShroomPot")
			.setEastTexture("flowerpotmod:block/Arrangement_ShroomPot")
			.setSouthTexture("flowerpotmod:block/ArrangementF_ShroomPot")
			.setWestTexture("flowerpotmod:block/ArrangementF_ShroomPot")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_ShroomPot("flowerpot_shroomtop", BlockID + ID_Shroom + 1);
		custom_top_builder29.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder29b = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_ShroomPot_Flowering")
			.setEastTexture("flowerpotmod:block/Arrangement_ShroomPot_Flowering")
			.setSouthTexture("flowerpotmod:block/ArrangementF_ShroomPot_Flowering")
			.setWestTexture("flowerpotmod:block/ArrangementF_ShroomPot_Flowering")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_ShroomPot_Flowering("flowerpot_shroomtop_flowering", BlockID + ID_Shroom + 2);
		custom_top_builder29b.build(custom_block);

		// Creating TOP blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_top_builder29c = standard_block_builder
			.setBlockModel(Model_TopFlowerPot::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setNorthTexture("flowerpotmod:block/Arrangement_ShroomPot_Fruiting")
			.setEastTexture("flowerpotmod:block/Arrangement_ShroomPot_Fruiting")
			.setSouthTexture("flowerpotmod:block/ArrangementF_ShroomPot_Fruiting")
			.setWestTexture("flowerpotmod:block/ArrangementF_ShroomPot_Fruiting")
			.setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.PREVENT_MOB_SPAWNS);

		custom_block = new Top_ShroomPot_Fruiting("flowerpot_shroomtop_fruiting", BlockID + ID_Shroom + 3);
		custom_top_builder29c.build(custom_block);


		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///// GROUND
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Creating GROUND blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_ground_builder1 = standard_block_builder
			.setBlockModel(BlockModelCrossedSquares::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setTextures("flowerpotmod:block/Ground_Glory")
			.setTags(BlockTags.PLANTABLE_IN_JAR, BlockTags.BROKEN_BY_FLUIDS);

		custom_block = new Ground_GloryFlower("flowerpot_gloryflower", BlockID - ID_GloryFlower);
		custom_ground_builder1.build(custom_block);

		// Creating GROUND blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_ground_builder2 = standard_block_builder
			.setBlockModel(BlockModelCrossedSquares::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setTextures("flowerpotmod:block/Ground_Wintergreen")
			.setTags(BlockTags.PLANTABLE_IN_JAR, BlockTags.BROKEN_BY_FLUIDS);

		custom_block = new Ground_WintergreenFlower("flowerpot_wintergreenflower", BlockID - ID_WintergreenFlower);
		custom_ground_builder2.build(custom_block);

		// Creating GROUND blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_ground_builder3 = standard_block_builder
			.setBlockModel(BlockModelCrossedSquares::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setTextures("flowerpotmod:block/Ground_Nightshade")
			.setTags(BlockTags.PLANTABLE_IN_JAR, BlockTags.BROKEN_BY_FLUIDS);

		custom_block = new Ground_NightshadeFlower("flowerpot_nightshadeflower", BlockID - ID_NightshadeFlower);
		custom_ground_builder3.build(custom_block);

		// Creating GROUND blocks ////////////////////////////////////////////////////////////////////////////////////
		BlockBuilder custom_ground_builder4 = standard_block_builder
			.setBlockModel(BlockModelCrossedSquares::new)
			.setBlockSound(BlockSounds.GRASS)
			.setHardness(1.0F)
			.setResistance(1.0F)
			.setUseInternalLight()
			.setTextures("flowerpotmod:block/Ground_WhiteMushroom")
			.setTags(BlockTags.PLANTABLE_IN_JAR, BlockTags.BROKEN_BY_FLUIDS);

		custom_block = new Ground_WhiteMushroom("flowerpot_whitemushroom", BlockID - ID_WhiteMushroom);
		custom_ground_builder4.build(custom_block);

		// next time i swear ill use metadata or something instead of this
	}
}
