package soarflyer.flowerpotmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import soarflyer.flowerpotmod.blocks.BlockInitializer;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

/// ------------------------------------------------------
// To create a new flower pot
// make a new ID right down below
// ID_[name] is how the game will generate an ID
// it should be offset from the last one by 2
// 1, 3, 5, 7, 9, etc
// this is because top blocks will generate their own ID by adding 1
//
// Now create a Top_[name] and Bottom_[name] java files in /blocks/flowerpots
// copy the entirety of a previous Top_ and Bottom_ file
// and change the name and ID inside the new file
//
// After this, go to BlockInitializer
// there are sections labeled BOTTOM and TOP
// copy a block builder in each section and place ID_[name], or ID_[name] + 1, for bottom and top blocks
// then set the names to be your new java files, and define the texture locations
// make sure there's a flipped version of the sprite, if it's a top!
//
// Finally, go to FlowerPotMod_Recipes
// place your new ID_[name] in the flowerpots array
// copy a recipe builder, and set it to output the id by its array number
// define the shape of the recipe should be fairly straightforward
//
// And don't forget to name it in en_US.lang!
/// ------------------------------------------------------

public class FlowerPotMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "FlowerPotMod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final int BlockID = 14120;
	public static final int BlockIDMax = 50; // this is so tops can exist on different bottoms,
	// and delete themselves if not on a block added by this mod

	// Create bottom block, block ID set to BlockID + ID_[]
	// Create top block, block ID set to BlockID + ID_[] + 1
	// In blocks, use ID_[] + 1 to check surroundings
	public static final int ID_Simple = 1;
	public static final int ID_Varied = 3;
	public static final int ID_Warm = 5;
	public static final int ID_Cool = 7;
	public static final int ID_Weed = 9;

	public static final int ID_Oak = 11;
	public static final int ID_Birch = 13;
	public static final int ID_Pine = 15;
	public static final int ID_Cherry = 17;
	public static final int ID_Palm = 19;
	public static final int ID_Thorn = 21;
	public static final int ID_Eucalyptus= 23;
	public static final int ID_Shrub = 25;
	public static final int ID_Mossy = 27;
	public static final int ID_Retro = 29;


    @Override
    public void onInitialize() {
        LOGGER.info("Flower Pot Mod initialized.");
    }

	@Override
	public void beforeGameStart() {
		new BlockInitializer().Initialize();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		FlowerPotMod_Recipes.InitRecipes();
	}

	@Override
	public void initNamespaces() {
		FlowerPotMod_Recipes.InitNameSpaces();
	}
}
