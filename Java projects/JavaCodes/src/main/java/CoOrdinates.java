import java.util.Arrays;     //Comparable

public class CoOrdinates implements Comparable<CoOrdinates> {
    int x;
    int y;

    public CoOrdinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "CoOrdinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(CoOrdinates o) {
        if (this.x != o.x) {
            return Integer.compare(this.x, o.x);
        } else {
            return Integer.compare(this.y, o.y);
        }
    }

    public static void main(String[] args) {
        CoOrdinates[] points = new CoOrdinates[4];
        points[0] = new CoOrdinates(3, 4);
        points[1] = new CoOrdinates(2, 3);
        points[2] = new CoOrdinates(3, 2);
        points[3] = new CoOrdinates(1, 5);

        Arrays.sort(points);

        for (CoOrdinates point : points) {
            System.out.println(point);
        }
    }
}
