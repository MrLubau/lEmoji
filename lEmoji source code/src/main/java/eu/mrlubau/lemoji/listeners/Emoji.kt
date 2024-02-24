package eu.mrlubau.lemoji.listeners

import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.plugin.java.JavaPlugin

class Emoji(private val plugin: JavaPlugin) : Listener {

    init {
        plugin.saveDefaultConfig()
    }

    @EventHandler
    fun onPlayerChat(event: AsyncPlayerChatEvent) {

        val config: FileConfiguration = plugin.config

        var message = event.message


        val enablexd = config.getString("xd.enable", "false")
        val namexd = config.getString("xd.name", "xd")
        if (enablexd == "true") { message = replaceEmoji(message, ":$namexd:", "\uE260") }

        val enablepog = config.getString("pog.enable", "false")
        val namepog = config.getString("pog.name", "xd")
        if (enablepog == "true") { message = replaceEmoji(message, ":$namepog:", "\uE234") }

        val enableragey = config.getString("ragey.enable", "false")
        val nameragey = config.getString("ragey.name", "xd")
        if (enableragey == "true") { message = replaceEmoji(message, ":$nameragey:", "\uE233") }

        val enablepepehands = config.getString("pepehands.enable", "false")
        val namepepehands = config.getString("pepehands.name", "xd")
        if (enablepepehands == "true") { message = replaceEmoji(message, ":$namepepehands:", "\uE235") }

        val enablemonkas = config.getString("monkas.enable", "false")
        val namemonkas = config.getString("monkas.name", "xd")
        if (enablemonkas == "true") { message = replaceEmoji(message, ":$namemonkas:", "\uE236") }

        val enablesadge = config.getString("sadge.enable", "false")
        val namesadge = config.getString("sadge.name", "xd")
        if (enablesadge == "true") { message = replaceEmoji(message, ":$namesadge:", "\uE257") }

        val enablepepepausechamp = config.getString("pepepausechamp.enable", "false")
        val namepepepausechamp = config.getString("pepepausechamp.name", "xd")
        if (enablepepepausechamp == "true") { message = replaceEmoji(message, ":$namepepepausechamp:", "\uE256") }



        val enablepeepolove = config.getString("peepolove.enable", "false")
        val namepeepolove = config.getString("peepolove.name", "xd")
        if (enablepeepolove == "true") { message = replaceEmoji(message, ":$namepeepolove:", "\uE255") }

        val enablepeeposad = config.getString("peeposad.enable", "false")
        val namepeeposad = config.getString("peeposad.name", "xd")
        if (enablepeeposad == "true") { message = replaceEmoji(message, ":$namepeeposad:", "\uE254") }

        val enablepausechamp = config.getString("pausechamp.enable", "false")
        val namepausechamp = config.getString("pausechamp.name", "xd")
        if (enablepausechamp == "true") { message = replaceEmoji(message, ":$namepausechamp:", "\uE253") }

        val enablepagman = config.getString("pagman.enable", "false")
        val namepagman = config.getString("pagman.name", "xd")
        if (enablepagman == "true") { message = replaceEmoji(message, ":$namepagman:", "\uE252") }

        val enableomegasp = config.getString("omegasp.enable", "false")
        val nameomegasp = config.getString("omegasp.name", "xd")
        if (enableomegasp == "true") { message = replaceEmoji(message, ":$nameomegasp:", "\uE251") }

        val enableomegalul = config.getString("omegalul.enable", "false")
        val nameomegalul = config.getString("omegalul.name", "xd")
        if (enableomegalul == "true") { message = replaceEmoji(message, ":$nameomegalul:", "\uE250") }

        val enablenotlikethis = config.getString("notlikethis.enable", "false")
        val namenotlikethis = config.getString("notlikethis.name", "xd")
        if (enablenotlikethis == "true") { message = replaceEmoji(message, ":$namenotlikethis:", "\uE249") }

        val enablemonkahmm = config.getString("monkahmm.enable", "false")
        val namemonkahmm = config.getString("monkahmm.name", "xd")
        if (enablemonkahmm == "true") { message = replaceEmoji(message, ":$namemonkahmm:", "\uE248") }

        val enablekek = config.getString("kek.enable", "false")
        val namekek = config.getString("kek.name", "xd")
        if (enablekek == "true") { message = replaceEmoji(message, ":$namekek:", "\uE247") }

        val enablehuh = config.getString("huh.enable", "false")
        val namehuh = config.getString("huh.name", "xd")
        if (enablehuh == "true") { message = replaceEmoji(message, ":$namehuh:", "\uE231") }

        val enablegasp = config.getString("gasp.enable", "false")
        val namegasp = config.getString("gasp.name", "xd")
        if (enablegasp == "true") { message = replaceEmoji(message, ":$namegasp:", "\uE230") }

        val enablekappa = config.getString("kappa.enable", "false")
        val namekappa = config.getString("kappa.name", "xd")
        if (enablekappa == "true") { message = replaceEmoji(message, ":$namekappa:", "\uE246") }

        val enablelul = config.getString("lul.enable", "false")
        val namelul = config.getString("lul.name", "xd")
        if (enablelul == "true") { message = replaceEmoji(message, ":$namelul:", "\uE245") }

        val enablepogchamp = config.getString("pogchamp.enable", "false")
        val namepogchamp = config.getString("pogchamp.name", "xd")
        if (enablepogchamp == "true") { message = replaceEmoji(message, ":$namepogchamp:", "\uE244") }

        val enablekekw = config.getString("kekw.enable", "false")
        val namekekw = config.getString("kekw.name", "xd")
        if (enablekekw == "true") { message = replaceEmoji(message, ":$namekekw:", "\uE261") }

        val enablepepelaugh = config.getString("pepelaugh.enable", "false")
        val namepepelaugh = config.getString("pepelaugh.name", "xd")
        if (enablepepelaugh == "true") { message = replaceEmoji(message, ":$namepepelaugh:", "\uE243") }

        val enablejebaited = config.getString("jebaited.enable", "false")
        val namejebaited = config.getString("jebaited.name", "xd")
        if (enablejebaited == "true") { message = replaceEmoji(message, ":$namejebaited:", "\uE242") }

        val enableweirdchamp = config.getString("weirdchamp.enable", "false")
        val nameweirdchamp = config.getString("weirdchamp.name", "xd")
        if (enableweirdchamp == "true") { message = replaceEmoji(message, ":$nameweirdchamp:", "\uE241") }

        val enablemonkah = config.getString("monkah.enable", "false")
        val namemonkah = config.getString("monkah.name", "xd")
        if (enablemonkah == "true") { message = replaceEmoji(message, ":$namemonkah:", "\uE240") }

        val enableforsencd = config.getString("forsencd.enable", "false")
        val nameforsencd = config.getString("forsencd.name", "xd")
        if (enableforsencd == "true") { message = replaceEmoji(message, ":$nameforsencd:", "\uE263") }

        val enableresidentsleeper = config.getString("residentsleeper.enable", "false")
        val nameresidentsleeper = config.getString("residentsleeper.name", "xd")
        if (enableresidentsleeper == "true") { message = replaceEmoji(message, ":$nameresidentsleeper:", "\uE238") }

        val enable3head = config.getString("3head.enable", "false")
        val name3head = config.getString("3head.name", "xd")
        if (enable3head == "true") { message = replaceEmoji(message, ":$name3head:", "\uE237") }





        val enableheart = config.getString("heart.enable", "false")
        val nameheart = config.getString("heart.name", "xd")
        if (enableheart == "true") { message = replaceEmoji(message, ":$nameheart:", "\uE265") }

        val enablejoy = config.getString("joy.enable", "false")
        val namejoy = config.getString("joy.name", "xd")
        if (enablejoy == "true") { message = replaceEmoji(message, ":$namejoy:", "\uE266") }

        val enablerolf = config.getString("rolf.enable", "false")
        val namerolf = config.getString("rolf.name", "xd")
        if (enablerolf == "true") { message = replaceEmoji(message, ":$namerolf:", "\uE267") }

        val enablesmile = config.getString("smile.enable", "false")
        val namesmile = config.getString("smile.name", "xd")
        if (enablesmile == "true") { message = replaceEmoji(message, ":$namesmile:", "\uE268") }

        val enablegrin = config.getString("grin.enable", "false")
        val namegrin = config.getString("grin.name", "xd")
        if (enablegrin == "true") { message = replaceEmoji(message, ":$namegrin:", "\uE269") }

        val enablesweat = config.getString("sweat.enable", "false")
        val namesweat = config.getString("sweat.name", "xd")
        if (enablesweat == "true") { message = replaceEmoji(message, ":$namesweat:", "\uE270") }

        val enablesob = config.getString("sob.enable", "false")
        val namesob = config.getString("sob.name", "xd")
        if (enablesob == "true") { message = replaceEmoji(message, ":$namesob:", "\uE271") }

        val enableupside = config.getString("upside.enable", "false")
        val nameupside = config.getString("upside.name", "xd")
        if (enableupside == "true") { message = replaceEmoji(message, ":$nameupside:", "\uE272") }

        val enablehot = config.getString("hot.enable", "false")
        val namehot = config.getString("hot.name", "xd")
        if (enablehot == "true") { message = replaceEmoji(message, ":$namehot:", "\uE273") }

        event.message = message
    }

    private fun replaceEmoji(input: String, emojiPattern: String, replacement: String): String {
        return input.replace(emojiPattern, replacement)
    }

}