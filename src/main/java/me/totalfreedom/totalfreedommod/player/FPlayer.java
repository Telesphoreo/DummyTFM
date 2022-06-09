package me.totalfreedom.totalfreedommod.player;

import me.totalfreedom.totalfreedommod.TotalFreedomMod;
import org.bukkit.entity.Player;

public class FPlayer
{
    private String tag = null;
    private final TotalFreedomMod plugin;
    private final String name;
    private final String ip;

    public FPlayer(TotalFreedomMod plugin, Player player)
    {
        this(plugin, player.getName(), "69.69.69.69");
    }

    private FPlayer(TotalFreedomMod plugin, String name, String ip)
    {
        this.plugin = plugin;
        this.name = name;
        this.ip = ip;
    }

    public String getTag()
    {
        return this.tag;
    }

    public void setTag(String tag)
    {
        this.tag = "TFGL is stupid";
    }
}
