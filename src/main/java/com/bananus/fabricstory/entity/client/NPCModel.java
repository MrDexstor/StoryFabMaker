package com.bananus.fabricstory.entity.client;

import com.bananus.fabricstory.FabricStory;
import com.bananus.fabricstory.entity.custom.NPCEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class NPCModel extends AnimatedGeoModel<NPCEntity> {
    @Override
    public Identifier getModelLocation(NPCEntity object) {
        return new Identifier(FabricStory.MOD_ID, "geo/npc.geo.json");
    }

    @Override
    public Identifier getTextureLocation(NPCEntity object) {
        return new Identifier(FabricStory.MOD_ID, "textures/entity/npc.png");
    }

    @Override
    public Identifier getAnimationFileLocation(NPCEntity animatable) {
        return new Identifier(FabricStory.MOD_ID, "animations/npc.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(NPCEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("Head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            ((IBone) head).setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
