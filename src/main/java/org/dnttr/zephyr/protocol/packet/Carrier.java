package org.dnttr.zephyr.protocol.packet;

import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.NotNull;

public record Carrier(int version, int identity, int hash, int content, ByteBuf buffer) {

    @Override
    public @NotNull String toString() {
        return "Carrier{" +
                "version=" + version +
                ", identity=" + identity +
                ", hash=" + hash +
                ", content=" + content +
                ", buffer=" + buffer +
                '}';
    }
}
