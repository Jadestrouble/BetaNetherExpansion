package jadestrouble.netherplus.netherfortress;

import jadestrouble.netherplus.blocks.NetherBrickBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ComponentNetherBridgeNetherStalkRoom extends ComponentNetherBridgePiece {
	public ComponentNetherBridgeNetherStalkRoom(int var1, Random var2, StructureBoundingBox var3, int var4) {
		super(var1);
		this.coordBaseMode = var4;
		this.boundingBox = var3;
	}

	public void buildComponent(StructureComponent var1, List var2, Random var3) {
		this.func_40022_a((ComponentNetherBridgeStartPiece)var1, var2, var3, 5, 3, true);
		this.func_40022_a((ComponentNetherBridgeStartPiece)var1, var2, var3, 5, 11, true);
	}

	public static ComponentNetherBridgeNetherStalkRoom func_40040_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
		StructureBoundingBox var7 = StructureBoundingBox.getComponentToAddBoundingBox(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
		return func_40021_a(var7) && StructureComponent.getIntersectingStructureComponent(var0, var7) == null ? new ComponentNetherBridgeNetherStalkRoom(var6, var1, var7, var5) : null;
	}

	public boolean addComponentParts(World var1, Random var2, StructureBoundingBox var3) {
		this.fillWithBlocks(var1, var3, 0, 3, 0, 12, 4, 12, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 5, 0, 12, 13, 12, 0, 0, false);
		this.fillWithBlocks(var1, var3, 0, 5, 0, 1, 12, 12, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 11, 5, 0, 12, 12, 12, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 2, 5, 11, 4, 12, 12, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 8, 5, 11, 10, 12, 12, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 5, 9, 11, 7, 12, 12, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 2, 5, 0, 4, 12, 1, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 8, 5, 0, 10, 12, 1, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 5, 9, 0, 7, 12, 1, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 2, 11, 2, 10, 12, 10, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);

		int var4;
		for(var4 = 1; var4 <= 11; var4 += 2) {
			this.fillWithBlocks(var1, var3, var4, 10, 0, var4, 11, 0, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
			this.fillWithBlocks(var1, var3, var4, 10, 12, var4, 11, 12, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
			this.fillWithBlocks(var1, var3, 0, 10, var4, 0, 11, var4, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
			this.fillWithBlocks(var1, var3, 12, 10, var4, 12, 11, var4, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
			this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick.id, 0, var4, 13, 0, var3);
			this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick.id, 0, var4, 13, 12, var3);
			this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick.id, 0, 0, 13, var4, var3);
			this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick.id, 0, 12, 13, var4, var3);
			this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, var4 + 1, 13, 0, var3);
			this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, var4 + 1, 13, 12, var3);
			this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, 0, 13, var4 + 1, var3);
			this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, 12, 13, var4 + 1, var3);
		}

		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, 0, 13, 0, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, 0, 13, 12, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, 0, 13, 0, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, 12, 13, 0, var3);

		for(var4 = 3; var4 <= 9; var4 += 2) {
			this.fillWithBlocks(var1, var3, 1, 7, var4, 1, 8, var4, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
			this.fillWithBlocks(var1, var3, 11, 7, var4, 11, 8, var4, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		}

		var4 = this.func_35009_c(NetherBrickBlocks.netherbrick_stairs.id, 3);

		int var5;
		int var6;
		int var7;
		for(var5 = 0; var5 <= 6; ++var5) {
			var6 = var5 + 4;

			for(var7 = 5; var7 <= 7; ++var7) {
				this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var4, var7, 5 + var5, var6, var3);
			}

			if(var6 >= 5 && var6 <= 8) {
				this.fillWithBlocks(var1, var3, 5, 5, var6, 7, var5 + 4, var6, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
			} else if(var6 >= 9 && var6 <= 10) {
				this.fillWithBlocks(var1, var3, 5, 8, var6, 7, var5 + 4, var6, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
			}

			if(var5 >= 1) {
				this.fillWithBlocks(var1, var3, 5, 6 + var5, var6, 7, 9 + var5, var6, 0, 0, false);
			}
		}

		for(var5 = 5; var5 <= 7; ++var5) {
			this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var4, var5, 12, 11, var3);
		}

		this.fillWithBlocks(var1, var3, 5, 6, 7, 5, 7, 7, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 7, 6, 7, 7, 7, 7, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 5, 13, 12, 7, 13, 12, 0, 0, false);
		this.fillWithBlocks(var1, var3, 2, 5, 2, 3, 5, 3, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 2, 5, 9, 3, 5, 10, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 2, 5, 4, 2, 5, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 9, 5, 2, 10, 5, 3, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 9, 5, 9, 10, 5, 10, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 10, 5, 4, 10, 5, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		var5 = this.func_35009_c(NetherBrickBlocks.netherbrick_stairs.id, 0);
		var6 = this.func_35009_c(NetherBrickBlocks.netherbrick_stairs.id, 1);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var6, 4, 5, 2, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var6, 4, 5, 3, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var6, 4, 5, 9, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var6, 4, 5, 10, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var5, 8, 5, 2, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var5, 8, 5, 3, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var5, 8, 5, 9, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_stairs.id, var5, 8, 5, 10, var3);
		this.fillWithBlocks(var1, var3, 3, 4, 4, 4, 4, 8, Block.SOUL_SAND.id, Block.SOUL_SAND.id, false);
		this.fillWithBlocks(var1, var3, 8, 4, 4, 9, 4, 8, Block.SOUL_SAND.id, Block.SOUL_SAND.id, false);
		this.fillWithBlocks(var1, var3, 4, 2, 0, 8, 2, 12, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 2, 4, 12, 2, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 4, 0, 0, 8, 1, 3, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 4, 0, 9, 8, 1, 12, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 0, 4, 3, 1, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 9, 0, 4, 12, 1, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);

		int var8;
		for(var7 = 4; var7 <= 8; ++var7) {
			for(var8 = 0; var8 <= 2; ++var8) {
				this.fillCurrentPositionBlocksDownwards(var1, NetherBrickBlocks.netherbrick.id, 0, var7, -1, var8, var3);
				this.fillCurrentPositionBlocksDownwards(var1, NetherBrickBlocks.netherbrick.id, 0, var7, -1, 12 - var8, var3);
			}
		}

		for(var7 = 0; var7 <= 2; ++var7) {
			for(var8 = 4; var8 <= 8; ++var8) {
				this.fillCurrentPositionBlocksDownwards(var1, NetherBrickBlocks.netherbrick.id, 0, var7, -1, var8, var3);
				this.fillCurrentPositionBlocksDownwards(var1, NetherBrickBlocks.netherbrick.id, 0, 12 - var7, -1, var8, var3);
			}
		}

		return true;
	}
}
