package atm_project_OOP;

public class Runner extends Methodlar{

    public static void main(String[] args) {

        Kullanici kullanici1 = new Kullanici("1234", 1234,50000);
        kullaniciListi.add(kullanici1);
        Kullanici kullanici2 = new Kullanici("4567", 1234,0);
        kullaniciListi.add(kullanici2);
        Kullanici kullanici3 = new Kullanici("8910", 1234,3000);
        kullaniciListi.add(kullanici3);
        Kullanici kullanici4 = new Kullanici("5678", 1234,1500000);
        kullaniciListi.add(kullanici4);
        Kullanici kullanici5 = new Kullanici("8912", 1234,500);
        kullaniciListi.add(kullanici5);
        Menu menu = new Menu();
        menu.giris();
    }
}
