package com.bananus.fabricstory;

import com.bananus.fabricstory.entity.ModEntities;
import com.bananus.fabricstory.entity.client.NPCRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class FabricStoryClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.NPC, NPCRenderer::new);
    }
}
