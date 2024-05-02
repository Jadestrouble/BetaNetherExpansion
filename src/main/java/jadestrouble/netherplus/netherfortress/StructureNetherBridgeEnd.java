package jadestrouble.netherplus.netherfortress;

import jadestrouble.netherplus.blocks.NetherBrickBlocks;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class StructureNetherBridgeEnd extends ComponentNetherBridgePiece {
	private int field_40024_a;

	public StructureNetherBridgeEnd(int var1, Random var2, StructureBoundingBox var3, int var4) {
		super(var1);
		this.coordBaseMode = var4;
		this.boundingBox = var3;
		this.field_40024_a = var2.nextInt();
	}

	public void buildComponent(StructureComponent var1, List var2, Random var3) {
	}

	public static StructureNetherBridgeEnd func_40023_a(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
		StructureBoundingBox var7 = StructureBoundingBox.getComponentToAddBoundingBox(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
		return func_40021_a(var7) && StructureComponent.getIntersectingStructureComponent(var0, var7) == null ? new StructureNetherBridgeEnd(var6, var1, var7, var5) : null;
	}

	public boolean addComponentParts(World var1, Random var2, StructureBoundingBox var3) {
		Random var4 = new Random((long)this.field_40024_a);

		int var5;
		int var6;
		int var7;
		for(var5 = 0; var5 <= 4; ++var5) {
			for(var6 = 3; var6 <= 4; ++var6) {
				var7 = var4.nextInt(8);
				this.fillWithBlocks(var1, var3, var5, var6, 0, var5, var6, var7, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
			}
		}

		var5 = var4.nextInt(8);
		this.fillWithBlocks(var1, var3, 0, 5, 0, 0, 5, var5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		var5 = var4.nextInt(8);
		this.fillWithBlocks(var1, var3, 4, 5, 0, 4, 5, var5, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);

		for(var5 = 0; var5 <= 4; ++var5) {
			var6 = var4.nextInt(5);
			this.fillWithBlocks(var1, var3, var5, 2, 0, var5, 2, var6, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
		}

		for(var5 = 0; var5 <= 4; ++var5) {
			for(var6 = 0; var6 <= 1; ++var6) {
				var7 = var4.nextInt(3);
				this.fillWithBlocks(var1, var3, var5, var6, 0, var5, var6, var7, NetherBrickBlocks.netherbrick.id, NetherBrickBlocks.netherbrick.id, false);
			}
		}

		return true;
	}
}
