package atm_project;

import java.util.Scanner;

public class JavaBank {

    /*                                        -  ATM -

        Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


        Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve
        cikis islemleri olacaktır.


        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        eger değilse menü ekranina geri donsun.

        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali  */

    static String kartNo = "12345";
    static String sifre = "sifre";
    static Scanner scanner = new Scanner(System.in);
    static double bakiye = 50000;

    public static void main(String[] args) {

        giris();
    }

    private static void giris() {

        /* Kullanicidan giriş için kart numarasi ve şifresini isteyin,
           eger herhangi birini yanlis girerse tekrar isteyin.
           Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
           Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin */

        System.out.print("KART NUMARASI GİRİNİZ: ");
        String kKArtNo = scanner.nextLine().replace(" ", "");
        System.out.print("ŞİFRENİZİ GİRİNİZ" +
                "\nŞİFRENİZİ DOĞRU GİRMEK İÇİN 3 HAKKINIZ VAR: ");
        String kSifre = scanner.nextLine();

        if (kKArtNo.equals(kartNo) && kSifre.equals(sifre)) {
            menu();
        } else {
            sifreKontrolu(kSifre);
        }
        // Kullanıcı 3 defadan fazla hatalı giriş yaparsa, sistemden çıkış yapılsın
    }

    private static void sifreKontrolu(String kSifre) {

        int sayac = 1;
        while (sayac != 3) {
            System.out.println("HATALI GİRİŞ YAPTINIZ..." +
                    "\n" + (3 - sayac) + " HAKKINIZ KALDI!");
            sayac++;
            System.out.print("ŞİFRENİZİ GİRİNİZ: ");
            kSifre = scanner.nextLine();
            if (kSifre.equals(sifre)) {
                menu();
            } else {
                continue;
            }
        }
        if (sayac == 3) {
            System.out.println("3 HATALI GİRİŞ DENEMESİ SONUCUNDA KARTINIZ BLOKE OLMUŞTUR!" +
                    "\nLÜTFEN BANKAMIZLA İLETİŞİME GEÇİN...");
            System.exit(0);
        }
    }

    private static void menu() {
        // Menu listesinde Bakiye sorgula, para yatirma, para çekme,
        // para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

        System.out.print("*****JAVA BANK*****\n" +
                "1. BAKİYE SORGULAMA\n" +
                "2. PARA YATIRMA\n" +
                "3. PARA ÇEKME\n" +
                "4. PARA GÖNDERME\n" +
                "5. ŞİFRE DEĞİŞTİRME\n" +
                "6. ÇIKIŞ\n" +
                "SEÇİM: ");

        int secim = scanner.nextInt();

        switch (secim) {
            case 1: {
                bakiyeSorgula();
            }
            case 2: {
                System.out.print("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scanner.nextDouble();
                paraYatirma(miktar);
            }
            case 3: {
                System.out.print("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ: ");
                double miktar = scanner.nextDouble();
                paraCekme(miktar);
            }
            case 4: {
                paraGonderme();
            }
            case 5: {
                sifreDegistirme();
            }
            case 6: {
                System.out.println("BİZİ SEÇTİĞİNİZ İÇİN TEŞEKKÜR EDERİZ...");
                System.exit(0);
            }
            default: {
                System.out.println("YANLIŞ GİRİŞ YAPTINIZ...");
                menu();
            }
        }
    }

    private static void sifreDegistirme() {

        // Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali

        scanner.nextLine(); // dummy
        System.out.print("MEVCUT ŞİFREYİ GİRİNİZ" +
                "\nŞİFRENİZİ DOĞRU GİRMEK İÇİN 3 HAKKINIZ VAR:");
        String ksifre = scanner.nextLine();

        if (ksifre.equals(sifre)) {
            System.out.print("YENİ ŞİFRE GİRİNİZ: ");
            sifre = scanner.nextLine();
            giris();
        } else {
            sifreKontrolu2(ksifre);
        }
    }

    private static void sifreKontrolu2(String ksifre) {

        int sayac = 1;
        while (sayac != 3) {
            System.out.println("HATALI GİRİŞ YAPTINIZ..." +
                    "\n" + (3 - sayac) + " HAKKINIZ KALDI!");
            sayac++;
            System.out.print("ŞİFRENİZİ GİRİNİZ: ");
            String kSifre = scanner.nextLine();
            if (kSifre.equals(sifre)) {
                System.out.print("YENİ ŞİFRE GİRİNİZ: ");
                sifre = scanner.nextLine();
                System.out.println("ŞİFRENİZ BAŞARIYLA KAYDEDİLDİ...");
                giris();
            } else {
                continue;
            }
        }
        if (sayac == 3) {
            System.out.println("3 HATALI GİRİŞ DENEMESİ SONUCUNDA KARTINIZ BLOKE OLMUŞTUR!" +
                    "\nLÜTFEN BANKAMIZLA İLETİŞİME GEÇİN...");
            System.exit(0);
        }
    }

    // Kullanıcıya 3 hak verelim, doğru şifre giremezse sistemden çıkış yapılsın

    private static void paraGonderme() {

        // Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez
        // Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        // eger değilse menü ekranina geri donsun.

        scanner.nextLine(); // dummy
        System.out.print("PARA GÖNDERİLECEK IBANI GİRİNİZ: ");
        String iban = scanner.nextLine().toUpperCase().replace(" ", "");
        if (iban.startsWith("TR") && iban.length() == 26) {
            System.out.print("GÖNDERİLECEK MİKTARI GİRİNİZ: ");
            double miktar = scanner.nextDouble();
            if (miktar <= bakiye) {
                bakiye -= miktar;
                bakiyeSorgula();
            } else {
                System.out.println("BAKİYENİZ YETERSİZ...");
                menu();
            }
        } else {
            System.out.println("HATALI IBAN GİRDİNİZ...");
            menu();
        }
    }

    private static void paraCekme(double miktar) {

        // Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez
        if (miktar <= bakiye) {
            bakiye -= miktar;
            bakiyeSorgula();
        } else {
            System.out.print("BAKİYEDEN BÜYÜK MİKTAR GİREMEZSİNİZ...\n" +
                    "MİKTAR GİRİNİZ: ");
            double yeniMiktar = scanner.nextDouble();
            paraCekme(yeniMiktar);
        }

    }

    private static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("BAKİYE: " + bakiye + " $");
        menu();
    }
}

