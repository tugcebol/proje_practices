package market_project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaMarket {

    /*  Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
        alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince fiş yazdıran bir program
        hazırlayın
         ==================== WISE MARKET KASA PROGRAMI ===================================
         ilk programa girildiginde bizi bir menu karsilasin bu secenekler
         1 ŞARKÜTERİ ÜRÜNLERİ
         2 MANAV ÜRÜNLERİ
         3 MARKET ÜRÜNLERİ
         secime gore ,
         4-urunleri listele ve
         5-fiyatlari gelsin
         Variable'ları belirleyelim
         urunAdi, urunFiyatı, urunMiktari, urunKodu, sepet, toplam  */

    static Scanner scanner = new Scanner(System.in);

    static String urunAdi;
    static double urunFiyati;
    static double urunMiktari;
    static int urunKodu;
    static String sepet = "";
    static double toplam;
    static boolean ekUrun = false;


    public static void main(String[] args) {
        girisEkrani();

    }

    public static void girisEkrani() {

        System.out.println("=================    JAVA MARKET     =================");
        System.out.println("=================    Hoşgeldiniz     =================");
        System.out.println("-----------------       Menü         -----------------");
        System.out.println("   Lütfen Alışveriş Yapmak İstediğiniz Reyonu Seçiniz  ");
        System.out.println("1 - Şarküteri \n2 - Manav\n3 - Market\n4 - Fiş Yazdır\n5 - Çıkış");

        int secim = scanner.nextInt();

        if ((secim < 1 || secim > 5)) { //if(!(secim>=1 && secim<=5))
            System.out.println(" Uyarı: Geçersiz bir tuşa bastınız. Tekrar Giriniz ");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }
    }

    private static void sarkuteri() {
        System.out.println("Şarküteri Reyonuna Hoşgeldiniz");
        System.out.println("Lütfen almak istediğiniz ürün kodunu giriniz." +
                "\n61- Kaşar Peyniri - 130₺" +
                "\n62- Zeytin - 120₺" +
                "\n63- Sucuk - 200₺" +
                "\n64- Kıyma - 350₺");
        while (!ekUrun) {
            urunKodu = scanner.nextInt();
            if (urunKodu >= 61 && urunKodu <= 64) {
                System.out.println("Kaç kg alacaksınız? ");
                urunMiktari = scanner.nextDouble();
                switch (urunKodu) {
                    case 61:
                        urunAdi = "Kaşar Peyniri";
                        urunFiyati = 130;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 62:
                        urunAdi = "Zeytin";
                        urunFiyati = 120;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 63:
                        urunAdi = "Sucuk";
                        urunFiyati = 200;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 64:
                        urunAdi = "Kıyma";
                        urunFiyati = 350;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                }
                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: " + toplam + "₺");
                sepet += urunMiktari + " kg " + urunAdi + ": " + urunFiyati + "₺\n";
                System.out.println("Başka bir ürün eklemek isterseniz ürün kodunu girin." +
                        "\nAna menüye dönmek için '0' tuşuna basınız.");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void manav() {
        System.out.println("Manav Reyonuna Hoşgeldiniz");
        System.out.println("Lütfen almak istediğiniz ürün kodunu giriniz." +
                "\n71- Muz - 60₺" +
                "\n72- Patates - 25₺" +
                "\n73- Elma - 49₺" +
                "\n74- Soğan - 20₺" +
                "\n75- Domates - 39₺" +
                "\n76- Ananas - 59₺");
        while (!ekUrun) {
            urunKodu = scanner.nextInt();
            if (urunKodu >= 71 && urunKodu <= 76) {
                System.out.println("Kaç kg alacaksınız?");
                urunMiktari = scanner.nextDouble();
                switch (urunKodu) {
                    case 71:
                        urunAdi = "Muz";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 72:
                        urunAdi = "Patates";
                        urunFiyati = 25;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 73:
                        urunAdi = "Elma";
                        urunFiyati = 49;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 74:
                        urunAdi = "Soğan";
                        urunFiyati = 20;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 75:
                        urunAdi = "Domates";
                        urunFiyati = 39;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 76:
                        urunAdi = "Ananas";
                        urunFiyati = 59;
                        System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                }
                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: " + toplam + "₺");
                sepet += urunMiktari + " kg " + urunAdi + ": " + urunFiyati + "₺\n";
                System.out.println("Başka bir ürün eklemek isterseniz ürün kodunu girin." +
                        "\nAna menüye dönmek için '0' tuşuna basınız.");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void market() {
        System.out.println("Market Reyonuna Hoşgeldiniz");
        System.out.println("Lütfen almak istediğiniz ürün kodunu giriniz:" +
                "\n81- Nutella - 103₺" +
                "\n82- Ekmek - 8₺" +
                "\n83- Yumurta(24'lü) - 76₺" +
                "\n84 - Yoğurt(3kg) - 80₺");
        while (!ekUrun) {
            urunKodu = scanner.nextInt();
            if (urunKodu >= 81 && urunKodu <= 84) {
                System.out.print("Kaç paket alacaksınız? ");
                urunMiktari = scanner.nextDouble();
                switch (urunKodu) {
                    case 81:
                        urunAdi = "Nutella";
                        urunFiyati = 103;
                        System.out.println(urunMiktari + " paket " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 82:
                        urunAdi = "Ekmek";
                        urunFiyati = 8;
                        System.out.println(urunMiktari + " paket " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 83:
                        urunAdi = "Yumurta";
                        urunFiyati = 76;
                        System.out.println(urunMiktari + " paket " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 84:
                        urunAdi = "Yoğurt";
                        urunFiyati = 80;
                        System.out.println(urunMiktari + " paket " + urunAdi + " : " + (urunFiyati * urunMiktari) + " ₺");
                        break;
                }
                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: " + toplam + "₺");
                sepet += urunMiktari + " paket " + urunAdi + ": " + urunFiyati + "₺\n";
                System.out.println("Başka bir ürün eklemek isterseniz ürün kodunu girin." +
                        "\nAna menüye dönmek için '0' tuşuna basınız.");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void fisYazdir() {
        System.out.println("    ----------------Alışveriş Fişi----------------");
        System.out.println("================= T120 - WISE MARKET =================");
        System.out.println("=====    Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz     ======");
        System.out.println("");
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.print(dateTime.format(dtf));
        System.out.print(" - ");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dateTime.format(dtf2));
        System.out.println("");
        System.out.println("----------      Alışveriş Listeniz         -------------");
        System.out.println(" \n ");
        System.out.println(sepet);
        System.out.println("----------------------------");
        System.out.println("Toplam Tutar: " + toplam + "₺");
        System.out.println("----------------------------");
        odeme();
        cikis();
    }

    private static void odeme() {
        System.out.println("");
        System.out.println("Ödemeyi nasıl yapmak istersiniz?" +
                "\n1-Kredi Kartı" +
                "\n2-Nakit");
        int odemeYolu = scanner.nextInt();
        switch (odemeYolu) {
            case 1:
                System.out.println("Kart bilgileriniz işleniyor..." +
                        "\n" + toplam + "₺ kartınızdan çekiliyor..." +
                        "\nİşlem başarılı...\n");
                cikis();
            case 2:
                double nakitMiktar = 0;
                while (nakitMiktar < toplam) {
                    System.out.println("Ödemeyi alabiliriz...");
                    nakitMiktar = scanner.nextDouble();
                    if (nakitMiktar < toplam) {
                        System.out.println("Verilen miktar yeterli değil!");
                        continue;
                    } else {
                        System.out.println("İşlem başarılı..." +
                                "\nPara üstünüz: " + (nakitMiktar - toplam) + "₺\n");
                        cikis();
                    }
                }
        }
    }

    private static void cikis() {
        System.out.println("------------      İyi Günler Dileriz         --------------");
        System.out.println("\nÇıkış yapılıyor...");
        System.exit(0); // Çalışan java kodunu durdurur
    }

}
