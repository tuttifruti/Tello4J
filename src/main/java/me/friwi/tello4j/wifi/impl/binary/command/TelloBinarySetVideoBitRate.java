package me.friwi.tello4j.wifi.impl.binary.command;

import java.io.UnsupportedEncodingException;

import me.friwi.tello4j.api.exception.TelloCustomCommandException;
import me.friwi.tello4j.api.exception.TelloGeneralCommandException;
import me.friwi.tello4j.api.exception.TelloNetworkException;
import me.friwi.tello4j.api.exception.TelloNoValidIMUException;
import me.friwi.tello4j.wifi.impl.binary.PacketTypeValues;
import me.friwi.tello4j.wifi.impl.binary.TelloHeader;
import me.friwi.tello4j.wifi.impl.binary.TelloMessageID;
import me.friwi.tello4j.wifi.impl.binary.TelloPacket;
import me.friwi.tello4j.wifi.impl.binary.TelloSubPacket;
import me.friwi.tello4j.wifi.impl.binary.TelloVideoBitRate;
import me.friwi.tello4j.wifi.model.response.TelloResponse;

public class TelloBinarySetVideoBitRate extends TelloBinaryCommand{



    private final TelloVideoBitRate rate;
    //                                                                       crc    typ  cmdL  cmdH  seqL  seqH  rateL  crc
    private static final byte[] bytes = new byte[] {(byte) 0xcc, 0x60, 0x00, 0x27, 0x68, 0x20, 0x00, 0x08, 0x00, 0x01, (byte) 146, 10};


    
    public TelloBinarySetVideoBitRate(TelloVideoBitRate rate) {
        this.rate = rate;
    }
    @Override
    public byte[] serializeCommand() {
        bytes[9] = (byte) rate.ordinal();
        return bytes;
    }

    @Override
    public TelloResponse buildResponse(String data) throws TelloGeneralCommandException, TelloNoValidIMUException, TelloCustomCommandException, TelloNetworkException, UnsupportedEncodingException {
        return null;
    }
}
