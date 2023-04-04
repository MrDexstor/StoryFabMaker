package com.bananus.fabricstory.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StoryParser {
    public static final List<Story> storiesLoaded = new ArrayList();
    public static FilenameFilter jsFilter = (dir, name) -> {
        return name.endsWith(".js");
    };
    public static FilenameFilter jsonFilter = (dir, name) -> {
        return name.endsWith(".json");
    };
    public static FileFilter onlyDir = File::isDirectory;
    public static Gson gson = (new GsonBuilder()).setPrettyPrinting().create();
    public static String currentStory = "";
    public static ServerPlayerEntity player;
    public static int ticks = 0;

    public static void loadStories(PlayerEntity player) {
        Path storiesFolder = FabricLoader.getInstance().getGameDir();
        File folderFile = storiesFolder.toFile();
        File stories = new File(folderFile, "stories");
        if (stories.exists()) {
            player.sendMessage(new TranslatableTextContent("item.fabricstory.restart_story.exists"), false);
        }
        else {
            player.sendMessage(new TranslatableTextContent("item.fabricstory.restart_story.not_exists"), false);
            stories.mkdir();
        }
    }

    public static void setStory(PlayerEntity player, String story_id) {
        String storiesFolder = String.valueOf(FabricLoader.getInstance().getGameDir()) + "/stories";
        Story story = new Story(story_id, new File(storiesFolder, story_id), (ServerPlayerEntity) player);
        storiesLoaded.add(story);
        File storiesData = new File(storiesFolder, "data.json");
        try {
            storiesData.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        player.sendMessage(Text.of("Successfully loaded story " + story_id), false);
    }

    public static void loadStory(PlayerEntity player, String story_id) {

    }

}