package com.github.mdjoon.template

import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.attribute.AttributeModifier
import org.bukkit.command.PluginCommand
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin

class Template : JavaPlugin(), Listener {
    override fun onEnable() {
        println("hi")
        server.pluginManager.registerEvents(this@Template, this@Template)
        registerCommand("hello") { cmd, _ ->
            cmd.sender.sendMessage("hi")
        }

    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val player = event.player
    }


}