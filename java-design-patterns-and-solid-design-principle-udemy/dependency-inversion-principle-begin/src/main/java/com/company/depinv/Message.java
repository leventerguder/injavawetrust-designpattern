package com.company.depinv;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Message {

    private String msg;

    private LocalDateTime timestamp;

    public Message(String msg) {
        this.msg = msg;
        this.timestamp = LocalDateTime.now(ZoneId.of("UTC"));
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
