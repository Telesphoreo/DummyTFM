package me.totalfreedom.totalfreedommod.player;

import me.totalfreedom.totalfreedommod.TotalFreedomMod;
import org.bukkit.entity.Player;

public class PlayerList
{
    private TotalFreedomMod plugin = TotalFreedomMod.plugin;
    public FPlayer getPlayer(Player player)
    {
        return new FPlayer(plugin, player);
    }
}
