package atm_project_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Methodlar {

    /*  ATM

        Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.

        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali.  */

    Scanner scanner = new Scanner(System.in);
    static ArrayList<Kullanici> kullaniciListi = new ArrayList<>();
    String kartNo;
    int sayac = 0;

    boolean kullaniciGirisi() {
        // Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        // Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        // Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        boolean giris = false;
        System.out.print("Kart no giriniz: ");
        kartNo = scanner.nextLine();
        System.out.print("Şifre giriniz: ");
        int sifre = scanner.nextInt();
        for (Kullanici each : kullaniciListi) {
            if (each.getKartNo().equals(kartNo) && each.getSifre() == sifre) {
                giris = true;
            }
        }
        scanner.nextLine();
        return giris;
    }

    void yeniKullaniciOlustur() {
        System.out.print("Kart no giriniz: ");
        String kartNo = scanner.nextLine().replace(" ", "");
        System.out.print("Şifre giriniz: ");
        int sifre = scanner.nextInt();
        System.out.print("Bakiye giriniz: ");
        double bakiye = scanner.nextDouble();
        scanner.nextLine();
        Kullanici kullanici = new Kullanici(kartNo, sifre, bakiye);
        kullaniciListi.add(kullanici);
    }

    void bakiyeSorgula() {
        for (Kullanici each : kullaniciListi) {
            if (each.getKartNo().equals(kartNo)) {
                System.out.println(kartNo + " nolu karta ait bakiye: " + each.getBakiye());
            }
        }
    }

    void paraYatirma() {
        for (Kullanici each : kullaniciListi) {
            if (each.getKartNo().equals(kartNo)) {
                System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                double miktar = scanner.nextDouble();
                each.setBakiye(miktar + each.getBakiye());
                bakiyeSorgula();
            }
        }
    }

    void paraCekme() {
        for (Kullanici each : kullaniciListi) {
            if (each.getKartNo().equals(kartNo)) {
                // Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez
                System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                double miktar = scanner.nextDouble();
                if (miktar <= each.getBakiye()) {
                    each.setBakiye(each.getBakiye() - miktar);
                    bakiyeSorgula();
                } else {
                    System.out.println("Yetersiz bakiye...");
                    paraCekme();
                }
            }
        }
    }

    void paraGonderme() {
        // Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez
        // Para gönderme işleminde istenen iban TR ile baslamali ve
        // toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        for (Kullanici each : kullaniciListi) {
            if (each.getKartNo().equals(kartNo)) {
                scanner.nextLine();
                System.out.print("Para gönderilecek IBAN'ı giriniz: ");
                String iban = scanner.nextLine().replace(" ", "").toLowerCase();
                if (iban.startsWith("TR") && iban.length() == 26) {
                    System.out.print("Göndermek istediğiniz miktarı girin: ");
                    double miktar = scanner.nextDouble();
                    if (miktar <= each.getBakiye()) {
                        each.setBakiye(each.getBakiye() - miktar);
                        bakiyeSorgula();
                    } else {
                        System.out.println("Yetersiz bakiye...");
                        paraGonderme();
                    }
                } else {
                    System.out.println("Hatalı IBAN girdiniz...");
                    paraGonderme();
                }
            }
        }
    }

    void sifreDegistirme() {
        //Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
        do {
            sayac++;//1-2-3
            System.out.print("MEVCUT ŞİFRENİZİ GİRİNİZ: ");
            int sifre = scanner.nextInt();
            boolean flag = true;
            for (Kullanici each : kullaniciListi) {
                if (each.getKartNo().equals(kartNo)) {
                    if (each.getSifre() == sifre) {
                        System.out.print("YENİ ŞİFRENİZİ GİRİNİZ: ");
                        sifre = scanner.nextInt();
                        each.setSifre(sifre);
                        flag = false;
                    }
                }
            }
            if (flag) {
                System.out.println("HATALI GİRİŞ YAPTINIZ....");
            } else {
                Menu menu = new Menu();
                menu.giris();
            }

        } while (sayac != 3);
        System.out.println("SİSTEMDEN ÇIKILIYOR");
        System.exit(0);

    }
}

