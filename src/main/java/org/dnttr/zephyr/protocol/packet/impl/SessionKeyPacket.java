package org.dnttr.zephyr.protocol.packet.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.dnttr.zephyr.protocol.Constants;
import org.dnttr.zephyr.protocol.packet.Data;
import org.dnttr.zephyr.protocol.packet.Packet;
import org.dnttr.zephyr.serializer.annotations.Serializable;

/**
 * @author dnttr
 */

@Getter
@Serializable
@RequiredArgsConstructor
@Data(identity = -0x1, version = Constants.VER_1)
public final class SessionKeyPacket extends Packet {

    private final byte[] key;
}
