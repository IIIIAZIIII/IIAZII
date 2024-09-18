import static java.lang.Math.pow;
import static java.lang.Math.scalb;

public class rad {
    public static void main(String[] args) {
        System.out.println(rada());
    }

    public static double rada() {
        int n = 2;
        double s = 0;
        while ((1. / (n * n + n - 2.)) >= pow(10, -6)) {
            s += (1. / (n * n + n - 2.));
            n++;
        }
        return s;
    }
}
