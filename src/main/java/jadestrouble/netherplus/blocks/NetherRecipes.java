package jadestrouble.netherplus.blocks;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.recipe.SmeltingRegistry;
import net.modificationstation.stationapi.api.util.Identifier;
public class NetherRecipes {
    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;
        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
            CraftingRegistry.addShapedRecipe(new ItemStack(NetherBrickBlocks.netherbrick, 1), "XX", "XX", 'X', NetherBrickBlocks.netherrackbrick);
            CraftingRegistry.addShapedRecipe(new ItemStack(NetherBrickBlocks.netherbrick_fence, 6), "XYX", "XYX", 'X', NetherBrickBlocks.netherbrick, 'Y', NetherBrickBlocks.netherrackbrick);
            CraftingRegistry.addShapedRecipe(new ItemStack(NetherBrickBlocks.netherbrick_stairs, 4), "X  ", "XX ","XXX", 'X', NetherBrickBlocks.netherbrick);
        }
        if (type == RecipeRegisterEvent.Vanilla.SMELTING.type()) {
            SmeltingRegistry.addSmeltingRecipe(new ItemStack(Block.NETHERRACK, 1), new ItemStack(NetherBrickBlocks.netherrackbrick, 1));
        }
    }
}

