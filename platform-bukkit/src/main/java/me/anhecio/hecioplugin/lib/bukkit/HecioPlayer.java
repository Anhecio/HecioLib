package me.anhecio.hecioplugin.lib.bukkit;

import org.bukkit.entity.Player;

import java.util.UUID;

public class HecioPlayer implements me.anhecio.hecioplugin.lib.api.HecioPlayer {
    private final UUID uuid;

    public HecioPlayer(Player player) {
        this.uuid = player.getUniqueId();
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }
}
