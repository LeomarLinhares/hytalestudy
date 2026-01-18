package com.leomarlinhares.system;

import com.hypixel.hytale.component.*;
import com.hypixel.hytale.component.system.EntityEventSystem;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.ecs.BreakBlockEvent;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class EntityEventCapSystem extends EntityEventSystem<EntityStore, BreakBlockEvent> {
    public EntityEventCapSystem() {
        super(BreakBlockEvent.class);
    }

    @Override
    public void handle(int index, @NonNullDecl ArchetypeChunk<EntityStore> archetypeChunk, @NullableDecl Store<EntityStore> store, @NonNullDecl CommandBuffer<EntityStore> commandBuffer, @NonNullDecl BreakBlockEvent event) {
        Ref<EntityStore> reference = archetypeChunk.getReferenceTo(index);

        Player player = store.getComponent(reference, Player.getComponentType());
        if (player == null) return;

        player.sendMessage(Message.raw("BreakBlockEvent - %s".formatted(event.getBlockType().getId())));
    }

    @NullableDecl
    @Override
    public ComponentType<EntityStore, PlayerRef> getQuery() {
        return PlayerRef.getComponentType();
    }

}
