package me.totalfreedom.totalfreedommod.staff;

import com.google.common.collect.Maps;
import java.util.Map;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StaffList
{
    private final Map<String, Staff> nameTable = Maps.newHashMap();

    public boolean isStaff(Player player)
    {
        return true;
    }

    public boolean isStaff(CommandSender sender)
    {
        return true;
    }

    public Staff getEntryByName(String name)
    {
        return nameTable.get(name.toLowerCase());
    }

    public boolean isVanished(String name)
    {
        return true;
    }
}
