package jadestrouble.netherexpansion.netherfortress;
import jadestrouble.netherexpansion.blocks.NetherBrickBlocks;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ComponentNetherBridgeCorridor5 extends ComponentNetherBridgePiece {
	public ComponentNetherBridgeCorridor5(int var1, Random var2, StructureBoundingBox var3, int var4) {
		super(var1);
		this.coordBaseMode = var4;
		this.boundingBox = var3;
	}

	public void buildComponent(StructureComponent var1, List var2, Random var3) {
		this.func_40022_a((ComponentNetherBridgeStartPiece)var1, var2, var3, 1, 0, true);
	}

	public static ComponentNetherBridgeCorridor5 func_40032_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
		StructureBoundingBox var7 = StructureBoundingBox.getComponentToAddBoundingBox(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
		return func_40021_a(var7) && StructureComponent.getIntersectingStructureComponent(var0, var7) == null ? new ComponentNetherBridgeCorridor5(var6, var1, var7, var5) : null;
	}

	public boolean addComponentParts(World var1, Random var2, StructureBoundingBox var3) {
		this.fillWithBlocks(var1, var3, 0, 0, 0, 4, 1, 4, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 2, 0, 4, 5, 4, 0, 0, false);
		this.fillWithBlocks(var1, var3, 0, 2, 0, 0, 5, 4, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 4, 2, 0, 4, 5, 4, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 3, 1, 0, 4, 1, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 0, 3, 3, 0, 4, 3, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 4, 3, 1, 4, 4, 1, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 4, 3, 3, 4, 4, 3, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 0, 6, 0, 4, 6, 4, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);

		for(int var4 = 0; var4 <= 4; ++var4) {
			for(int var5 = 0; var5 <= 4; ++var5) {
				this.fillCurrentPositionBlocksDownwards(var1, NetherBrickBlocks.netherbrick.id, 0, var4, -1, var5, var3);
			}
		}

		return true;
	}
}
