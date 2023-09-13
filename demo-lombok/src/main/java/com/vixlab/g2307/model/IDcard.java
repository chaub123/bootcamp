package com.vixlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Builder
@ToString(callSuper = true)
public class IDcard extends Document {
    private String name;
}
