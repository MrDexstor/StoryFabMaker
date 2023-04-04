package com.bananus.fabricstory.utils;

import com.google.gson.Gson;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Story {
    public String storyId = "";
    public File storyFile;
    public int sceneTimer = 1;
    public String sceneInQueue = "starter";
    public PlayerEntity player;
    private Gson gson;

    public Story(String id, File file, ServerPlayerEntity player) {
        this.gson = StoryParser.gson;
        this.storyId = id;
        this.storyFile = file;
        this.player = player;
    }

    public void reloadScripts() {
        File scriptsFolder = new File(this.storyFile, "story_scripts");
        scriptsFolder.mkdir();
    }
}
