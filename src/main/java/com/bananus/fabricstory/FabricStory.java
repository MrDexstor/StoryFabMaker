package com.bananus.fabricstory;

import com.bananus.fabricstory.item.ModItems;
import com.bananus.fabricstory.utils.ModRegistries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.util.log.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabricStory implements ModInitializer {
    public static final String MOD_ID = "fabricstory";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModRegistries.registerModStuffs();
    }
}