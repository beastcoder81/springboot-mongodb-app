package com.example.myprograms.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BatchStatus {

    COMPLETE("COMPLETE"), ACTIVE("ACTIVE"), PENDING("PENDING"), IN_PROGRESS("IN_PROGRESS");

    public final String value;
}
