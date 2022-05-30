package com.company.openclose;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CallHistory {

    public static class Call {

        private LocalDateTime begin;

        private long duration;

        private Long subscriberId;

        public Call(Long subscriberId, LocalDateTime begin, long duration) {
            this.begin = begin;
            this.duration = duration;
            this.subscriberId = subscriberId;
        }

        /**
         * @return the begin
         */
        public LocalDateTime getBegin() {
            return begin;
        }

        /**
         * @return the duration
         */
        public long getDuration() {
            return duration;
        }

        /**
         * @return the subscriber
         */
        public Long getSubscriberId() {
            return subscriberId;
        }

    }

    private static final Map<Long, List<Call>> CALLS = new HashMap<>();

    public synchronized static List<Call> getCurrentCalls(Long subscriberId) {
        if (!CALLS.containsKey(subscriberId)) {
            return Collections.emptyList();
        }
        return CALLS.get(subscriberId);
    }

    public synchronized static void addSession(Long subscriberId, LocalDateTime begin, long duration) {
        List<Call> calls;
        if (!CALLS.containsKey(subscriberId)) {
            calls = new LinkedList<>();
            CALLS.put(subscriberId, calls);
        } else {
            calls = CALLS.get(subscriberId);
        }
        calls.add(new Call(subscriberId, begin, duration));
    }
}