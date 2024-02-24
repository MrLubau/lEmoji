package eu.mrlubau.lemoji.commands

import eu.mrlubau.lemoji.LEmoji
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class Reload(private val plugin: LEmoji) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
            val prefix = plugin.config.getString("plugin-prefix", "§8[§blEmoji§8] >>")
            val reloadmess = plugin.config.getString("reload-message", "Error")
            val errormess = plugin.config.getString("error-message", "Error")
            val helpmess = plugin.config.getStringList("help")
            val permmess = plugin.config.getString("permission-message", "Error")

        if (!sender.hasPermission("lemoji.help") || !sender.hasPermission("lemoji.*")) {
            sender.sendMessage("${prefix} ${permmess}")
            return true
        }

        if (args.size < 1) {
            for (line in helpmess) {
                sender.sendMessage("${prefix} $line")
            }
            return true
        }

        val arg1 = args[0]

        if (arg1 == "reload") {
            if (!sender.hasPermission("lemoji.reload") || !sender.hasPermission("lemoji.*")) {
                sender.sendMessage("${prefix} ${permmess}")
                return true
            }

            plugin.reloadConfig()

            sender.sendMessage("${prefix} ${reloadmess}")
            return true

        }

        if (arg1 == "help") {
            if (!sender.hasPermission("lemoji.help") || !sender.hasPermission("lemoji.*")) {
                sender.sendMessage("${prefix} ${permmess}")
                return true
            }

            for (line in helpmess) {
                sender.sendMessage("${prefix} $line")
            }
            return true

        }

        if (arg1 == "list") {
            if (!sender.hasPermission("lemoji.list") || !sender.hasPermission("lemoji.*")) {
                sender.sendMessage("${prefix} ${permmess}")
                return true
            }

            sender.sendMessage("§8==============================")

            val enablexd = plugin.config.getString("xd.enable", "false")
            val namexd = plugin.config.getString("xd.name", "Error")
            if (enablexd == "true") { sender.sendMessage("§7:$namexd: §8| §f\uE260") }

            val enablepog = plugin.config.getString("pog.enable", "false")
            val namepog = plugin.config.getString("pog.name", "Error")
            if (enablepog == "true") { sender.sendMessage("§7:$namepog: §8| §f\uE234") }

            val enableragey = plugin.config.getString("ragey.enable", "false")
            val nameragey = plugin.config.getString("ragey.name", "Error")
            if (enableragey == "true") { sender.sendMessage("§7:$nameragey: §8| §f\uE233") }

            val enablepepehands = plugin.config.getString("pepehands.enable", "false")
            val namepepehands = plugin.config.getString("pepehands.name", "Error")
            if (enablepepehands == "true") { sender.sendMessage("§7:$namepepehands: §8| §f\uE235") }

            val enablemonkas = plugin.config.getString("monkas.enable", "false")
            val namemonkas = plugin.config.getString("monkas.name", "Error")
            if (enablemonkas == "true") { sender.sendMessage("§7:$namemonkas: §8| §f\uE236") }

            val enablesadge = plugin.config.getString("sadge.enable", "false")
            val namesadge = plugin.config.getString("sadge.name", "Error")
            if (enablesadge == "true") { sender.sendMessage("§7:$namesadge: §8| §f\uE257") }

            val enablepepepausechamp = plugin.config.getString("pepepausechamp.enable", "false")
            val namepepepausechamp = plugin.config.getString("pepepausechamp.name", "Error")
            if (enablepepepausechamp == "true") { sender.sendMessage("§7:$namepepepausechamp: §8| §f\uE256") }

            val enablepeepolove = plugin.config.getString("peepolove.enable", "false")
            val namepeepolove = plugin.config.getString("peepolove.name", "Error")
            if (enablepeepolove == "true") { sender.sendMessage("§7:$namepeepolove: §8| §f\uE255") }

            val enablepeeposad = plugin.config.getString("peeposad.enable", "false")
            val namepeeposad = plugin.config.getString("peeposad.name", "Error")
            if (enablepeeposad == "true") { sender.sendMessage("§7:$namepeeposad: §8| §f\uE254") }

            val enablepausechamp = plugin.config.getString("pausechamp.enable", "false")
            val namepausechamp = plugin.config.getString("pausechamp.name", "Error")
            if (enablepausechamp == "true") { sender.sendMessage("§7:$namepausechamp: §8| §f\uE253") }

            val enablepagman = plugin.config.getString("pagman.enable", "false")
            val namepagman = plugin.config.getString("pagman.name", "Error")
            if (enablepagman == "true") { sender.sendMessage("§7:$namepagman: §8| §f\uE252") }

            val enableomegasp = plugin.config.getString("omegasp.enable", "false")
            val nameomegasp = plugin.config.getString("omegasp.name", "Error")
            if (enableomegasp == "true") { sender.sendMessage("§7:$nameomegasp: §8| §f\uE251") }

            val enableomegalul = plugin.config.getString("omegalul.enable", "false")
            val nameomegalul = plugin.config.getString("omegalul.name", "Error")
            if (enableomegalul == "true") { sender.sendMessage("§7:$nameomegalul: §8| §f\uE250") }

            val enablenotlikethis = plugin.config.getString("notlikethis.enable", "false")
            val namenotlikethis = plugin.config.getString("notlikethis.name", "Error")
            if (enablenotlikethis == "true") { sender.sendMessage("§7:$namenotlikethis: §8| §f\uE249") }

            val enablemonkahmm = plugin.config.getString("monkahmm.enable", "false")
            val namemonkahmm = plugin.config.getString("monkahmm.name", "Error")
            if (enablemonkahmm == "true") { sender.sendMessage("§7:$namemonkahmm: §8| §f\uE248") }

            val enablekek = plugin.config.getString("kek.enable", "false")
            val namekek = plugin.config.getString("kek.name", "Error")
            if (enablekek == "true") { sender.sendMessage("§7:$namekek: §8| §f\uE247") }

            val enablehuh = plugin.config.getString("huh.enable", "false")
            val namehuh = plugin.config.getString("huh.name", "Error")
            if (enablehuh == "true") { sender.sendMessage("§7:$namehuh: §8| §f\uE231") }

            val enablegasp = plugin.config.getString("gasp.enable", "false")
            val namegasp = plugin.config.getString("gasp.name", "Error")
            if (enablegasp == "true") { sender.sendMessage("§7:$namegasp: §8| §f\uE230") }

            val enablekappa = plugin.config.getString("kappa.enable", "false")
            val namekappa = plugin.config.getString("kappa.name", "Error")
            if (enablekappa == "true") { sender.sendMessage("§7:$namekappa: §8| §f\uE246") }

            val enablelul = plugin.config.getString("lul.enable", "false")
            val namelul = plugin.config.getString("lul.name", "Error")
            if (enablelul == "true") { sender.sendMessage("§7:$namelul: §8| §f\uE245") }

            val enablepogchamp = plugin.config.getString("pogchamp.enable", "false")
            val namepogchamp = plugin.config.getString("pogchamp.name", "Error")
            if (enablepogchamp == "true") { sender.sendMessage("§7:$namepogchamp: §8| §f\uE244") }

            val enablekekw = plugin.config.getString("kekw.enable", "false")
            val namekekw = plugin.config.getString("kekw.name", "Error")
            if (enablekekw == "true") { sender.sendMessage("§7:$namekekw: §8| §f\uE261") }

            val enablepepelaugh = plugin.config.getString("pepelaugh.enable", "false")
            val namepepelaugh = plugin.config.getString("pepelaugh.name", "Error")
            if (enablepepelaugh == "true") { sender.sendMessage("§7:$namepepelaugh: §8| §f\uE243") }

            val enablejebaited = plugin.config.getString("jebaited.enable", "false")
            val namejebaited = plugin.config.getString("jebaited.name", "Error")
            if (enablejebaited == "true") { sender.sendMessage("§7:$namejebaited: §8| §f\uE242") }

            val enableweirdchamp = plugin.config.getString("weirdchamp.enable", "false")
            val nameweirdchamp = plugin.config.getString("weirdchamp.name", "Error")
            if (enableweirdchamp == "true") { sender.sendMessage("§7:$nameweirdchamp: §8| §f\uE241") }

            val enablemonkah = plugin.config.getString("monkah.enable", "false")
            val namemonkah = plugin.config.getString("monkah.name", "Error")
            if (enablemonkah == "true") { sender.sendMessage("§7:$namemonkah: §8| §f\uE240") }

            val enableforsencd = plugin.config.getString("forsencd.enable", "false")
            val nameforsencd = plugin.config.getString("forsencd.name", "Error")
            if (enableforsencd == "true") { sender.sendMessage("§7:$nameforsencd: §8| §f\uE263") }

            val enableresidentsleeper = plugin.config.getString("residentsleeper.enable", "false")
            val nameresidentsleeper = plugin.config.getString("residentsleeper.name", "Error")
            if (enableresidentsleeper == "true") { sender.sendMessage("§7:$nameresidentsleeper: §8| §f\uE238") }

            val enable3head = plugin.config.getString("3head.enable", "false")
            val name3head = plugin.config.getString("3head.name", "Error")
            if (enable3head == "true") { sender.sendMessage("§7:$name3head: §8| §f\uE237") }

            val enableheart = plugin.config.getString("heart.enable", "false")
            val nameheart = plugin.config.getString("heart.name", "Error")
            if (enableheart == "true") { sender.sendMessage("§7:$nameheart: §8| §f\uE265") }

            val enablejoy = plugin.config.getString("joy.enable", "false")
            val namejoy = plugin.config.getString("joy.name", "Error")
            if (enablejoy == "true") { sender.sendMessage("§7:$namejoy: §8| §f\uE266") }

            val enablerolf = plugin.config.getString("rolf.enable", "false")
            val namerolf = plugin.config.getString("rolf.name", "Error")
            if (enablerolf == "true") { sender.sendMessage("§7:$namerolf: §8| §f\uE267") }

            val enablesmile = plugin.config.getString("smile.enable", "false")
            val namesmile = plugin.config.getString("smile.name", "Error")
            if (enablesmile == "true") { sender.sendMessage("§7:$namesmile: §8| §f\uE268") }

            val enablegrin = plugin.config.getString("grin.enable", "false")
            val namegrin = plugin.config.getString("grin.name", "Error")
            if (enablegrin == "true") { sender.sendMessage("§7:$namegrin: §8| §f\uE269") }

            val enablesweat = plugin.config.getString("sweat.enable", "false")
            val namesweat = plugin.config.getString("sweat.name", "Error")
            if (enablesweat == "true") { sender.sendMessage("§7:$namesweat: §8| §f\uE270") }

            val enablesob = plugin.config.getString("sob.enable", "false")
            val namesob = plugin.config.getString("sob.name", "Error")
            if (enablesob == "true") { sender.sendMessage("§7:$namesob: §8| §f\uE271") }

            val enableupside = plugin.config.getString("upside.enable", "false")
            val nameupside = plugin.config.getString("upside.name", "Error")
            if (enableupside == "true") { sender.sendMessage("§7:$nameupside: §8| §f\uE272") }

            val enablehot = plugin.config.getString("hot.enable", "false")
            val namehot = plugin.config.getString("hot.name", "Error")
            if (enablehot == "true") { sender.sendMessage("§7:$namehot: §8| §f\uE273") }


            sender.sendMessage("§8==============================")
            return true

        }

        sender.sendMessage("${prefix} ${errormess}")

        return true
    }
}