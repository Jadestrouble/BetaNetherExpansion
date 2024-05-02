package jadestrouble.netherplus.netherfortress;

import net.minecraft.util.math.Vec3d;

public class NetherExpansionChunkPos {
	public final int nether_x;
	public final int nether_y;
	public final int nether_z;

	public static int floor_double(double var0) {
		int var2 = (int)var0;
		return var0 < (double)var2 ? var2 - 1 : var2;
	}

	public NetherExpansionChunkPos(int var1, int var2, int var3) {
		this.nether_x = var1;
		this.nether_y = var2;
		this.nether_z = var3;
	}

	public NetherExpansionChunkPos(Vec3d var1) {
		this(NetherExpansionChunkPos.floor_double(var1.x), NetherExpansionChunkPos.floor_double(var1.y), NetherExpansionChunkPos.floor_double(var1.z));
	}

	public boolean equals(Object var1) {
		if(!(var1 instanceof NetherExpansionChunkPos)) {
			return false;
		} else {
			NetherExpansionChunkPos var2 = (NetherExpansionChunkPos)var1;
			return var2.nether_x == this.nether_x && var2.nether_y == this.nether_y && var2.nether_z == this.nether_z;
		}
	}

	public int hashCode() {
		return this.nether_x * 8976890 + this.nether_y * 981131 + this.nether_z;
	}
}
