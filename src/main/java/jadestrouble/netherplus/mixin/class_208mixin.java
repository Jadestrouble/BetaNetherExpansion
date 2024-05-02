package jadestrouble.netherplus.mixin;


import jadestrouble.netherplus.netherfortress.MapGenNetherBridge;
import net.minecraft.class_208;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(class_208.class)
public class class_208mixin {
    public MapGenNetherBridge GenerateNetherBridge = new MapGenNetherBridge();
    @Redirect(method = "method_1806", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_208;method_1806"))
}
