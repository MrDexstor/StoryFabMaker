package com.bananus.fabricstory.item;

import com.bananus.fabricstory.FabricStory;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FABRIC_STORY = FabricItemGroupBuilder.build(new Identifier(FabricStory.MOD_ID, "fabric_story"),
            () -> new ItemStack(ModItems.RESTART_STORY));
}
