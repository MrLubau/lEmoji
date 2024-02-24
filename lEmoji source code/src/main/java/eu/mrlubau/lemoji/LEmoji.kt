package eu.mrlubau.lemoji

import eu.mrlubau.lemoji.commands.Reload
import eu.mrlubau.lemoji.commands.TabCompleter
import eu.mrlubau.lemoji.listeners.Emoji
import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.plugin.java.JavaPlugin

class LEmoji : JavaPlugin() {
    override fun onEnable() {
        saveDefaultConfig()
        val config: FileConfiguration = config
        val version = config.getString("plugin-version", "Version Error")

        logger.info("lEmoji ($version) Loaded!")

        registerCommands()
        registerListeners()
    }

    private fun registerListeners() {
        server.pluginManager.registerEvents(Emoji(this), this)
    }

    private fun registerCommands() {
        getCommand("lemoji")?.setExecutor(Reload(this))
        getCommand("lemoji")?.setTabCompleter(TabCompleter())
    }

    override fun onDisable() {
        logger.info("lEmoji Unloaded!")
    }
}
