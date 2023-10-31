package dev.waradu.test;

import dev.waradu.test.commands.Test;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static String prefix = tk.pandadev.nextron.Main.getPrefix();

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("NextronOnSteroids is here");
        getCommand("test").setExecutor(new Test());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static String getPrefix() {
        return prefix;
    }
}
