package geometricShapes;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static void menu(){
        System.out.println("Seçmek istediğiniz şekli girin: " +
                "\n1- Çember" +
                "\n2- Dikdörtgen" +
                "\n3- Kare" +
                "\n4- Çıkış" +
                "\nSEÇİMİNİZ: ");
        int secim = scanner.nextInt();
        switch (secim){
            case 1:{
                cemberOlustur();
            }
            case 2:{
                dikdortgenOlustur();
            }
            case 3:
                kareOlustur();
            case 4:
                System.exit(0);
            default:{
                System.out.println("Yanlış değer girdiniz...");
                menu();
            }

        }
    }

    private static void kareOlustur() {
        System.out.print("Kenar uzunluğunu giriniz: ");
        double kareKenar = scanner.nextDouble();
        Kare kare = new Kare(kareKenar,kareKenar);
        System.out.println(kare);
        menu();
    }

    private static void dikdortgenOlustur() {
        System.out.print("Lütfen uzun kenarı girin: ");
        double uzunKenar = scanner.nextDouble();
        System.out.print("Lütfen kısa kenarı girin: ");
        double kisaKenar = scanner.nextDouble();
        Dikdortgen dikdortgen = new Dikdortgen(uzunKenar,kisaKenar);
        System.out.println(dikdortgen);
        menu();
    }

    private static void cemberOlustur() {
        System.out.print("Yarıçap girin: ");
        double yaricap = scanner.nextDouble();
        Cember cember = new Cember(yaricap);
        System.out.println(cember);
        menu();
    }
}
