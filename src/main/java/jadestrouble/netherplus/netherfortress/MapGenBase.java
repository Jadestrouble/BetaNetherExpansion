package jadestrouble.netherplus.netherfortress;

import net.minecraft.class_51;
import net.minecraft.world.World;

import java.util.Random;

public class MapGenBase {
    protected int field_1306_a = 8;
    protected Random rand = new Random();
    protected World worldObj;

    public MapGenBase() {
    }

    public void generate(class_51 var1, World var2, int var3, int var4, byte[] var5) {
        int var6 = this.field_1306_a;
        this.worldObj = var2;
        this.rand.setSeed(var2.getSeed());
        long var7 = this.rand.nextLong();
        long var9 = this.rand.nextLong();

        for(int var11 = var3 - var6; var11 <= var3 + var6; ++var11) {
            for(int var12 = var4 - var6; var12 <= var4 + var6; ++var12) {
                long var13 = (long)var11 * var7;
                long var15 = (long)var12 * var9;
                this.rand.setSeed(var13 ^ var15 ^ var2.getSeed());
                this.recursiveGenerate(var2, var11, var12, var3, var4, var5);
            }
        }

    }

    protected void recursiveGenerate(World var1, int var2, int var3, int var4, int var5, byte[] var6) {
    }
}