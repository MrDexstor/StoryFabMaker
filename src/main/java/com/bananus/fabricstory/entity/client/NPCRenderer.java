package com.bananus.fabricstory.entity.client;

import com.bananus.fabricstory.FabricStory;
import com.bananus.fabricstory.entity.custom.NPCEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class NPCRenderer extends GeoEntityRenderer<NPCEntity> {

     public NPCRenderer(EntityRendererFactory.Context context) {
        super(context, new NPCModel());
    }

}
