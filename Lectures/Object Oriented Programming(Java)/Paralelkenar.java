public class Paralelkenar extends Dortgen {
    Paralelkenar(Nokta a, Nokta b, Nokta c, Nokta d) {
        super(a, b, c, d);
    }

    public double Alan() {
        // kenar* o kenarın yüksekliği
        // açı 30 kabul edilerek hesaplanacktır.
        // açı 30 iken yükseklik hipotenüsün yarısıdır.
        double ab = Math
                .sqrt(Math.abs(
                        Math.pow(corners[0].X() - corners[1].X(), 2) - Math.pow((corners[0].Y() - corners[1].Y()), 2)));
        double ad = Math
                .sqrt(Math.abs(
                        Math.pow(corners[0].X() - corners[3].X(), 2) - Math.pow((corners[0].Y() - corners[3].Y()), 2)));
        double h = ad / 2;
        return ab * h;
    }
}