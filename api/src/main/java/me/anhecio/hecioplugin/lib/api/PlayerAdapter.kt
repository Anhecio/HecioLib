package me.anhecio.hecioplugin.lib.api

interface PlayerAdapter<T> {

    fun toHecioPlayer(player: T): HecioPlayer

    fun toPlayer(player: HecioPlayer) : T

}