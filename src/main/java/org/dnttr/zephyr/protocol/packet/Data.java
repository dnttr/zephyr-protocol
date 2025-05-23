package org.dnttr.zephyr.protocol.packet;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author dnttr
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Data {

    /*
     * TODO: add stream support
     */

    int identity();
    int version();
}
