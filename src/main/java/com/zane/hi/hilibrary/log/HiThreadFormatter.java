package com.zane.hi.hilibrary.log;

public class HiThreadFormatter implements HiLogFormater<Thread> {
    @Override
    public String format(Thread data) {
        return "Thread:" + data.getName();
    }
}
