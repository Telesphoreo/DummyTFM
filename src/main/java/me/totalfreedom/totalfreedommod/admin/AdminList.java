package me.totalfreedom.totalfreedommod.admin;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdminList
{
    public static final List<String> vanished = new ArrayList<>();
    private final Map<String, Admin> nameTable = Maps.newHashMap();

    public boolean isAdmin(Player player)
    {
        return true;
    }

    public boolean isAdmin(CommandSender sender)
    {
        return true;
    }

    public Admin getEntryByName(String name)
    {
        return nameTable.get(name.toLowerCase());
    }

    public boolean isVanished(String name)
    {
        return true;
    }
}
