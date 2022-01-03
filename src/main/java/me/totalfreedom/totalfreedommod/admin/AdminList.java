package me.totalfreedom.totalfreedommod.admin;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.entity.Player;

public class AdminList
{
    public static final List<String> vanished = new ArrayList<>();
    public boolean isAdmin(Player player)
    {
        return true;
    }
}
