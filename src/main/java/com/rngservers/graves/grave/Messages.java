package com.rngservers.graves.grave;

import com.rngservers.graves.Main;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Messages {
    private Main plugin;

    public Messages(Main plugin) {
        this.plugin = plugin;
    }

    public void graveLoot(Location location, Player player) {
        String lootMessage = plugin.getConfig().getString("settings.lootMessage")
                .replace("&", "§");
        if (!lootMessage.equals("")) {
            player.sendMessage(lootMessage);
        }
        String lootSound = plugin.getConfig().getString("settings.lootSound");
        if (!lootSound.equals("")) {
            location.getWorld().playSound(location, Sound.valueOf(lootSound.toUpperCase()), 1, 1);
        }
        String lootEffect = plugin.getConfig().getString("settings.lootEffect");
        if (!lootEffect.equals("")) {
            location.getWorld().playEffect(location, Effect.valueOf(lootEffect), 0);
        }
    }

    public void graveOpen(Location location) {
        String graveOpenSound = plugin.getConfig().getString("settings.graveOpenSound");
        if (!graveOpenSound.equals("")) {
            location.getWorld().playSound(location,
                    Sound.valueOf(graveOpenSound.toUpperCase()), 1, 1);
        }
    }

    public void graveClose(Location location) {
        String graveCloseSound = plugin.getConfig().getString("settings.graveCloseSound");
        if (!graveCloseSound.equals("")) {
            location.getWorld().playSound(location,
                    Sound.valueOf(graveCloseSound.toUpperCase()), 1, 1);
        }
    }

    public void graveMax(Player player) {
        String graveMaxMessage = plugin.getConfig().getString("settings.graveMaxMessage")
                .replace("&", "§");
        if (!graveMaxMessage.equals("")) {
            player.sendMessage(graveMaxMessage);
        }
    }

    public void graveProtected(Player player, Location location) {
        String graveProtectedMessage = plugin.getConfig().getString("settings.graveProtectedMessage")
                .replace("&", "§");
        if (!graveProtectedMessage.equals("")) {
            player.sendMessage(graveProtectedMessage);
        }
        String graveProtectedSound = plugin.getConfig().getString("settings.graveProtectedSound");
        if (!graveProtectedSound.equals("")) {
            location.getWorld().playSound(location, Sound.valueOf(graveProtectedSound.toUpperCase()), 1, 1);
        }
    }

    public void graveTokenNoTokenMessage(Player player) {
        String graveTokenName = plugin.getConfig().getString("settings.graveTokenName").replace("&", "§");
        String graveTokenNoTokenMessage = plugin.getConfig().getString("settings.graveTokenNoTokenMessage")
                .replace("$name", graveTokenName).replace("&", "§");
        if (!graveTokenNoTokenMessage.equals("")) {
            player.sendMessage(graveTokenNoTokenMessage);
        }
    }

    public void graveChangeProtect(Location location) {
        String graveProtectedChangeSound = plugin.getConfig().getString("settings.graveProtectedChangeSound");
        if (!graveProtectedChangeSound.equals("")) {
            location.getWorld().playSound(location, Sound.valueOf(graveProtectedChangeSound.toUpperCase()), 1.0F, 1.0F);
        }
    }

    public void permissionDenied(CommandSender sender) {
        String permissionDenied = plugin.getConfig().getString("settings.permissionDenied")
                .replace("&", "§");
        if (!permissionDenied.equals("")) {
            sender.sendMessage(permissionDenied);
        }
    }
}
