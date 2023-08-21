package geometricShapes;

public class Sekil {

    double yariCap;
    double uzunKenar;
    double kisaKenar;

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double yariCap) {
        this.yariCap = yariCap;
    }
    double cevreHesaplama(double yariCap){
        return 2 * 3.14 * yariCap;
    }
    double alanHesaplama(double yariCap){
        return 3.14 * yariCap * yariCap;
    }
    double cevreHesaplama(double uzunKenar, double kisaKenar){
        return (uzunKenar + kisaKenar) * 2;
    }
    double alanHesaplama(double uzunKenar, double kisaKenar){
        return uzunKenar*kisaKenar;
    }
}
