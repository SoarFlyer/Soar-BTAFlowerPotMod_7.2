package soarflyer.flowerpotmod.librarycontainer.terrainapi;

import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

import static soarflyer.flowerpotmod.FlowerPotMod.*;

public class TerrainApiPlugin implements TerrainAPI {
	@Override
	public String getModID() {
		return MOD_ID;
	}

	@Override
	public void onInitialize() {
		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BlockID - ID_WintergreenFlower),
			4, -1f, 1,
			new Biome[]{
				Biomes.OVERWORLD_BOREAL_FOREST});
		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BlockID - ID_WintergreenFlower),
			8, -1f, 1,
			new Biome[]{
				Biomes.OVERWORLD_MEADOW});

		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BlockID - ID_GloryFlower),
			10, -1f, 1,
			new Biome[]{
				Biomes.OVERWORLD_TUNDRA});		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BlockID - ID_GloryFlower),
			20, -1f, 1,
			new Biome[]{
				Biomes.OVERWORLD_TAIGA});


		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BlockID - ID_NightshadeFlower),
			4, -1f, 1,
			new Biome[]{
				Biomes.OVERWORLD_SWAMPLAND,
				Biomes.OVERWORLD_SWAMPLAND_MUDDY});
		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BlockID - ID_NightshadeFlower),
			6, -1f, 1,
			new Biome[]{
				Biomes.OVERWORLD_RAINFOREST});

		ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BlockID - ID_WhiteMushroom),
			40, -1f);
	}

}
