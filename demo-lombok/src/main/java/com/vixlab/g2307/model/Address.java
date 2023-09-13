package com.vixlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@ToString
public class Address {
    private String addrLine1;
    private String addrLine2;
    private String addrLine3;
    @NonNull
    private Country country;

    public static void main(String[] args) {
        Address a1 = new Address(Country.HK);
        Address a2 = Address.builder()
            .addrLine1("Flat D")
            .addrLine2("3/F")
            .addrLine3("Tower3")
            .country(Country.UK)
            .build();

        System.out.println(a2.toString());
    }
}
