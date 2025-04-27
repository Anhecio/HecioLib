package me.anhecio.hecioplugin.lib.bukkit;

import me.anhecio.hecioplugin.lib.api.HecioPlayer;
import me.anhecio.hecioplugin.lib.api.PlayerAdapter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Bukkit 平台玩家适配器，实现 PlayerAdapter 接口
 */
public class BukkitPlayerAdapter implements PlayerAdapter<Player> {

    /**
     * 将 HecioPlayer 转换为 Bukkit 的 Player 实例
     *
     * @param player HecioPlayer 实例
     * @return 对应的 Bukkit Player 实例，如果玩家不在线，则返回 null
     */
    @Override
    public Player toPlayer(HecioPlayer player) {
        return Bukkit.getPlayer(player.getUuid());
    }

    /**
     * 将 Bukkit 的 Player 实例转换为 HecioPlayer
     *
     * @param player Bukkit Player 实例
     * @return 对应的 HecioPlayer 实例
     */
    @Override
    public HecioPlayer toHecioPlayer(Player player) {
        return new me.anhecio.hecioplugin.lib.bukkit.HecioPlayer(player);
    }
}
