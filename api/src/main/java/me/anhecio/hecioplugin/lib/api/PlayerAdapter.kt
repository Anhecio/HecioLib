package me.anhecio.hecioplugin.lib.api

/**
 * 玩家适配器接口，用于在不同玩家类型与 HecioPlayer 之间进行转换
 *
 * @param T 适配器支持的玩家类型
 */
interface PlayerAdapter<T> {

    /**
     * 将适配器类型的玩家对象转换为 HecioPlayer
     *
     * @param player 适配器类型的玩家对象
     * @return 转换后的 HecioPlayer 实例
     */
    fun toHecioPlayer(player: T): HecioPlayer

    /**
     * 将 HecioPlayer 对象转换为适配器类型的玩家对象
     *
     * @param player HecioPlayer 实例
     * @return 转换后的适配器类型的玩家对象
     */
    fun toPlayer(player: HecioPlayer): T
}
