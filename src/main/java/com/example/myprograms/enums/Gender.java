package com.example.myprograms.enums;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {
    MALE("MALE"), FEMALE("FEMALE");

    private final String value;
}


