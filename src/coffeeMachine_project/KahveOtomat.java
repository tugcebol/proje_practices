package coffeeMachine_project;

import java.util.Scanner;

public class KahveOtomat {
      /* 1. Şart
       3 çeşit kahvemiz olsun.
       Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

       Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Örn:
       Hangi Kahveyi İstersiniz?
       1.Türk kahvesi
       2.Filtre Kahve
       3.Americano */

    static String kahveCesidi = "", sut = "", seker = "", fincanBoyutu = "";
    static int sekerMiktari;
    static Scanner scanner = new Scanner(System.in);
    static void menu(){
        System.out.println("***** KAHVECİYE HOŞGELDİNİZ *****");
        do {
            System.out.print("        **** MENU ****" +
                    "\nTürk Kahvesi" +
                    "\nFiltre Kahve" +
                    "\nAmericano" +
                    "\nSEÇİM:");
            kahveCesidi = scanner.nextLine();
            if (!kahveCesidi.equalsIgnoreCase("türk kahvesi")&&
                    !kahveCesidi.equalsIgnoreCase("filtre kahve")&&
                    !kahveCesidi.equalsIgnoreCase("americano"))
                System.out.println("BU ÜRÜN MENÜDE YOK...");
        } while (!kahveCesidi.equalsIgnoreCase("türk kahvesi")&&
                !kahveCesidi.equalsIgnoreCase("filtre kahve")&&
                !kahveCesidi.equalsIgnoreCase("americano"));
    }
    // 2.Şart
    // Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?
    // diye sorsun
    // (Evet veya Hayır olarak cevaplayınız)
    static void sutEkleme(){
        System.out.print("Süt eklemek ister misiniz?\nEvet ya da Hayır olarak cevaplayınız: ");
        sut = scanner.next();
        if (sut.equalsIgnoreCase("evet")) System.out.println("Süt ekleniyor...");
        else System.out.println("Süt eklenmiyor...");
    }
    // 3. Şart
    // Süt tercihi yapıldıktan sonra sistem kullanıcıya
    // "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
    // sorusunu sorsun.
    static void sekerEkleme(){
        System.out.print("Şeker ister misiniz?\nEvet ya da Hayır olarak cevaplayınız:  ");
        seker = scanner.next();
        if (seker.equalsIgnoreCase("evet")) {
            System.out.print("Kaç şeker istersiniz? ");
            sekerMiktari = scanner.nextInt();
            System.out.println(sekerMiktari + " adet şeker ekleniyor...");
        }
        else System.out.println("Şeker eklenmiyor...");
    }
    // 4. Şart
    // Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
    // sorusunu sorsun.
    static void boyutSorgula(){
        do {
            System.out.println("Kahve bardağınız hangi boyutta olsun?\nbüyük boy - orta boy - küçük boy olarak giriniz: ");
            scanner.nextLine();
            fincanBoyutu = scanner.nextLine();
            if (!fincanBoyutu.equalsIgnoreCase("büyük boy") &&
                    !fincanBoyutu.equalsIgnoreCase("küçük boy") &&
                    !fincanBoyutu.equalsIgnoreCase("orta boy"))
                System.out.println("Hatalı giriş yaptınız...");

        }while (!fincanBoyutu.equalsIgnoreCase("büyük boy") &&
                !fincanBoyutu.equalsIgnoreCase("küçük boy") &&
                !fincanBoyutu.equalsIgnoreCase("orta boy"));
    }
    // Sonuç
    // Siparişlerimizi verdik. Son hali görmek istiyoruz.
    // konsola şunu yazdırın örnek :
    // Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
    static void sonuc(){
        if (sut.equalsIgnoreCase("evet")) sut = "Sütlü";
        else sut = "Sütsüz";
        if (seker.equalsIgnoreCase("evet")) seker = sekerMiktari + " şekerli";
        else seker = "şekersiz";
        kahveCesidi = kahveCesidi.substring(0,1).toUpperCase() + kahveCesidi.substring(1);
        System.out.println(sut + " " + seker + " " + fincanBoyutu + " " + kahveCesidi + " HAZIR.... \n\t\t\tAFİYET OLSUN!");
    }
    public static void main(String[] args) {
        menu();
        sutEkleme();
        sekerEkleme();
        boyutSorgula();
        sonuc();
    }
}
