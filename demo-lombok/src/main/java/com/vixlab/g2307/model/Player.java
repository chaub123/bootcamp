package com.vixlab.g2307.model;

public class Player {
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int defense;

    private Player(Builder builder) {
        this.name = builder.name;
        this.hp = builder.hp;
        this.mp = builder.mp;
        this.attack = builder.attack;
        this.defense = builder.defense;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Player[name=" + this.name + ", hp=" + this.hp + ", mp="
                + this.mp + ", attack=" + this.attack + ", defense="
                + this.defense + "]";
    }

    public static class Builder {
        private String name;
        private int hp;
        private int mp;
        private int attack;
        private int defense;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder hp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder mp(int mp) {
            this.mp = mp;
            return this;
        }

        public Builder attack(int attack) {
            this.attack = attack;
            return this;
        }

        public Builder defense(int defense) {
            this.defense = defense;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}
