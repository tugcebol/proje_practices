package geometricShapes;

public class Dikdortgen extends Sekil{

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Uzun Kenar = " + uzunKenar +
                " Kısa Kenar = " + kisaKenar +
                " Alan = " + alanHesaplama(uzunKenar,kisaKenar) +
                " Çevre = " + cevreHesaplama(uzunKenar,kisaKenar)
                ;
    }
}
