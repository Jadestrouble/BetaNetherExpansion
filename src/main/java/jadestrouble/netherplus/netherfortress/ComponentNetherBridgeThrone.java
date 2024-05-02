package jadestrouble.netherplus.netherfortress;

import jadestrouble.netherplus.blocks.NetherBrickBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.entity.MobSpawnerBlockEntity;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ComponentNetherBridgeThrone extends ComponentNetherBridgePiece {
	private boolean field_40027_a;

	public ComponentNetherBridgeThrone(int var1, Random var2, StructureBoundingBox var3, int var4) {
		super(var1);
		this.coordBaseMode = var4;
		this.boundingBox = var3;
	}

	public void buildComponent(StructureComponent var1, List var2, Random var3) {
	}

	public static ComponentNetherBridgeThrone func_40026_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
		StructureBoundingBox var7 = StructureBoundingBox.getComponentToAddBoundingBox(var2, var3, var4, -2, 0, 0, 7, 8, 9, var5);
		return func_40021_a(var7) && StructureComponent.getIntersectingStructureComponent(var0, var7) == null ? new ComponentNetherBridgeThrone(var6, var1, var7, var5) : null;
	}

	public boolean addComponentParts(World var1, Random var2, StructureBoundingBox var3) {
		this.fillWithBlocks(var1, var3, 0, 2, 0, 6, 7, 7, 0, 0, false);
		this.fillWithBlocks(var1, var3, 1, 0, 0, 5, 1, 7, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 2, 1, 5, 2, 7, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 3, 2, 5, 3, 7, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 4, 3, 5, 4, 7, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 2, 0, 1, 4, 2, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 5, 2, 0, 5, 4, 2, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 5, 2, 1, 5, 3, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 5, 5, 2, 5, 5, 3, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 0, 5, 3, 0, 5, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 6, 5, 3, 6, 5, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.fillWithBlocks(var1, var3, 1, 5, 8, 5, 5, 8, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, 1, 6, 3, var3);
		this.placeBlockAtCurrentPosition(var1, NetherBrickBlocks.netherbrick_fence.id, 0, 5, 6, 3, var3);
		this.fillWithBlocks(var1, var3, 0, 6, 3, 0, 6, 8, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 6, 6, 3, 6, 6, 8, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 1, 6, 8, 5, 7, 8, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		this.fillWithBlocks(var1, var3, 2, 8, 8, 4, 8, 8, NetherBrickBlocks.netherbrick_fence.id, NetherBrickBlocks.netherbrick_fence.id, false);
		int var4;
		int var5;
		if(!this.field_40027_a) {
			var4 = this.getYWithOffset(5);
			var5 = this.getXWithOffset(3, 5);
			int var6 = this.getZWithOffset(3, 5);
			if(var3.isVecInside(var5, var4, var6)) {
				this.field_40027_a = true;
				var1.setBlock(var5, var4, var6, Block.SPAWNER.id);
				MobSpawnerBlockEntity var7 = (MobSpawnerBlockEntity)var1.getBlockEntity(var5, var4, var6);
				if(var7 != null) {
					var7.setSpawnedEntityId("Skeleton");
				}
			}
		}

		for(var4 = 0; var4 <= 6; ++var4) {
			for(var5 = 0; var5 <= 6; ++var5) {
				this.fillCurrentPositionBlocksDownwards(var1, NetherBrickBlocks.netherbrick.id, 0, var4, -1, var5, var3);
			}
		}

		return true;
	}
}
