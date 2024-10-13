package soarflyer.flowerpotmod;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryFurnace;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import soarflyer.flowerpotmod.blocks.BlockInitializer;
import turniplabs.halplibe.helper.RecipeBuilder;

import static java.awt.Color.white;
import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class FlowerPotMod_Recipes extends RecipeRegistry {
	public static final RecipeNamespace FLOWERPOTMOD = new RecipeNamespace();

	public static Block[] FlowerPots = {
		Block.getBlock(BlockID + ID_Simple),
		Block.getBlock(BlockID + ID_Varied),
		Block.getBlock(BlockID + ID_Warm),
		Block.getBlock(BlockID + ID_Cool),
		Block.getBlock(BlockID + ID_Weed),
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
		Block.getBlock(BlockID + ID_Retro)
	};




	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void InitRecipes() {
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
				"hhh",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('h', Block.flowerPurple) // Example of another input item

			.create("FlowerPot_Cool", new ItemStack(FlowerPots[3], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		RecipeBuilder.Shaped("MOD_ID")
			.setShape(
				"   ",
				"yly",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('y', Block.flowerYellow) // Example of another input item
			.addInput('l', Block.flowerLightBlue) // Example of another input item

			.create("FlowerPot_Weed", new ItemStack(FlowerPots[4], 1)); // Replace with your output item/block

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
				"lll",
				"sss",
				"bdb")
			.addInput('d', Block.dirt) // Replace with your input item/block
			.addInput('b', Item.brickClay) // Example of another input item
			.addInput('l', Block.leavesOak) // Example of another input item
			.addInput('s', Item.stick) // Example of another input item

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

	}





















	public static void InitNameSpaces() {

		// So, you can use this template to add more groups if needed.
		// Constant for a group of crafting recipes related to the workbench.
		final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH =

			// Create a new RecipeGroup instance.
			new RecipeGroup<>(

				// Create a RecipeSymbol for the workbench.
				new RecipeSymbol(

					// ItemStack representing the workbench block.
					new ItemStack(Block.workbench)
				)
			);

		// Add the recipe group - id: yourGroupId
		//PARAGLIDER.register("workbench", WORKBENCH);


		// If you have furnace recipes
		// final RecipeGroup<RecipeEntryFurnace> FURNACE = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.furnaceStoneActive)));
		// PARAGLIDER.register("furnace", FURNACE);

		// Register all
		Registries.RECIPES.register("MOD_ID", FLOWERPOTMOD);

	}

}
