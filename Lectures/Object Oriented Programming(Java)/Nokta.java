public class Nokta {
    int[] coordinates = new int[2];

    Nokta(int x, int y) {
        coordinates[0] = x;
        coordinates[1] = y;
    }

    public int X() {
        return coordinates[0];
    }

    public int Y() {
        return coordinates[1];
    }

}
