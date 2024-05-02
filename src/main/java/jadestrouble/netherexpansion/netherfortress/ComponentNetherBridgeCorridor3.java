package jadestrouble.netherexpansion.netherfortress;

import jadestrouble.netherexpansion.blocks.NetherBrickBlocks;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ComponentNetherBridgeCorridor3 extends ComponentNetherBridgePiece {
	public ComponentNetherBridgeCorridor3(int var1, Random var2, StructureBoundingBox var3, int var4) {
		super(var1);
		this.coordBaseMode = var4;
		this.boundingBox = var3;
	}

	public void buildComponent(StructureComponent var1, List var2, Random var3) {
		this.func_40022_a((ComponentNetherBridgeStartPiece)var1, var2, var3, 1, 0, true);
	}

	public static ComponentNetherBridgeCorridor3 func_40042_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
		StructureBoundingBox var7 = StructureBoundingBox.getComponentToAddBoundingBox(var2, var3, var4, -1, -7, 0, 5, 14, 10, var5);
		return func_40021_a(var7) && StructureComponent.getIntersectingStructureComponent(var0, var7) == null ? new ComponentNetherBridgeCorridor3(var6, var1, var7, var5) : null;
	}

	public boolean addComponentParts(World var1, Random var2, StructureBoundingBox var3) {
		int var4 = this.func_35009_c(NetherBrickBlocks.netherbrick_stairs.id, 2);

		for(int var5 = 0; var5 <= 9; ++var5) {
			int var6 = Math.max(1, 7 - var5);
			int var7 = Math.min(Math.max(var6 + 5, 14 - var5), 13);
			int var8 = var5;
			this.fillWithBlocks(var1, var3, 0, 0, var5, 4, var6, var5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
			this.fillWithBlocks(var1, var3, 1, var6 + 1, var5, 3, var7 - 1, var5, 0, 0, false);
			if(var5 <= 6) {
				this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var4, 1, var6 + 1, var5, var3);
				this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var4, 2, var6 + 1, var5, var3);
				this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var4, 3, var6 + 1, var5, var3);
			}

			this.fillWithBlocks(var1, var3, 0, var7, var5, 4, var7, var5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
			this.fillWithBlocks(var1, var3, 0, var6 + 1, var5, 0, var7 - 1, var5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
			this.fillWithBlocks(var1, var3, 4, var6 + 1, var5, 4, var7 - 1, var5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
			if((var5 & 1) == 0) {
				this.fillWithBlocks(var1, var3, 0, var6 + 2, var5, 0, var6 + 3, var5, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
				this.fillWithBlocks(var1, var3, 4, var6 + 2, var5, 4, var6 + 3, var5, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
			}

			for(int var9 = 0; var9 <= 4; ++var9) {
				this.fillCurrentPositionBlocksDownwards(var1, NetherBrickBlocks.netherbrick.id, 0, var9, -1, var8, var3);
			}
		}

		return true;
	}
}
