package org.dnttr.zephyr.protocol.packet.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.dnttr.zephyr.protocol.Constants;
import org.dnttr.zephyr.protocol.packet.Data;
import org.dnttr.zephyr.protocol.packet.Packet;

/**
 * @author dnttr
 */

@Getter
@RequiredArgsConstructor
@Data(identity = -0x3, version = Constants.VER_1)
public final class SessionStatePacket extends Packet {

    private final int state;

    @Getter
    @RequiredArgsConstructor
    public enum State {

        AVAILABLE(0x0),
        NOT_AVAILABLE(0x1),
        READY(0x2);

        private final int value;
    }
}
