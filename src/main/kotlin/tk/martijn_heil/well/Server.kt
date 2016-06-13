package tk.martijn_heil.well

import tk.martijn_heil.well.entity.OfflinePlayer
import tk.martijn_heil.well.entity.Player
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
    var hasWhitelist: Boolean

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
    fun getOfflinePlayer(name: String): OfflinePlayer
    fun getOfflinePlayer(uuid: UUID): OfflinePlayer
}