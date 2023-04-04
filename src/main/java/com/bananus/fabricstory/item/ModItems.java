package com.bananus.fabricstory.item;

import com.bananus.fabricstory.FabricStory;
import com.bananus.fabricstory.item.custom.CreateNPCItem;
import com.bananus.fabricstory.item.custom.ReloadStoryItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item RESTART_STORY = registerItem("restart_story",
            new ReloadStoryItem(new FabricItemSettings().group(ModItemGroup.FABRIC_STORY)));

    public static final Item NPC_REMOVE = registerItem("npc_remove",
            new Item(new FabricItemSettings().group(ModItemGroup.FABRIC_STORY)));

    public static final Item NPC_CREATOR = registerItem("npc_creator",
            new CreateNPCItem(new FabricItemSettings().group(ModItemGroup.FABRIC_STORY)));

    private static Item registerItem(String name, Item item) {
         return Registry.register(Registry.ITEM, new Identifier(FabricStory.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FabricStory.LOGGER.info("Registering ModItems for " + FabricStory.MOD_ID + "...");
    }
}
