package com.bananus.fabricstory.item;

import com.bananus.fabricstory.FabricStory;
import com.bananus.fabricstory.item.custom.CreateNPCItem;
import com.bananus.fabricstory.item.custom.ReloadStoryItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;


public class ModItems {

    public static final Item RESTART_STORY = registerItem("restart_story",
            new ReloadStoryItem(new FabricItemSettings()));

    public static final Item NPC_REMOVE = registerItem("npc_remove",
            new Item(new FabricItemSettings()));

    public static final Item NPC_CREATOR = registerItem("npc_creator",
            new CreateNPCItem(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
         return Registry.register(Registries.ITEM, new Identifier(FabricStory.MOD_ID, name), item);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        FabricStory.LOGGER.info("Registering ModItems for " + FabricStory.MOD_ID + "...");

        addToItemGroup(ModItemGroup.FABRIC_STORY, NPC_CREATOR);
        addToItemGroup(ModItemGroup.FABRIC_STORY, NPC_REMOVE);
        addToItemGroup(ModItemGroup.FABRIC_STORY, RESTART_STORY);
    }
}
