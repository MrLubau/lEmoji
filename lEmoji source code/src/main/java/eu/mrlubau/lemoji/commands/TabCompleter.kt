package eu.mrlubau.lemoji.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter

class TabCompleter : TabCompleter {

    override fun onTabComplete(sender: CommandSender, command: Command, alias: String, args: Array<out String>): List<String> {
        val suggestions = mutableListOf<String>()

        if (command.name.equals("lemoji", ignoreCase = true)) {
            if (args.size == 1) {
                suggestions.addAll(listOf("reload", "list", "help"))
            }
        }

        return suggestions
    }
}