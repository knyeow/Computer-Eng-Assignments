public class Yamuk extends Dortgen {
    Yamuk(Nokta a, Nokta b, Nokta c, Nokta d) {
        super(a, b, c, d);
    }

    public double Alan() {
        // yamuğun alanı (alt kenar*üst kenar) / 2 * yüksekliktir
        // adc açısı 30 kabul edilecektir bu durmda yükseklik ad kenarının yarısı olacak
        double ab = Math
                .sqrt(Math.abs(
                        Math.pow(corners[0].X() - corners[1].X(), 2) - Math.pow((corners[0].Y() - corners[1].Y()), 2)));
        double ad = Math
                .sqrt(Math.abs(
                        Math.pow(corners[0].X() - corners[3].X(), 2) - Math.pow((corners[0].Y() - corners[3].Y()), 2)));
        double dc = Math
                .sqrt(Math.abs(
                        Math.pow(corners[2].X() - corners[3].X(), 2) - Math.pow((corners[2].Y() - corners[3].Y()), 2)));
        double h = ad / 2;
        return (ab * dc) / 2 * h;

    }
}
