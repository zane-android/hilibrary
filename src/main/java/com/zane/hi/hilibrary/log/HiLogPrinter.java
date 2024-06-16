package com.zane.hi.hilibrary.log;

import org.jetbrains.annotations.NotNull;

public interface HiLogPrinter {
    void print(@NotNull HiLogConfig config, int level, String tag, @NotNull String printString);
}
