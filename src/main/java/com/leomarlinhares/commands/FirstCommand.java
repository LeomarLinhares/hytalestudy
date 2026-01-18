package com.leomarlinhares.commands;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.CommandSender;
import com.hypixel.hytale.server.core.command.system.basecommands.CommandBase;
import com.hypixel.hytale.server.core.entity.entities.Player;

import javax.annotation.Nonnull;

public class FirstCommand extends CommandBase {
    public FirstCommand() {
        super("first", "FIRST COMMAND");
    }

    @Override
    protected void executeSync(@Nonnull CommandContext commandContext) {
        commandContext.sendMessage(Message.raw("Hello World!"));

//        outra forma --------------------

//        CommandSender sender = commandContext.sender();
//        // if (!(sender instanceof Player player)) return; // apenas caso queira verificar se quem enviou foi um player (acho)
//
//        sender.sendMessage(Message.raw("Hello World!"));
    }
}
