package jadestrouble.netherplus.netherfortress;
public class MapGenNetherBridge extends MapGenStructure {

	protected boolean canSpawnStructureAtCoords(int var1, int var2) {
		int var3 = var1 >> 4;
		int var4 = var2 >> 4;
		this.rand.setSeed((long)(var3 ^ var4 << 4) ^ this.worldObj.getSeed());
		this.rand.nextInt();
		return this.rand.nextInt(3) != 0 ? false : (var1 != (var3 << 4) + 4 + this.rand.nextInt(8) ? false : var2 == (var4 << 4) + 4 + this.rand.nextInt(8));
	}

	protected StructureStart getStructureStart(int var1, int var2) {
		return new StructureNetherBridgeStart(this.worldObj, this.rand, var1, var2);
	}
}
