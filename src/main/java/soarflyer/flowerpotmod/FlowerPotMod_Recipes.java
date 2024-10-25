package soarflyer.flowerpotmod;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
//import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;
//import net.minecraft.core.data.registry.recipe.RecipeSymbol;
//import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
//import net.minecraft.core.data.registry.recipe.entry.RecipeEntryFurnace;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class FlowerPotMod_Recipes extends RecipeRegistry {
	public static final RecipeNamespace FLOWERPOTMOD = new RecipeNamespace();

	public static Block[] BaseFlowerPots = {
		Block.getBlock(BlockID + ID_Rose),
		Block.getBlock(BlockID + ID_Dandelion),
		Block.getBlock(BlockID + ID_Marigold),
		Block.getBlock(BlockID + ID_Bluebell),
		Block.getBlock(BlockID + ID_Heather),
		Block.getBlock(BlockID + ID_Orchid),

		Block.getBlock(BlockID + ID_Glory),
		Block.getBlock(BlockID + ID_Wintergreen),
		Block.getBlock(BlockID + ID_Nightshade),

		Block.getBlock(BlockID + ID_BrownShroom),
		Block.getBlock(BlockID + ID_RedShroom),
		Block.getBlock(BlockID + ID_WhiteShroom),
	};

	public static Block[] FlowerPots = {
		Block.getBlock(BlockID + ID_Simple),
		Block.getBlock(BlockID + ID_Varied),
		Block.getBlock(BlockID + ID_Warm),
		Block.getBlock(BlockID + ID_Cool),
		Block.getBlock(BlockID + ID_Weed),

		Block.getBlock(BlockID + ID_Shroom),
	};

	public static Block[] TreePots = {
		Block.getBlock(BlockID + ID_Oak),
		Block.getBlock(BlockID + ID_Birch),
		Block.getBlock(BlockID + ID_Pine),
		Block.getBlock(BlockID + ID_Cherry),
		Block.getBlock(BlockID + ID_Palm),
		Block.getBlock(BlockID + ID_Thorn),
		Block.getBlock(BlockID + ID_Eucalyptus),
		Block.getBlock(BlockID + ID_Shrub),
		Block.getBlock(BlockID + ID_Mossy),
		Block.getBlock(BlockID + ID_Cocoa),
		Block.getBlock(BlockID + ID_Retro),
	};

	public static Block[] Plants = {
		Block.getBlock(BlockID + ID_Dead),
		Block.getBlock(BlockID + ID_Sugarcane),

		Block.getBlock(BlockID + ID_Empty),

		Block.getBlock(BlockID + ID_Fern),
		Block.getBlock(BlockID + ID_Spinifex),
	};

	/////////////////////////////////////////////////////////////////
	public static Block[] Ground = {
		Block.getBlock(BlockID - ID_GloryFlower),
		Block.getBlock(BlockID - ID_WintergreenFlower),
		Block.getBlock(BlockID - ID_NightshadeFlower),
		Block.getBlock(BlockID - ID_WhiteMushroom),
	};

	public static void InitRecipes() {
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', Block.flowerRed) // Example of another input item

			.create("FlowerPot_Rose", new ItemStack(BaseFlowerPots[0], 1)); // Replace with your output item/block

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', Block.flowerYellow) // Example of another input item

			.create("FlowerPot_Dandelion", new ItemStack(BaseFlowerPots[1], 1)); // Replace with your output item/block

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', Block.flowerOrange) // Example of another input item

			.create("FlowerPot_Marigold", new ItemStack(BaseFlowerPots[2], 1)); // Replace with your output item/block

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', Block.flowerLightBlue) // Example of another input item

			.create("FlowerPot_Bluebell", new ItemStack(BaseFlowerPots[3], 1)); // Replace with your output item/block

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', Block.flowerPurple) // Example of another input item

			.create("FlowerPot_Heather", new ItemStack(BaseFlowerPots[4], 1)); // Replace with your output item/block

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', Block.flowerPink) // Example of another input item

			.create("FlowerPot_Orchid", new ItemStack(BaseFlowerPots[5], 1)); // Replace with your output item/block


		// fictional flowers replaced with proxies
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', new ItemStack(Ground[0], 1)) // Example of another input item

			.create("FlowerPot_Glory", new ItemStack(BaseFlowerPots[6], 1)); // Replace with your output item/block

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', new ItemStack(Ground[1], 1)) // Example of another input item

			.create("FlowerPot_Wintergreen", new ItemStack(BaseFlowerPots[7], 1)); // Replace with your output item/block

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', new ItemStack(Ground[2], 1)) // Example of another input item

			.create("FlowerPot_Nightshade", new ItemStack(BaseFlowerPots[8], 1)); // Replace with your output item/block


		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', Block.mushroomBrown)

			.create("FlowerPot_BrownShroom", new ItemStack(BaseFlowerPots[9], 1)); // Replace with your output item/block

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', Block.mushroomRed) // Example of another input item

			.create("FlowerPot_RedShroom", new ItemStack(BaseFlowerPots[10], 1)); // Replace with your output item/block

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"fff",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('f', new ItemStack(Ground[3], 1)) // Example of another input item

			.create("FlowerPot_WhiteShroom", new ItemStack(BaseFlowerPots[11], 1)); // Replace with your output item/block



	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"yry",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('y', Block.flowerYellow) // Example of another input item
			.addInput('r', Block.flowerRed) // Example of another input item

			.create("FlowerPot_Simple", new ItemStack(FlowerPots[0], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"rli",
				"pyo",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('r', Block.flowerRed) // Example of another input item
			.addInput('l', Block.flowerLightBlue) // Example of another input item
			.addInput('p', Block.flowerPurple) // Example of another input item
			.addInput('y', Block.flowerYellow) // Example of another input item
			.addInput('i', Block.flowerPink) // Example of another input item
			.addInput('o', Block.flowerOrange) // Example of another input item


			.create("FlowerPot_Varied", new ItemStack(FlowerPots[1], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"rpo",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('r', Block.flowerRed) // Example of another input item
			.addInput('o', Block.flowerOrange) // Example of another input item
			.addInput('p', Block.flowerPink) // Example of another input item

			.create("FlowerPot_Warm", new ItemStack(FlowerPots[2], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"wpc",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('p', Block.flowerPurple) // Example of another input item
			.addInput('w', new ItemStack(Ground[1], 1)) // Example of another input item
			.addInput('c', new ItemStack(Ground[0], 1)) // Example of another input item

			.create("FlowerPot_Cool", new ItemStack(FlowerPots[3], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"nly",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('l', Block.flowerLightBlue) // Example of another input item
			.addInput('n', new ItemStack(Ground[2], 1)) // Example of another input item
			.addInput('y', Block.flowerYellow) // Example of another input item

			.create("FlowerPot_Weed", new ItemStack(FlowerPots[4], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"orw",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('o', Block.mushroomBrown) // Example of another input item
			.addInput('r', Block.mushroomRed) // Example of another input item
			.addInput('w', new ItemStack(Ground[3], 1)) // Example of another input item

			.create("FlowerPot_Shroom", new ItemStack(FlowerPots[5], 1)); // Replace with your output item/block



		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingOak) // Example of another input item

			.create("FlowerPot_Oak", new ItemStack(TreePots[0], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingBirch) // Example of another input item

			.create("FlowerPot_Birch", new ItemStack(TreePots[1], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingPine) // Example of another input item

			.create("FlowerPot_Pine", new ItemStack(TreePots[2], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingCherry) // Example of another input item

			.create("FlowerPot_Cherry", new ItemStack(TreePots[3], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingPalm) // Example of another input item

			.create("FlowerPot_Palm", new ItemStack(TreePots[4], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingThorn) // Example of another input item

			.create("FlowerPot_Thorn", new ItemStack(TreePots[5], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingEucalyptus) // Example of another input item

			.create("FlowerPot_Eucalyptus", new ItemStack(TreePots[6], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingShrub) // Example of another input item

			.create("FlowerPot_Shrub", new ItemStack(TreePots[7], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"asa",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingOak) // Example of another input item
			.addInput('a', Block.algae) // Example of another input item

			.create("FlowerPot_Mossy", new ItemStack(TreePots[8], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('s', Block.saplingCacao) // Example of another input item

			.create("FlowerPot_Cocoa", new ItemStack(TreePots[9], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				" s ",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			//.addInput('b', Item.brickClay) // Example of another input item
			//.addInput('s', Item.foodAppleGold) // Example of another input item <-- too much I think
			.addInput('b', Item.ingotGold) // Example of another input item
			.addInput('s', Block.saplingOak) // Example of another input item

			.create("FlowerPot_Retro", new ItemStack(TreePots[10], 1)); // Replace with your output item/block



		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"ppp",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('p', Block.deadbush) // Example of another input item

			.create("FlowerPot_Dead", new ItemStack(Plants[0], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"ppp",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('p', Item.sugarcane) // Example of another input item

			.create("FlowerPot_Sugarcane", new ItemStack(Plants[1], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"ppp",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('p', new ItemStack(Item.dye, 1, 15)) // Example of another input item

			.create("FlowerPot_Empty", new ItemStack(Plants[2], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"ppp",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('p', Block.tallgrassFern) // Example of another input item

			.create("FlowerPot_Fern", new ItemStack(Plants[3], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"ppp",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('p', Block.spinifex) // Example of another input item

			.create("FlowerPot_Spinifex", new ItemStack(Plants[4], 1)); // Replace with your output item/block




		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		/// comment this out
		/*
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shapeless("MOD_ID")
			.addInput(Block.flowerPurple) // Replace with your input item/block
			.addInput(Block.flowerYellow) // Example of another input item

			.create("FlowerPot_GloryFlower", new ItemStack(Ground[0], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shapeless("MOD_ID")
			.addInput(Block.flowerPink) // Replace with your input item/block
			.addInput(Block.flowerYellow) // Example of another input item

			.create("FlowerPot_WintergreenFlower", new ItemStack(Ground[1], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shapeless("MOD_ID")
			.addInput(Block.flowerLightBlue) // Replace with your input item/block
			.addInput(Block.flowerYellow) // Example of another input item

			.create("FlowerPot_NightshadeFlower", new ItemStack(Ground[2], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shapeless("MOD_ID")
			.addInput(Block.mushroomBrown) // Replace with your input item/block
			.addInput(Block.mushroomRed) // Example of another input item

			.create("FlowerPot_WhiteMushroom", new ItemStack(Ground[3], 1)); // Replace with your output item/block
		*/
		/// ^ comment out

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shapeless("MOD_ID")
			.addInput(new ItemStack(Ground[0], 1)) // Replace with your input item/block

			.create("FlowerPot_GloryCyan", new ItemStack(Item.dye, 2, 6)); // Replace with your output item/block
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shapeless("MOD_ID")
			.addInput(new ItemStack(Ground[1], 1)) // Replace with your input item/block

			.create("FlowerPot_WintergreenLime", new ItemStack(Item.dye, 2, 10)); // Replace with your output item/block
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shapeless("MOD_ID")
			.addInput(new ItemStack(Ground[2], 1)) // Replace with your input item/block

			.create("FlowerPot_NightshadeMagenta", new ItemStack(Item.dye, 2, 13)); // Replace with your output item/block
	}



	public static void InitNameSpaces() {

		// So, you can use this template to add more groups if needed.
		// Constant for a group of crafting recipes related to the workbench.
		//final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH =

			// Create a new RecipeGroup instance.
			//new RecipeGroup<>(

			//	// Create a RecipeSymbol for the workbench.
			//	new RecipeSymbol(

			//		// ItemStack representing the workbench block.
			//		new ItemStack(Block.workbench)
			//	)
			//);

		// Add the recipe group - id: yourGroupId
		//PARAGLIDER.register("workbench", WORKBENCH); // what does this even do? oh well


		// If you have furnace recipes
		// final RecipeGroup<RecipeEntryFurnace> FURNACE = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.furnaceStoneActive)));
		// PARAGLIDER.register("furnace", FURNACE);

		// Register all
		Registries.RECIPES.register("MOD_ID", FLOWERPOTMOD);

	}

}
