/*
 * MIT License
 *
 * Copyright (c) 2016 Martijn Heil
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package tk.martijn_heil.well

import tk.martijn_heil.well.entity.Player
import tk.martijn_heil.well.entity.User
import java.util.*
import java.util.logging.Logger


/**
 * Represents a typical Minecraft server.
 */
interface Server {

    /**
     * The primary logger of this server.
     */
    val logger: Logger

    /**
     * This server's MOTD (Message of the day).
     */
    val motd: String

    /**
     * All currently online players on this server.
     */
    val onlinePlayers: List<Player>

    /**
     * The maximum amount of players on this server.
     */
    val maxPlayers: Int

    /**
     * Whether this server is in online-mode.
     */
    val onlineMode: Boolean

    /**
     * A list of all the worlds in this server.
     */
    val worlds: List<World>

    /**
     * A list of banned IP's
     */
    val ipBans: List<String>


    var idleTimeOut: Int

    /**
     * Whether this server has a whitelist.
     */
    var isWhitelisted: Boolean

    /**
     * The default GameMode on this server.
     */
    var defaultGameMode: GameMode



    fun shutdown()
    fun shutdown(kickMessage: String)

    fun restart()
    fun restart(kickMessage: String)

    fun reload(announce: Boolean, announcementMessage: String)
    fun reload(announce: Boolean)


    fun getWorld(name: String): World
    fun getWorld(uuid: UUID): World

    @Deprecated("Persistent storage of users should be by UUID as names are no longer unique past a single session.")
    fun getPlayer(name: String): Player
    fun getPlayer(uuid: UUID): Player

    @Deprecated("Persistent storage of users should be by UUID as names are no longer unique past a single session.")
    fun getOfflinePlayer(name: String): User
    fun getOfflinePlayer(uuid: UUID): User
}