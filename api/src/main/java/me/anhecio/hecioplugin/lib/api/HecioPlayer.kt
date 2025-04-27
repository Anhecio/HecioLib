package me.anhecio.hecioplugin.lib.api

import java.util.UUID

/**
 * HecioPlayer 玩家接口
 */
interface HecioPlayer {
    /**
     * 玩家全局唯一标识名
     */
    val uuid: UUID
}
