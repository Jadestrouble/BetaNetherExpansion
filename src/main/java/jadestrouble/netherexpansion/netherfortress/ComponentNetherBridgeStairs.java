package jadestrouble.netherexpansion.netherfortress;

import jadestrouble.netherexpansion.blocks.NetherBrickBlocks;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ComponentNetherBridgeStairs extends ComponentNetherBridgePiece {
	public ComponentNetherBridgeStairs(int var1, Random var2, StructureBoundingBox var3, int var4) {
		super(var1);
		this.coordBaseMode = var4;
		this.boundingBox = var3;
	}

	public void buildComponent(StructureComponent var1, List var2, Random var3) {
		this.func_40016_c((ComponentNetherBridgeStartPiece)var1, var2, var3, 6, 2, false);
	}

	public static ComponentNetherBridgeStairs func_40031_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
		StructureBoundingBox var7 = StructureBoundingBox.getComponentToAddBoundingBox(var2, var3, var4, -2, 0, 0, 7, 11, 7, var5);
		return func_40021_a(var7) && StructureComponent.getIntersectingStructureComponent(var0, var7) == null ? new ComponentNetherBridgeStairs(var6, var1, var7, var5) : null;
	}

	public boolean addComponentParts(World var1, Random var2, StructureBoundingBox var3) {
		this.fillWithBlocks(var1, var3, 0, 0, 0, 6, 1, 6, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 2, 0, 6, 10, 6, 0, 0, false);
		this.fillWithBlocks(var1, var3, 0, 2, 0, 1, 8, 0, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 5, 2, 0, 6, 8, 0, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 2, 1, 0, 8, 6, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 6, 2, 1, 6, 8, 6, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 2, 6, 5, 8, 6, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 3, 2, 0, 5, 4, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 6, 3, 2, 6, 5, 2, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 6, 3, 4, 6, 5, 4, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick.id, 0, 5, 2, 5, var3);
		this.fillWithBlocks(var1, var3, 4, 2, 5, 4, 3, 5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 3, 2, 5, 3, 4, 5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 2, 2, 5, 2, 5, 5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 2, 5, 1, 6, 5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 7, 1, 5, 7, 4, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 6, 8, 2, 6, 8, 4, 0, 0, false);
		this.fillWithBlocks(var1, var3, 2, 6, 0, 4, 8, 0, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 2, 5, 0, 4, 5, 0, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);

		for(int var4 = 0; var4 <= 6; ++var4) {
			for(int var5 = 0; var5 <= 6; ++var5) {
				this.fillCurrentPositionBlocksDownwards(var1, NetherBrickBlocks.netherbrick.id, 0, var4, -1, var5, var3);
			}
		}

		return true;
	}
}
