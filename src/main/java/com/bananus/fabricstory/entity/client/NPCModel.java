package com.bananus.fabricstory.entity.client;

import com.bananus.fabricstory.FabricStory;
import com.bananus.fabricstory.entity.custom.NPCEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class NPCModel extends GeoModel<NPCEntity> {
    @Override
    public Identifier getModelResource(NPCEntity animatable) {
        return new Identifier(FabricStory.MOD_ID, "geo/npc.geo.json");
    }

    @Override
    public Identifier getTextureResource(NPCEntity animatable) {
        return new Identifier(FabricStory.MOD_ID, "textures/entity/npc.png");
    }

    @Override
    public Identifier getAnimationResource(NPCEntity animatable) {
        return new Identifier(FabricStory.MOD_ID, "animations/npc.animation.json");
    }

    public Identifier getModelLocation(NPCEntity object) {
        return new Identifier(FabricStory.MOD_ID, "geo/npc.geo.json");
    }

}
