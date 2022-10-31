import java.lang.Math;

public class Dortgen {
    Nokta[] corners = new Nokta[4];

    Dortgen(Nokta a, Nokta b, Nokta c, Nokta d) {
        corners[0] = a;
        corners[1] = b;
        corners[2] = c;
        corners[3] = d;
    }

    public double Alan() {
        double ab = Math
                .sqrt(Math.abs(
                        Math.pow(corners[0].X() - corners[1].X(), 2) - Math.pow((corners[0].Y() - corners[1].Y()), 2)));

        double ad = Math
                .sqrt(Math.abs(
                        Math.pow(corners[0].X() - corners[3].X(), 2) - Math.pow((corners[0].Y() - corners[3].Y()), 2)));

        return ad * ab;
    }

}
