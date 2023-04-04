package com.bananus.fabricstory.item;

import com.bananus.fabricstory.FabricStory;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FABRIC_STORY = FabricItemGroup.builder(new Identifier(FabricStory.MOD_ID, "fabric_story"))
            .displayName(Text.translatable("itemGroup.fabricstory.storymaker"))
            .icon(() -> new ItemStack(ModItems.NPC_CREATOR)).build();
}
