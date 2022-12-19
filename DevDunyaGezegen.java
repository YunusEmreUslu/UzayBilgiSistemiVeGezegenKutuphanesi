package com.turgay;

public class DevDunyaGezegen extends Gezegen implements IGezegen{

    public DevDunyaGezegen(String isim, float yerCekimi, Gazlar gazlar, float uzaklik, int gonderilenUyduSayisi, float sicaklik, boolean atmosferVarMi, float radyasyonOrani, float yuzolcumu) {
        super(isim, yerCekimi, gazlar, uzaklik, gonderilenUyduSayisi, sicaklik, atmosferVarMi, radyasyonOrani, yuzolcumu);
    }

    @Override
    public void sartlariIyilestir() {

    }

    @Override
    public void sartlariKotulestir() {

    }

    @Override
    public void yasanabilirHaleGetir() {

    }
}
