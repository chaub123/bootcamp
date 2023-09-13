package com.vixlab.g2307.model;

public class Sandbox {
    public static void main(String[] args) {
        IDcard card = IDcard.builder().id(12345).issueCountry(Country.HK)
                .name("Vincent").build();
        Passport passport = Passport.builder().id(8923).issueCountry(Country.UK)
                .name("Vincent").build();

        IDcard card2 = IDcard.builder().name("Edwin").build();

        System.out.println(card);
        System.out.println(passport);

        Player player = Player.builder()
                            .name("Chaub123")
                            .hp(100)
                            .mp(40)
                            .attack(25)
                            .defense(20)
                            .build();
        System.out.println(player);
    }
}
