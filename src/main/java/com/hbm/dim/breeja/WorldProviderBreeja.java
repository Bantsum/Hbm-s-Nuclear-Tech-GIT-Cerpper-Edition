package com.hbm.dim.breeja;

import com.hbm.blocks.ModBlocks;
import com.hbm.dim.WorldProviderCelestial;
import net.minecraft.block.Block;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderBreeja extends WorldProviderCelestial {

	@Override
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBreeja.biome, 0.0F);
	}

	@Override
	public String getDimensionName() {
		return "Breeja";
	}

	@Override
	public IChunkProvider createChunkGenerator() {
		return new ChunkProviderBreeja(this.worldObj, this.getSeed());
	}

	@Override
	public Block getStone() {
		return ModBlocks.breeja_cobble;
	}

}
