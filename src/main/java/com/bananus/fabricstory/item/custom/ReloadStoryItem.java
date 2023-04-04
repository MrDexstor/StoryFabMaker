package com.bananus.fabricstory.item.custom;

import com.bananus.fabricstory.utils.StoryParser;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.UseAction;

public class ReloadStoryItem extends Item {
    public ReloadStoryItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        StoryParser.loadStories(player);
        player.sendMessage(new TranslatableText("item.fabricstory.restart_story.reload"), false);
        return super.useOnBlock(context);
    }
}
