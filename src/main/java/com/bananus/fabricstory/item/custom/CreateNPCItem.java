package com.bananus.fabricstory.item.custom;

import com.bananus.fabricstory.entity.ModEntities;
import com.bananus.fabricstory.entity.custom.NPCEntity;
import com.bananus.fabricstory.utils.StoryParser;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;

public class CreateNPCItem extends Item {
    public CreateNPCItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        context.getWorld().spawnEntity(new NPCEntity(ModEntities.NPC, context.getWorld()));
        assert player != null;
        player.sendMessage(new TranslatableText("item.fabricstory.npc_creator.create_npc"), false);
        return super.useOnBlock(context);
    }
}
