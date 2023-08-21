package geometricShapes;

public class Kare extends Dikdortgen{

    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Kenar Uzunluğu = " + uzunKenar +
                " Alan = " + alanHesaplama(uzunKenar,kisaKenar) +
                " Çevre = " + cevreHesaplama(uzunKenar,kisaKenar)
                ;
    }
}
