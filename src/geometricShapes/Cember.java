package geometricShapes;

public class Cember extends Sekil{

    public Cember(double yariCap) {
        super(yariCap);
    }

    @Override
    public String toString() {
        return "Yarıçap = " + yariCap +
                " Alan = " + alanHesaplama(yariCap) +
                " Çevre = " + cevreHesaplama(yariCap)
                ;
    }
}
