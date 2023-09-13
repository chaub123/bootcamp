package com.vixlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
// @NoArgsConstructor
@Builder
// @Getter
// @Setter
// @ToString
@Data
public class Book {
    private String author;
    private double weight;
}
