package me.anhecio.hecioplugin.lib.bukkit;

import me.anhecio.hecioplugin.lib.api.HecioPlayer;
import me.anhecio.hecioplugin.lib.api.PlayerAdapter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class BukkitPlayerAdapter implements PlayerAdapter<Player> {

    @Override
    public Player toPlayer(HecioPlayer player) {
        return Bukkit.getPlayer(player.getUuid());
    }

    @Override
    public HecioPlayer toHecioPlayer(Player player) {
        return new me.anhecio.hecioplugin.lib.bukkit.HecioPlayer(player);
    }
}
