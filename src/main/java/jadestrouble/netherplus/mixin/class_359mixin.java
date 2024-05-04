package jadestrouble.netherplus.mixin;

import jadestrouble.netherplus.netherfortress.MapGenNetherBridge;
import net.minecraft.class_359;
import net.minecraft.class_51;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;


@Mixin(class_359.class)
public abstract class class_359mixin implements class_51 {

    public MapGenNetherBridge GenerateNetherBridge = new MapGenNetherBridge();
    @Shadow
    private Random field_1344;
    @Shadow
    private World field_1350;
    @Inject(method = "method_1806", at = @At("HEAD"))
        private void genBridgeStart(int i, int j, CallbackInfoReturnable<Chunk> cir)  {
            byte[] var3 = new byte['耀'];
            this.GenerateNetherBridge.generate(this, this.field_1350, i, j, var3);
        }
    @Inject(method = "method_1803", at = @At("HEAD"))
    private void genBridgePopulate(class_51 arg, int i, int j, CallbackInfo ci)  {
        this.GenerateNetherBridge.generateStructuresInChunk(this.field_1350, this.field_1344, i, j);
    }
}
