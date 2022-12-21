package com.turgay;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Veritabanı bağlantısı
        Veritabani vt = new Veritabani();

        // Gezegenleri çekme
        ArrayList<Gezegen> gezegenler = vt.gezegenleri_getir();

        // Referans canlı
        Hayvan insan = new Hayvan();

        // Referans gezegen
        KarasalGezegen dunya = new KarasalGezegen("Dünya",-10,new Gazlar(0.005f, 0.005f, 0.21f, 0.78f),0,0,30,true,5,1);

        // Gezegen sistemi
        // GezegenSistemi gezegenSistemi = new GezegenSistemi(dunya, insan, gezegenler);


        KomutArayuzu.hosgeldin();
        KomutArayuzu.tanitim();
        KomutArayuzu.baslangic();

        while(true){

            System.out.print("Yeni komut giriniz: ");

            switch (scanner.nextInt()){
                case 1:
                    System.out.println("200 ışık yılı uzaklıktaki gezegenlere kadar gezegen sorgusu yapabilirsiniz.");
                    int uzaklik = scanner.nextInt();

                    ArrayList<Gezegen> sorgu = vt.gezegenleri_getir(uzaklik);
                    System.out.println(uzaklik + " ışık yılı uzaklıkta " + sorgu.size() + " gezegen bulunmaktadır.");

                    for(Gezegen gezegen : sorgu){
                        /*
                        *  SUEDA
                         Burada uzaklığa göre gezegenleri listeliyoruz, çalışmasında bir problem yok
                         Ama daha görsel olarak sunalım bunları.
                         https://www.autodraw.com/share/1MT0VIMIPQ9W Buraya çizdim.
                         Gezegenin yüzölçümüne göre bir yuvarlak çizsin, altına
                         gezegen ismi, büyüklüğü vb. tüm verilerini yazsın.
                         bu olay gezegenDetay fonksiyonunda gerçekleşsin.
                        * */
                        gezegen.gezegenDetay();
                    }
                    break;

                case 2:
                    //yeniGezegen.setisim(yeni isim) print yeniGezegen.toString
                    System.out.println("Gezegen ekle kısmı");
                    Gezegen yeniGezegen = new Gezegen();
                    Scanner input = new Scanner(System.in);

                    System.out.println("Yeni gezegenin ismini giriniz:");
                    String yeniIsim= input.nextLine();
                    yeniGezegen.setIsim(yeniIsim);
                    System.out.println("Yeni gezegenin ismi: " + yeniIsim);

                    System.out.println("Yeni gezegenin yer çekimi değerini m/s^2 cinsinden giriniz:");
                    float yeniYerCekimi= input.nextFloat();
                    yeniGezegen.setYerCekimi(yeniYerCekimi);
                    System.out.println("Yeni gezegenin yer çekimi değeri: " + yeniYerCekimi);

                    System.out.println("Yeni gezegenin uzaklık değerini giriniz:");
                    float yeniUzaklik = input.nextFloat();
                    yeniGezegen.setUzaklik(yeniUzaklik);
                    System.out.println("Yeni gezegenin uzaklık değeri: " + yeniUzaklik);

                    System.out.println("Yeni gezegene gönderilen uydu sayısını giriniz:");
                    int yeniGonderilenUyduSayisi = input.nextInt();
                    yeniGezegen.setGonderilenUyduSayisi(yeniGonderilenUyduSayisi);
                    System.out.println("Yeni gezegene gönderilmiş olan uydu sayısı: " + yeniGonderilenUyduSayisi);

                    System.out.println("Yeni gezegenin sıcaklık değerini giriniz:");
                    float yeniSicaklik = input.nextFloat();
                    yeniGezegen.setSicaklik(yeniSicaklik);
                    System.out.println("Yeni gezegenin sıcaklık değeri: " + yeniSicaklik);

                    System.out.println("Yeni gezegenin atmosferi var mı?: (var veya yok yazınız)");
                    String yeniAtmosferVarMi = input.next();
                        if (yeniAtmosferVarMi.equalsIgnoreCase("var")) {
                        yeniGezegen.setAtmosferVarMi(true);
                        } else if (yeniAtmosferVarMi.equalsIgnoreCase("yok")) {
                        yeniGezegen.setAtmosferVarMi(false);
                        }
                    System.out.println("Yeni gezegenin atmosferi " +yeniAtmosferVarMi+ ".");

                    System.out.println("Yeni gezegenin radyasyon oranını (0-100) giriniz:");
                    float yeniRadyasyonOrani = input.nextFloat();
                    // değerler 0 ve 100 arasında değil ise invalid diyip tekrar sor
                    yeniGezegen.setRadyasyonOrani(yeniRadyasyonOrani);
                    System.out.println("Yeni gezegenin radyasyon oranı: " + yeniRadyasyonOrani);

                    System.out.println("Yeni gezegenin yüz ölçümü değerini giriniz:");
                    float yeniYuzOlcumu = input.nextFloat();
                    yeniGezegen.setYuzolcumu(yeniYuzOlcumu);
                    System.out.println("Yeni gezegenin yüz ölçümü değeri: " + yeniYuzOlcumu);

                    // buraya gezegende hangi gazlar bulunuyor onu alicak bir sey yap



                    /*
                        YUNUS
                        Bu kısımda kullanıcıdan gezegen bilgilerini tek tek isteyeceğiz
                        Gezegenin adı, uzaklığı vb. her şeyi alıp
                        yeni bir gezegen oluşturacağız, sonrasında onu veritabanına alttaki kod ekliyor zaten
                    */
                    System.out.println(yeniGezegen.toString());
                    vt.gezegen_ekle(yeniGezegen);
                    System.out.println("Gezegen eklendi");
                    break;
                // random gezegen olusturma case'i
                case 3:
                    System.out.println("Rastgele gezegen oluştur kısmı");
                    Gezegen rastgeleGezegen = new Gezegen();
                    Random random = new Random();
                    float f = random.nextFloat();
                    int i = random.nextInt(10) + 1;
                    boolean b = random.nextBoolean();

                    Scanner inputR = new Scanner(System.in);
                    System.out.println("Yeni random gezegenin ismini giriniz:");
                    String yeniRandomIsim= inputR.nextLine();
                    rastgeleGezegen.setIsim(yeniRandomIsim);
                    System.out.println("Yeni random gezegenin ismi: " + yeniRandomIsim);

                    float rastgeleYerCekimi = f*100;
                    rastgeleGezegen.setYerCekimi(rastgeleYerCekimi);
                    System.out.println("Yeni random gezegenin ismi: " + rastgeleYerCekimi);

                    float rastgeleUzaklik = f*200;
                    rastgeleGezegen.setUzaklik(rastgeleUzaklik);
                    System.out.println("Yeni random gezegenin uzaklık değeri: " + rastgeleUzaklik);

                    int rastgeleGonderilenUyduSayisi = i;
                    rastgeleGezegen.setGonderilenUyduSayisi(rastgeleGonderilenUyduSayisi);
                    System.out.println("Yeni random  gezegene gönderilmiş olan uydu sayısı: " + rastgeleGonderilenUyduSayisi);

                    float rastgeleSicaklik = f*1500;
                    rastgeleGezegen.setSicaklik(rastgeleSicaklik);
                    System.out.println("Yeni random gezegenin sıcaklık değeri: " + rastgeleSicaklik);

                    boolean rastgeleAtmosferVarMi = b;
                    if (b == true) {
                        System.out.println("Yeni gezegenin atmosferi var.");
                    } else {
                        System.out.println("Yeni gezegenin atmosferi yok.");
                    }
                    rastgeleGezegen.setAtmosferVarMi(rastgeleAtmosferVarMi);

                    float rastgeleRadyasyonOrani = f*100;
                    rastgeleGezegen.setRadyasyonOrani(rastgeleRadyasyonOrani);
                    System.out.println("Yeni random gezegenin radyasyon oranı: " + rastgeleRadyasyonOrani);

                    float rastgeleYuzOlcumu = f*2500;
                    rastgeleGezegen.setYuzolcumu(rastgeleYuzOlcumu);
                    System.out.println("Yeni random gezegenin yüz ölçümü değeri: " + rastgeleYuzOlcumu);

                    //rastgele gazlar icin bir sey

                    /*
                        YUNUS
                        Bu kısım da az öncekiyle benzer bir kısım,
                        o yüzden ikisini de senin yapman daha mantıklı olur abi
                        Bu sefer gezegen özellikleri kullanıcıdan alınarak değil de
                        rastgele olarak oluşsun.
                        Mesela uzaklık (0-200 ışık yılı arasında random bir değer)
                        Sıcaklık (-100 + 100 arasında bir değer vb.)
                        mantıklı bir biçimde random gezegen oluştursun burası
                    */
                    System.out.println(rastgeleGezegen.toString());
                    vt.gezegen_ekle(rastgeleGezegen);
                    System.out.println("Gezegen eklendi");
                    break;

                case 4:
                    System.out.println("Gezegen güncelle kısmı");
                    /*
                        SUEDA
                        Bu kısımda kullanıcıya gezegen listesini sunup,
                        güncelleyeceğiniz gezegeni seçin diyeceğiz.

                        Örneğin
                        Lütfen düzenleyeceğiniz gezegeni seçin.
                        0 - Üranüs
                        1 - Merkür
                        2 - Satürn

                        Seçim: 1
                        Merkür gezegeni düzenleniyor.

                        Düzenlemek istediğiniz özelliği seçin:
                        1 - İsim
                        2 - Yerçekimi
                        3 - Sıcaklık
                        .......
                       Seçim: 3

                       SIcaklık verisi düzenleniyor
                       Yeni Değer girin: 50

                       Merkür gezegeninin sıcaklığı 50 olarak düzenlenmiştir.

                    */
                    break;

                case 5:
                    System.out.println("Gezegendeki yaşam olasılığı hesapla");
                    /*
                        TURGAY
                        gezegendeki yaşam olasılığı hesaplama, uydu gönderme işleri bende.
                    */
                    break;

                case 6:
                    System.out.println("Gezegenleri kıyasla");
                    /*
                        TURGAY
                        gezegendeki kıyaslama işi de bende.
                    */
                    break;
            }

        }

    }
}
