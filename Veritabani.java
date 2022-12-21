package com.turgay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Veritabani {

    ArrayList<Gezegen> gezegenler;

    public Veritabani(){
        gezegenler = new ArrayList<Gezegen>(
                Arrays.asList(
                        new KarasalGezegen("Gliese 876 b", -10, new Gazlar(0.05f, 0.6f, 0.03f, 0.02f), 15, 0, -93, false,  5, 500),
                        new KarasalGezegen("HD134987 b", -10, new Gazlar(0.005f, 0.005f, 0.21f, 0.78f), 82, 0, 42, false, 5, 483),
                        new KarasalGezegen("HD210277", -10, null, 69, 0, -23, false,  5, 390),
                        new KarasalGezegen("16 Cygni b", -10, null, 70, 0, -83, false,  5, 534),
                        new KarasalGezegen("47 Ursae Majoris b", -10, null, 46, 0, -83, false,  5, 754),
                        new KarasalGezegen("HD10697 b", -10, null, 108, 0, -9, false,  5, 1806),
                        new KarasalGezegen("HD37124 c", -10, null, 103, 0, 54, false,  5, 201),
                        new KarasalGezegen("HD222582 b", -10, null, 137, 0, -39, false,  5, 2511),
                        new KarasalGezegen("14 Herculis b", -10, null, 59, 0, -143, false,  5, 2439),
                        new KarasalGezegen("70 Virginis b", -10, null, 58, 0, 100, false,  5, 2247),
                        new SicakGezegen("HD209458", -10, null, 158, 0, 1037, false,  5, 219),
                        new SicakGezegen("51 Pegasi b", -10, null, 50, 0, 850, false,  5, 138),
                        new SicakGezegen("Tau Bootis b", -10, null, 51, 0, 1200, false,  5, 1785),
                        new SicakGezegen("HD187123 c", -10, null, 150, 0, 1054, false,  5, 600),
                        new SicakGezegen("HD75289 b", -10, null, 95, 0, 1115, false,  5, 150),
                        new SicakGezegen("HD217107 c", -10, null, 65, 0, 675, false,  5, 390),
                        new SicakGezegen("Gliese 86 b", -10, null, 35, 0, 325, false,  5, 1326),
                        new SicakGezegen("HD192263 b", -10, null, 65, 0, 215, false,  5, 168),
                        new SicakGezegen("55 Cancri b", -10, null, 41, 0, 355, false,  5, 249),
                        new SicakGezegen("AU Microscopii b", -10, null, 32, 0, 320, false,  5, 20),
                        new DevDunyaGezegen("Proxima Centauri b", -10, null, 4, 0, -39, true,  5, 1.27f),
                        new DevDunyaGezegen("Ross 128 b", -10, null, 11, 0, -28, true,  5, 1.41f),
                        new DevDunyaGezegen("TOI-206 b", -10, null, 156, 0, 637, false,  5, 2.24f),
                        new DevDunyaGezegen("55 Cancri e", -10, null, 41, 0, 325, false,  5, 7.99f),
                        new DevDunyaGezegen("Gliese 1132 b", -10, null, 40, 0, 137, true,  5, 1.66f),
                        new DevDunyaGezegen("CD Ceti b", -10, null, 28, 0, 191, true,  5, 3.95f),
                        new DevDunyaGezegen("Gliese 1061 b", -10, null, 12, 0, -273, false,  5, 1.37f),
                        new DevDunyaGezegen("HD 136352 b", -10, null, 48, 0, 638, false,  5, 4.72f),
                        new DevDunyaGezegen("HD 20794 b", -10, null, 20, 0, 88, false,  5, 2.70f),
                        new DevDunyaGezegen("Rho Coronae Borealis c", -10, null, 57, 0, 325, false, 5, 125)
                )
        );
    }

    public ArrayList<Gezegen> gezegenleri_getir(){
        return gezegenler;
    }

    public ArrayList<Gezegen> gezegenleri_getir(int uzaklik){
        ArrayList<Gezegen> newlist = new ArrayList<>();
        for (Gezegen gezegen : gezegenler){
            if (gezegen.getUzaklik() <= uzaklik)
                newlist.add(gezegen);
        }
        return newlist;
    }

    public void gezegen_ekle(Gezegen gezegen){
        gezegenler.add(gezegen);
    }
}

