package me.totalfreedom.totalfreedommod;

import me.totalfreedom.totalfreedommod.admin.AdminList;
import me.totalfreedom.totalfreedommod.player.PlayerList;
import me.totalfreedom.totalfreedommod.staff.StaffList;
import org.bukkit.plugin.java.JavaPlugin;

public class TotalFreedomMod extends JavaPlugin
{
    public AdminList adminList;
    public AdminList al;
    public StaffList sl;
    public PlayerList pl;
    public static TotalFreedomMod plugin;

    @Override
    public void onLoad()
    {
        plugin = this;
    }

    @Override
    public void onEnable()
    {
        adminList = new AdminList();
        al = new AdminList();
        sl = new StaffList();
        pl = new PlayerList();
    }
}
