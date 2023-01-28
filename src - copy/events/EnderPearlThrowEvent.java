package events;

import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class EnderPearlThrowEvent extends Event {

    private Player thrower;
    private EnderPearl pearl;
    private boolean cancelled;
    private static final HandlerList handlers = new HandlerList();

    public EnderPearlThrowEvent(Player thrower, EnderPearl pearl) {
        this.thrower = thrower;
        this.pearl = pearl;
    }

    public Player getThrower() {
        return thrower;
    }

    public EnderPearl getPearl() {
        return pearl;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public String getEventName() {
        return super.getEventName();
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}