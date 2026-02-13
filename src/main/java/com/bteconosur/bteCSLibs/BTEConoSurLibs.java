package com.bteconosur.bteCSLibs;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class BTEConoSurLibs extends JavaPlugin {
    private static BTEConoSurLibs instance;

    private static YamlConfiguration lang;
    @Override
    public void onEnable() {
        instance = this;
        ConfigHandler configHandler = ConfigHandler.getInstance();
        lang = configHandler.getLang();
        ConsoleLogger.info("Las librerías de BTEConoSurCore se han cargado.");
        ConsoleLogger.debug(lang.getString("debug-mode-enabled"));
    }

    @Override
    public void onDisable() {
        ConsoleLogger.info("Las librerías de BTEConoSurCore se han descargado.");
    }

    public static BTEConoSurLibs getInstance() {
        return instance;
    }
}
