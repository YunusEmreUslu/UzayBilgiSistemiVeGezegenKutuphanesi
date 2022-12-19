package com.turgay;
import java.util.ArrayList;
import java.util.Scanner;

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
                    System.out.println("Gezegen ekle kısmı");
                    Gezegen yeniGezegen = new Gezegen();

                    /*
                        YUNUS
                        Bu kısımda kullanıcıdan gezegen bilgilerini tek tek isteyeceğiz
                        Gezegenin adı, uzaklığı vb. her şeyi alıp
                        yeni bir gezegen oluşturacağız, sonrasında onu veritabanına alttaki kod ekliyor zaten
                    */

                    vt.gezegen_ekle(yeniGezegen);
                    System.out.println("Gezegen eklendi");
                    break;

                case 3:
                    System.out.println("Rastgele gezegen oluştur kısmı");
                    Gezegen rastgeleGezegen = new Gezegen();

                    /*
                        YUNUS
                        Bu kısım da az öncekiyle benzer bir kısım,
                        o yüzden ikisini de senin yapman daha mantıklı olur abi
                        Bu sefer gezegen özellikleri kullanıcıdan alınarak değil de
                        rastgele olarak oluşsun.
                        Mesela uzaklık (0-300 ışık yılı arasında random bir değer)
                        Sıcaklık (-100 + 100 arasında bir değer vb.)
                        mantıklı bir biçimde random gezegen oluştursun burası
                    */

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
