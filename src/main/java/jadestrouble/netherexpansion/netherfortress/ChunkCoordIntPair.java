package jadestrouble.netherexpansion.netherfortress;

public class ChunkCoordIntPair {
	public final int chunkXPos;
	public final int chunkZPos;

	public ChunkCoordIntPair(int var1, int var2) {
		this.chunkXPos = var1;
		this.chunkZPos = var2;
	}

	public static long chunkXZ2Int(int var0, int var1) {
		long var2 = (long)var0;
		long var4 = (long)var1;
		return var2 & 4294967295L | (var4 & 4294967295L) << 32;
	}

	public int hashCode() {
		long var1 = chunkXZ2Int(this.chunkXPos, this.chunkZPos);
		int var3 = (int)var1;
		int var4 = (int)(var1 >> 32);
		return var3 ^ var4;
	}

	public boolean equals(Object var1) {
		ChunkCoordIntPair var2 = (ChunkCoordIntPair)var1;
		return var2.chunkXPos == this.chunkXPos && var2.chunkZPos == this.chunkZPos;
	}

	public int func_40735_a() {
		return (this.chunkXPos << 4) + 8;
	}

	public int func_40736_b() {
		return (this.chunkZPos << 4) + 8;
	}

	public NetherExpansionChunkPos func_40737_a(int var1) {
		return new NetherExpansionChunkPos(this.func_40735_a(), var1, this.func_40736_b());
	}

	public String toString() {
		return "[" + this.chunkXPos + ", " + this.chunkZPos + "]";
	}
}
