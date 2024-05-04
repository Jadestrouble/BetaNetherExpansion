package jadestrouble.netherplus.netherfortress;

import jadestrouble.netherplus.blocks.NetherBrickBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.block.BlockState;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class StructureComponent {
	protected StructureBoundingBox boundingBox;
	protected int coordBaseMode;
	protected int field_35026_i;

	protected StructureComponent(int var1) {
		this.field_35026_i = var1;
		this.coordBaseMode = -1;
	}

	public void buildComponent(StructureComponent var1, List var2, Random var3) {
	}

	public abstract boolean addComponentParts(World var1, Random var2, StructureBoundingBox var3);

	public StructureBoundingBox getBoundingBox() {
		return this.boundingBox;
	}

	public int func_35012_c() {
		return this.field_35026_i;
	}

	public static StructureComponent getIntersectingStructureComponent(List var0, StructureBoundingBox var1) {
		Iterator var2 = var0.iterator();

		StructureComponent var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}

			var3 = (StructureComponent) var2.next();
		} while (var3.getBoundingBox() == null || !var3.getBoundingBox().intersectsWith(var1));

		return var3;
	}

	public NetherExpansionChunkPos func_40008_a_() {
		return new NetherExpansionChunkPos(this.boundingBox.func_40597_e(), this.boundingBox.func_40596_f(), this.boundingBox.func_40598_g());
	}

	protected boolean isLiquidInStructureBoundingBox(World var1, StructureBoundingBox var2) {
		int var3 = Math.max(this.boundingBox.minX - 1, var2.minX);
		int var4 = Math.max(this.boundingBox.minY - 1, var2.minY);
		int var5 = Math.max(this.boundingBox.minZ - 1, var2.minZ);
		int var6 = Math.min(this.boundingBox.maxX + 1, var2.maxX);
		int var7 = Math.min(this.boundingBox.maxY + 1, var2.maxY);
		int var8 = Math.min(this.boundingBox.maxZ + 1, var2.maxZ);

		int var9;
		int var10;
		int var11;
		for (var9 = var3; var9 <= var6; ++var9) {
			for (var10 = var5; var10 <= var8; ++var10) {
				var11 = var1.getBlockId(var9, var4, var10);
				if (var11 > 0 && Block.BLOCKS[var11].material.method_893()) {
					return true;
				}

				var11 = var1.getBlockId(var9, var7, var10);
				if (var11 > 0 && Block.BLOCKS[var11].material.method_893()) {
					return true;
				}
			}
		}

		for (var9 = var3; var9 <= var6; ++var9) {
			for (var10 = var4; var10 <= var7; ++var10) {
				var11 = var1.getBlockId(var9, var10, var5);
				if (var11 > 0 && Block.BLOCKS[var11].material.method_893()) {
					return true;
				}

				var11 = var1.getBlockId(var9, var10, var8);
				if (var11 > 0 && Block.BLOCKS[var11].material.method_893()) {
					return true;
				}
			}
		}

		for (var9 = var5; var9 <= var8; ++var9) {
			for (var10 = var4; var10 <= var7; ++var10) {
				var11 = var1.getBlockId(var3, var10, var9);
				if (var11 > 0 && Block.BLOCKS[var11].material.method_893()) {
					return true;
				}

				var11 = var1.getBlockId(var6, var10, var9);
				if (var11 > 0 && Block.BLOCKS[var11].material.method_893()) {
					return true;
				}
			}
		}

		return false;
	}

	protected int getXWithOffset(int var1, int var2) {
		switch (this.coordBaseMode) {
			case 0:
			case 2:
				return this.boundingBox.minX + var1;
			case 1:
				return this.boundingBox.maxX - var2;
			case 3:
				return this.boundingBox.minX + var2;
			default:
				return var1;
		}
	}

	protected int getYWithOffset(int var1) {
		return this.coordBaseMode == -1 ? var1 : var1 + this.boundingBox.minY;
	}

	protected int getZWithOffset(int var1, int var2) {
		switch (this.coordBaseMode) {
			case 0:
				return this.boundingBox.minZ + var2;
			case 1:
			case 3:
				return this.boundingBox.minZ + var1;
			case 2:
				return this.boundingBox.maxZ - var2;
			default:
				return var2;
		}
	}

	protected int func_35009_c(int var1, int var2) {
		if (var1 == Block.RAIL.id) {
			if (this.coordBaseMode == 1 || this.coordBaseMode == 3) {
				if (var2 == 1) {
					return 0;
				}

				return 1;
			}
		} else if (var1 != Block.DOOR.id) {
			if (var1 != Block.COBBLESTONE_STAIRS.id && var1 != Block.WOODEN_STAIRS.id && var1 != NetherBrickBlocks.netherbrick_stairs.id) {
				if (var1 == Block.LADDER.id) {
					if (this.coordBaseMode == 0) {
						if (var2 == 2) {
							return 3;
						}

						if (var2 == 3) {
							return 2;
						}
					} else if (this.coordBaseMode == 1) {
						if (var2 == 2) {
							return 4;
						}

						if (var2 == 3) {
							return 5;
						}

						if (var2 == 4) {
							return 2;
						}

						if (var2 == 5) {
							return 3;
						}
					} else if (this.coordBaseMode == 3) {
						if (var2 == 2) {
							return 5;
						}

						if (var2 == 3) {
							return 4;
						}

						if (var2 == 4) {
							return 2;
						}

						if (var2 == 5) {
							return 3;
						}
					}
				}
			} else if (this.coordBaseMode == 0) {
				if (var2 == 2) {
					return 3;
				}

				if (var2 == 3) {
					return 2;
				}
			} else if (this.coordBaseMode == 1) {
				if (var2 == 0) {
					return 2;
				}

				if (var2 == 1) {
					return 3;
				}

				if (var2 == 2) {
					return 0;
				}

				if (var2 == 3) {
					return 1;
				}
			} else if (this.coordBaseMode == 3) {
				if (var2 == 0) {
					return 2;
				}

				if (var2 == 1) {
					return 3;
				}

				if (var2 == 2) {
					return 1;
				}

				if (var2 == 3) {
					return 0;
				}
			}
		} else if (this.coordBaseMode == 0) {
			if (var2 == 0) {
				return 2;
			}

			if (var2 == 2) {
				return 0;
			}
		} else {
			if (this.coordBaseMode == 1) {
				return var2 + 1 & 3;
			}

			if (this.coordBaseMode == 3) {
				return var2 + 3 & 3;
			}
		}

		return var2;
	}

	protected void placeBlockAtCurrentPosition(World var1, int var2, int var3, int var4, int var5, int var6, StructureBoundingBox var7) {
		int var8 = this.getXWithOffset(var4, var6);
		int var9 = this.getYWithOffset(var5);
		int var10 = this.getZWithOffset(var4, var6);
		if (var7.isVecInside(var8, var9, var10)) {
			var1.method_154(var8, var9, var10, var2, var3);
		}
	}

	protected int getBlockIdAtCurrentPosition(World var1, int var2, int var3, int var4, StructureBoundingBox var5) {
		int var6 = this.getXWithOffset(var2, var4);
		int var7 = this.getYWithOffset(var3);
		int var8 = this.getZWithOffset(var2, var4);
		return !var5.isVecInside(var6, var7, var8) ? 0 : var1.getBlockId(var6, var7, var8);
	}

	protected void fillWithBlocks(World var1, StructureBoundingBox var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
		for (int var12 = var4; var12 <= var7; ++var12) {
			for (int var13 = var3; var13 <= var6; ++var13) {
				for (int var14 = var5; var14 <= var8; ++var14) {
					if (!var11 || this.getBlockIdAtCurrentPosition(var1, var13, var12, var14, var2) != 0) {
						if (var12 != var4 && var12 != var7 && var13 != var3 && var13 != var6 && var14 != var5 && var14 != var8) {
							this.placeBlockAtCurrentPosition(var1, var10, 0, var13, var12, var14, var2);
						} else {
							this.placeBlockAtCurrentPosition(var1, var9, 0, var13, var12, var14, var2);
						}
					}
				}
			}
		}

	}

	protected void fillCurrentPositionBlocksDownwards(World var1, int var2, int var3, int var4, int var5, int var6, StructureBoundingBox var7) {
		int var8 = this.getXWithOffset(var4, var6);
		int var9 = this.getYWithOffset(var5);
		int var10 = this.getZWithOffset(var4, var6);
		if (var7.isVecInside(var8, var9, var10)) {
			while ((var1.method_234(var8, var9, var10) || var1.method_1779(var8, var9, var10).method_893()) && var9 > 1) {
				var1.method_154(var8, var9, var10, var2, var3);
				--var9;
			}
		}
	}
}