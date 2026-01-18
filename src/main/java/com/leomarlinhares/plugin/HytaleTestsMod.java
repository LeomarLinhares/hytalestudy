package com.leomarlinhares.plugin;

import com.hypixel.hytale.server.core.command.system.CommandRegistry;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.leomarlinhares.commands.FirstCommand;
import com.leomarlinhares.system.BreakBlockSystem;
import com.leomarlinhares.system.OpenChestShopSystem;
import com.leomarlinhares.system.SwitchActiveSlotSystem;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class HytaleTestsMod extends JavaPlugin {

    public HytaleTestsMod(@NonNullDecl JavaPluginInit init) { super(init); }


    @Override
    protected void setup() {
        super.setup();
        CommandRegistry commandRegistry = this.getCommandRegistry();
        commandRegistry.registerCommand(new FirstCommand());

        // Initialize event systems
        this.getEntityStoreRegistry().registerSystem(new OpenChestShopSystem());
        this.getEntityStoreRegistry().registerSystem(new BreakBlockSystem());
        this.getEntityStoreRegistry().registerSystem(new SwitchActiveSlotSystem());
    }
}
