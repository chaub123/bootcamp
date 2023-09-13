package com.vixlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
public class Passport extends Document{
    private String name;
}
