package me.totalfreedom.totalfreedommod.util;

import org.bukkit.Bukkit;

// This is genuinely the dumbest thing ever. Who decided to use FLog?????????

public class FLog
{
    public static void warning(String message)
    {
        Bukkit.getLogger().warning(message);
    }

    public static void info(String message)
    {
        Bukkit.getLogger().info(message);
    }
}
