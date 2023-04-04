package com.bananus.fabricstory.entity;

import com.bananus.fabricstory.FabricStory;
import com.bananus.fabricstory.entity.custom.NPCEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<NPCEntity> NPC = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(FabricStory.MOD_ID, "npc"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, NPCEntity::new)
                    .dimensions(EntityDimensions.fixed(1, 1)).build());
}
