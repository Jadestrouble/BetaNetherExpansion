package jadestrouble.netherplus.netherfortress;

import net.minecraft.world.World;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class StructureStart {
	protected LinkedList components = new LinkedList();
	protected StructureBoundingBox boundingBox;

	public StructureBoundingBox getBoundingBox() {
		return this.boundingBox;
	}

	public LinkedList func_40560_b() {
		return this.components;
	}

	public void generateStructure(World var1, Random var2, StructureBoundingBox var3) {
		Iterator var4 = this.components.iterator();

		while (var4.hasNext()) {
			StructureComponent var5 = (StructureComponent) var4.next();
			if (var5.getBoundingBox().intersectsWith(var3) && !var5.addComponentParts(var1, var2, var3)) {
				var4.remove();
			}
		}

	}

	protected void updateBoundingBox() {
		this.boundingBox = StructureBoundingBox.getNewBoundingBox();
		Iterator var1 = this.components.iterator();

		while (var1.hasNext()) {
			StructureComponent var2 = (StructureComponent) var1.next();
			this.boundingBox.resizeBoundingBoxTo(var2.getBoundingBox());
		}

	}

	protected void func_40559_a(World var1, Random var2, int var3, int var4) {
		int var5 = var4 - var3 + 1 - this.boundingBox.getYSize();
		boolean var6 = true;
		int var10;
		if (var5 > 1) {
			var10 = var3 + var2.nextInt(var5);
		} else {
			var10 = var3;
		}

		int var7 = var10 - this.boundingBox.minY;
		this.boundingBox.offset(0, var7, 0);
		Iterator var8 = this.components.iterator();

		while (var8.hasNext()) {
			StructureComponent var9 = (StructureComponent) var8.next();
			var9.getBoundingBox().offset(0, var7, 0);
		}

	}
	public boolean isSizeableStructure() {
		return true;
	}

}