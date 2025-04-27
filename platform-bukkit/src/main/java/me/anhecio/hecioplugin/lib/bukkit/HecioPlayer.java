package me.anhecio.hecioplugin.lib.bukkit;

import org.bukkit.entity.Player;
import java.util.UUID;


/**
 * HecioPlayer Bukkit 实现，封装 Bukkit 的 Player 对象
 */
public class HecioPlayer implements me.anhecio.hecioplugin.lib.api.HecioPlayer {

    private final UUID uuid;

    public HecioPlayer(Player player) {
        this.uuid = player.getUniqueId();
    }

    /**
     * 获取玩家的 UUID。
     *
     * @return 玩家 UUID
     */
    @Override
    public UUID getUuid() {
        return uuid;
    }
}
