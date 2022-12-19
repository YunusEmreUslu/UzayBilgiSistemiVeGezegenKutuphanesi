package com.turgay;

public class Gazlar {
    private float Hidrojen, Karbon, Oksijen, Azot;

    public Gazlar(float hidrojen, float karbon, float oksijen, float azot) {
        Hidrojen = hidrojen;
        Karbon = karbon;
        Oksijen = oksijen;
        Azot = azot;
    }

    public float getHidrojen() {
        return Hidrojen;
    }

    public float getAzot() {
        return Azot;
    }

    public float getKarbon() {
        return Karbon;
    }

    public float getOksijen() {
        return Oksijen;
    }
}
