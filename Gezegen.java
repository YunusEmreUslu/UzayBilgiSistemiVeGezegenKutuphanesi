package com.turgay;

public class Gezegen{
    private String isim;
    private float yerCekimi;
    private float uzaklik;
    private int gonderilenUyduSayisi;
    private float sicaklik;
    private boolean atmosferVarMi;
    private float radyasyonOrani;
    private float yuzolcumu;
    private Gazlar gazlar;

    public Gezegen(){

    }

    public Gezegen(String isim, float yerCekimi, Gazlar gazlar, float uzaklik, int gonderilenUyduSayisi, float sicaklik, boolean atmosferVarMi, float radyasyonOrani, float yuzolcumu) {
        this.isim = isim;
        this.yerCekimi = yerCekimi;
        this.gazlar = gazlar;
        this.uzaklik = uzaklik;
        this.gonderilenUyduSayisi = gonderilenUyduSayisi;
        this.sicaklik = sicaklik;
        this.atmosferVarMi = atmosferVarMi;
        this.radyasyonOrani = radyasyonOrani;
        this.yuzolcumu = yuzolcumu;
    }

    @Override
    public String toString() {
        return "Gezegen{" +
                "isim='" + isim + '\'' +
                ", yerCekimi=" + yerCekimi +
                ", uzaklik=" + uzaklik +
                ", gonderilenUyduSayisi=" + gonderilenUyduSayisi +
                ", sicaklik=" + sicaklik +
                ", atmosferVarMi=" + atmosferVarMi +
                ", radyasyonOrani=" + radyasyonOrani +
                ", yuzolcumu=" + yuzolcumu +
                ", gazlar=" + gazlar +
                '}';
    }

    public void gezegenDetay(){

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public float getYerCekimi() {
        return yerCekimi;
    }

    public void setYerCekimi(float yerCekimi) {
        this.yerCekimi = yerCekimi;
    }

    public Gazlar getGazlar() {
        return gazlar;
    }

    public void setGazlar(Gazlar gazlar) {
        this.gazlar = gazlar;
    }

    public float getUzaklik() {
        return uzaklik;
    }

    public void setUzaklik(float uzaklik) {
        this.uzaklik = uzaklik;
    }

    public int getGonderilenUyduSayisi() {
        return gonderilenUyduSayisi;
    }

    public void setGonderilenUyduSayisi(int gonderilenUyduSayisi) {
        this.gonderilenUyduSayisi = gonderilenUyduSayisi;
    }

    public float getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(float sicaklik) {
        this.sicaklik = sicaklik;
    }

    public boolean AtmosferVarMi() {
        return atmosferVarMi;
    }

    public void setAtmosferVarMi(boolean atmosferVarMi) {
        this.atmosferVarMi = atmosferVarMi;
    }

    public float getRadyasyonOrani() {
        return radyasyonOrani;
    }

    public void setRadyasyonOrani(float radyasyonOrani) {
        this.radyasyonOrani = radyasyonOrani;
    }

    public float getYuzolcumu() {
        return yuzolcumu;
    }

    public void setYuzolcumu(float yuzolcumu) {
        this.yuzolcumu = yuzolcumu;
    }

    public Gezegen rastgeleOlustur(){
        return null;
    }

    public Gezegen duzenle(){
        return null;
    }

    public void kiyasla(Gezegen gezegen){

    }
}

