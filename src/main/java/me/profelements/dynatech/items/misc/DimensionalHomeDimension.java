package me.profelements.dynatech.items.misc;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Random;

public class DimensionalHomeDimension extends ChunkGenerator {

    @Nonnull
    @Override
    @ParametersAreNonnullByDefault
    public ChunkData generateChunkData(World world, Random random, int chunkx, int chunkz, BiomeGrid biomeGrid) {
        ChunkData chunkData = createChunkData(world);

        chunkData.setRegion(0, 59, 0, 16, 60, 16, Material.BEDROCK);
        for (int y = 60; y < 180; y++) {
            for (int x = 0; x < 16; x++) {
                chunkData.setBlock(x, y, 0, Material.BARRIER);
                chunkData.setBlock(x, y, 16, Material.BARRIER);
            }
            for (int z = 0; z < 16; z++) {
                chunkData.setBlock(0, y, z, Material.BARRIER);
                chunkData.setBlock(16, y, z, Material.BARRIER);
            }

        }
        for (int x2 = 0; x2 < 16; x2++) {
            for (int y2 = 0; y2 < 16; y2++) {
                chunkData.setBlock(x2, 180, y2, Material.BARRIER);
            }
        }
        return chunkData;
    }

}
