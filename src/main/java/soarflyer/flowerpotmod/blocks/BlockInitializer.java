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
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
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
			.setTopTexture("flowerpotmod:block/Top_TreePot")
			.setSideTextures("flowerpotmod:block/Side_TreePot")
			.setBottomTexture("flowerpotmod:block/Bottom_TreePot")
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
	}
}
