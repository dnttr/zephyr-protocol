package org.dnttr.zephyr.protocol.packet;

/**
 * @author dnttr
 */

public abstract class Packet {

    public Data getData() {
        return this.getClass().getDeclaredAnnotation(Data.class);
    }
}
