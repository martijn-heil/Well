package tk.martijn_heil.well

import tk.martijn_heil.well.plugin.PluginManager

/**
 * Represents an implementation of the Well API.
 */
interface WellImplementation {
    val server: Server

    val pluginManager: PluginManager
}