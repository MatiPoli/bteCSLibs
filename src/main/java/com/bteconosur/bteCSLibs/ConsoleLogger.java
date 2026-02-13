package com.bteconosur.bteCSLibs;

import org.bukkit.configuration.file.YamlConfiguration;

import net.kyori.adventure.text.logger.slf4j.ComponentLogger;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class ConsoleLogger {

    private static final ConfigHandler configHandler = ConfigHandler.getInstance();
    private static final YamlConfiguration config = configHandler.getConfig();
    private static final YamlConfiguration lang = configHandler.getLang();

    private static final ComponentLogger logger = BTEConoSurLibs.getInstance().getComponentLogger();
    private static final MiniMessage miniMessage = MiniMessage.miniMessage();

    public static void info(String message) {
        logger.info(miniMessage.deserialize(lang.getString("prefix") + " " + lang.getString("info-prefix") + message));
    }

    public static void debug(String message) {
        if (config.getBoolean("debug-mode", false)) {
            logger.info(miniMessage.deserialize(lang.getString("prefix") + " " + lang.getString("debug-prefix") + message));
        }
    }

    public static void warn(String message) {
        logger.warn(miniMessage.deserialize(lang.getString("prefix") + " " + lang.getString("warn-prefix") + message));
    }


    public static void error(String message) {
        logger.error(miniMessage.deserialize(lang.getString("prefix") + " " + lang.getString("error-prefix") + message));
    }


    public static void send(String message) {
        logger.info(miniMessage.deserialize(lang.getString("prefix") + " " + message));
    }

}

