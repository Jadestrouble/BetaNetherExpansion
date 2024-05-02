package jadestrouble.netherexpansion.blocks;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.template.block.TemplateFenceBlock;
import net.modificationstation.stationapi.api.template.block.TemplateStairsBlock;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class NetherBrickBlocks {
    @Entrypoint.Namespace
    final Namespace NAMESPACE = Null.get();
    public static Item netherrackbrick;

    public static Block netherbrick;
    public static Block netherbrick_stairs;
    public static Block netherbrick_fence;

    @EventListener
    void registerBlocks(BlockRegistryEvent event) {
        netherbrick = new TemplateBlock(NAMESPACE.id("netherbrick"), Material.STONE).setHardness(1.5F).setTranslationKey(NAMESPACE, "netherbricks");
        netherbrick_stairs = new TemplateStairsBlock(NAMESPACE.id("netherbrick_stairs"),netherbrick).setTranslationKey(NAMESPACE, "netherbrick_stair");
        netherbrick_fence = new TemplateFenceBlock(NAMESPACE.id("netherbrick_fence"),1).setTranslationKey(NAMESPACE, "netherbrick_fence");
    }
    @EventListener
    void registerItems(ItemRegistryEvent event) {
        netherrackbrick = new TemplateItem(NAMESPACE.id("netherrackbrick")).setTranslationKey(NAMESPACE, "netherbrick");

    }
}

