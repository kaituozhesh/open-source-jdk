/*
 *
 * Copyright (c) 2007, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
// Copyright (c) 1995-96 by Cisco Systems, Inc.

package com.sun.jmx.snmp;

import java.io.Serializable;

/**
 * Is the fully decoded representation of an SNMP packet.
 * <P>
 * You will not usually need to use this class, except if you
 * decide to implement your own
 * {@link SnmpPduFactory SnmpPduFactory} object.
 * <P>
 * Classes are derived from <CODE>SnmpPduPacket</CODE> to
 * represent the different forms of SNMP packets
 * ({@link SnmpPduRequest SnmpPduRequest},
 * {@link SnmpPduTrap SnmpPduTrap},
 * {@link SnmpPduBulk SnmpPduBulk}).
 * <BR>The <CODE>SnmpPduPacket</CODE> class defines the attributes
 * common to every form of SNMP packets.
 *
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @see SnmpMessage
 * @see SnmpPduFactory
 *
 */

public abstract class SnmpPduPacket extends SnmpPdu implements Serializable {
    /**
     * The pdu community string.
     */
    public byte[] community ;
}
