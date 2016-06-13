package tk.martijn_heil.well.plugin

import java.io.File
import java.util.logging.Logger


interface Plugin {

    /**
     * This plugin's logger.
     */
    val logger: Logger

    val state: PluginState

    val directory: File

    fun onLoad()
    fun onEnable()
    fun onDisable()
}