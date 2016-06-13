package tk.martijn_heil.well.plugin


interface PluginManager {
    val loadedPlugins: List<Plugin>


    fun enableAll()
    fun disableAll()
    fun reloadAll()
    fun unloadAll()

    fun enable(plugin: Plugin)
    fun disable(plugin: Plugin)
    fun reload(plugin: Plugin)

    fun load(name: String)
    fun unload(plugin: Plugin)
}