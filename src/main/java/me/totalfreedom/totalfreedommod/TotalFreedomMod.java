package me.totalfreedom.totalfreedommod;

import me.totalfreedom.totalfreedommod.admin.AdminList;
import me.totalfreedom.totalfreedommod.staff.StaffList;
import org.bukkit.plugin.java.JavaPlugin;

public class TotalFreedomMod extends JavaPlugin
{
    public AdminList adminList;
    public AdminList al;
    public StaffList sl;

    @Override
    public void onEnable()
    {
        adminList = new AdminList();
        al = new AdminList();
        sl = new StaffList();
    }
}
