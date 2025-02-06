package com.lingbaojun.gensoukyou;

import com.lingbaojun.gensoukyou.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gensoukyou implements ModInitializer {
    public static final String MOD_ID = "gensoukyou";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        LOGGER.info("Gensoukyou Mod Loaded");
    }
}
