package jadestrouble.netherexpansion.netherfortress;

import jadestrouble.netherexpansion.blocks.NetherBrickBlocks;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ComponentNetherBridgeCorridor4 extends ComponentNetherBridgePiece {
	public ComponentNetherBridgeCorridor4(int var1, Random var2, StructureBoundingBox var3, int var4) {
		super(var1);
		this.coordBaseMode = var4;
		this.boundingBox = var3;
	}

	public void buildComponent(StructureComponent var1, List var2, Random var3) {
		byte var4 = 1;
		if(this.coordBaseMode == 1 || this.coordBaseMode == 2) {
			var4 = 5;
		}

		this.func_40019_b((ComponentNetherBridgeStartPiece)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
		this.func_40016_c((ComponentNetherBridgeStartPiece)var1, var2, var3, 0, var4, var3.nextInt(8) > 0);
	}

	public static ComponentNetherBridgeCorridor4 func_40039_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
		StructureBoundingBox var7 = StructureBoundingBox.getComponentToAddBoundingBox(var2, var3, var4, -3, 0, 0, 9, 7, 9, var5);
		return func_40021_a(var7) && StructureComponent.getIntersectingStructureComponent(var0, var7) == null ? new ComponentNetherBridgeCorridor4(var6, var1, var7, var5) : null;
	}

	public boolean addComponentParts(World var1, Random var2, StructureBoundingBox var3) {
		this.fillWithBlocks(var1, var3, 0, 0, 0, 8, 1, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 2, 0, 8, 5, 8, 0, 0, false);
		this.fillWithBlocks(var1, var3, 0, 6, 0, 8, 6, 5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 2, 0, 2, 5, 0, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 6, 2, 0, 8, 5, 0, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 3, 0, 1, 4, 0, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 7, 3, 0, 7, 4, 0, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 0, 2, 4, 8, 2, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 1, 4, 2, 2, 4, 0, 0, false);
		this.fillWithBlocks(var1, var3, 6, 1, 4, 7, 2, 4, 0, 0, false);
		this.fillWithBlocks(var1, var3, 0, 3, 8, 8, 3, 8, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 0, 3, 6, 0, 3, 7, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 8, 3, 6, 8, 3, 7, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 0, 3, 4, 0, 5, 5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 8, 3, 4, 8, 5, 5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 3, 5, 2, 5, 5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 6, 3, 5, 7, 5, 5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 4, 5, 1, 5, 5, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 7, 4, 5, 7, 5, 5, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);

		for(int var4 = 0; var4 <= 5; ++var4) {
			for(int var5 = 0; var5 <= 8; ++var5) {
				this.fillCurrentPositionBlocksDownwards(var1, NetherBrickBlocks.netherbrick.id, 0, var5, -1, var4, var3);
			}
		}

		return true;
	}
}
