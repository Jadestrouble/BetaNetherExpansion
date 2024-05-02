package jadestrouble.netherexpansion.blocks;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

import static net.modificationstation.stationapi.api.util.Identifier.of;

public class NetherBrickTextures {
    @Entrypoint.Namespace
    private static final Namespace NAMESPACE = Null.get();

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        setblockTextures();
        setItemTextures();
    }


    private void setblockTextures() {
        ExpandableAtlas terrain = Atlases.getTerrain();
        NetherBrickBlocks.netherbrick.textureId = terrain.addTexture(NAMESPACE.id("block/netherbrick")).index;
        NetherBrickBlocks.netherbrick_stairs.textureId = terrain.addTexture(NAMESPACE.id("block/netherbrick")).index;
        NetherBrickBlocks.netherbrick_fence.textureId = terrain.addTexture(NAMESPACE.id("block/netherbrick")).index;
    }
    private void setItemTextures() {
        NetherBrickBlocks.netherrackbrick.setTexture(of(NAMESPACE, "item/netherbrick"));

    }
}



