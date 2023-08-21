package atm_project_OOP;

import java.util.Scanner;

public class Menu extends Methodlar {
    Scanner scanner = new Scanner(System.in);

    void giris() {
        System.out.println("Yeni kullanıcı oluşturmak için '1'" +
                "\nSisteme giriş için '2'ye basınız.");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                yeniKullaniciOlustur();
                giris();
            case 2:
                if (kullaniciGirisi())
                    menu();
                else {
                    System.out.println("Hatalı giriş yaptınız...");
                    giris();
                }
            default:
                System.out.println("Hatalı giriş yaptınız...");
                giris();
        }
    }

    private void menu() {
        System.out.println("Yapmak istediğiniz işlemi seçiniz:" +
                "\n1). Bakiye sorgulama" +
                "\n2). Para yatırma" +
                "\n3). Para çekme" +
                "\n4). Para gönderme" +
                "\n5). Şifre değiştirme" +
                "\n6). Çıkış" +
                "\nSEÇİMİNİZ: ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1:
                bakiyeSorgula();
                menu();
            case 2:
                paraYatirma();
                menu();
            case 3:
                paraCekme();
                menu();
            case 4:
                paraGonderme();
                menu();
            case 5:
                sifreDegistirme();
                menu();
            case 6:
                System.out.println("Sistemden çıkılıyor...");
                System.exit(0);
            default: {
                System.out.println("Hatalı giriş yaptınız...");
                menu();
            }
        }
    }

}
