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
// (bonemealable ones add 3)
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
// defining the shape of the recipe should be fairly straightforward
//
// And don't forget to name it in en_US.lang!
//
// idk how to make a readable config file so i'll put thanks here
// thanks cloud54 for the nice mushroom textures i asked permission to use
// thanks luke and useless for the code that i stole without asking
/// ------------------------------------------------------

public class FlowerPotMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "FlowerPotMod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	/// as of now(now), blockid spans 14116 - 14227
	public static final int BlockID = 14120; // goes negative, see ground objects
	public static final int BlockIDMax = 107; // ---> add 1 to highest number <---
	// this is so tops can exist on different bottoms,
	// and delete themselves if not on a block added by this mod

	// Create bottom block, block ID set to BlockID + ID_[]
	// Create top block, block ID set to BlockID + ID_[] + 1
	// In blocks, use ID_[] + 1 to check surroundings
	// Bonemealables use ID_[] + 1, + 2, + 3

	/// single flowers  - top + 1
	public static final int ID_Empty = 0; // may use this for a dyable pot
	//public static final int ID_Special = 1; // just in case

	public static final int ID_Rose = 2;
	public static final int ID_Dandelion = 4;
	public static final int ID_Marigold = 6;
	public static final int ID_Bluebell = 8;
	public static final int ID_Heather = 10;
	public static final int ID_Orchid = 12;

	public static final int ID_Glory = 14;
	public static final int ID_Wintergreen = 16;
	public static final int ID_Nightshade = 18;

	public static final int ID_BrownShroom = 20;
	public static final int ID_RedShroom = 22;
	public static final int ID_WhiteShroom = 24;

	// Reserved - 26
	// Reserved - 28
	// Reserved - 30


	/// flower arrangements - top + 1
	public static final int ID_Simple = 32;
	public static final int ID_Varied = 34;
	public static final int ID_Warm = 36;
	public static final int ID_Cool = 38;
	public static final int ID_Weed = 40;

	// Reserved - 42
	// Reserved - 44
	// Reserved - 46
	// Reserved - 48
	// Reserved - 50
	// Reserved - 52


	/// tree pots - top + 1
	public static final int ID_Oak = 54;
	public static final int ID_Birch = 56;
	public static final int ID_Pine = 58;
	public static final int ID_Palm = 60;
	public static final int ID_Thorn = 62;
	public static final int ID_Eucalyptus= 64;
	public static final int ID_Shrub = 66;
	public static final int ID_Mossy = 68;
	public static final int ID_Retro = 70;

	// Reserved - 72
	// Reserved - 74
	// Reserved - 76


	/// plant pots - top + 1
	public static final int ID_Dead = 78;
	public static final int ID_Sugarcane = 80;

	// Reserved - 82
	// Reserved - 84
	// Reserved - 86
	// Reserved - 88
	// Reserved - 90
	// Reserved - 92
	// Reserved - 94


	/// bonemealable - top + 3
	public static final int ID_Cherry = 96;
	public static final int ID_Cocoa = 100;
	public static final int ID_Shroom = 104;

	// Reserved - 108
	// Reserved - 112
	// Reserved - 116


	/// ground objects have their IDs go backwards from blockID
	// these flowers don't exist in the world
	public static final int ID_GloryFlower = 1;
	public static final int ID_WintergreenFlower = 2;
	public static final int ID_NightshadeFlower = 3;

	public static final int ID_WhiteMushroom = 4;

	/// later additions
	/// Next - 120
	// am i insane for doing it like this?
	// i feel like this can't be ideal
	// oh well :)


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
