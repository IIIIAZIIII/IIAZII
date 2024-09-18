import static java.lang.Math.sqrt;

public class dis {
    public static void main(String[] args) {
        System.out.println(DIS(1, 1, 0));
    }

    public static String DIS(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "jopa";
        } else if (a == 0) {
            return "x0=" + (-c / b);
        }
        double d = b * b - 4 * a * c;
        if (d > 0) {
            return "x1=" + ((-b + sqrt(d)) / (2 * a)) + " x2=" + ((-b - sqrt(d)) / (2 * a));
        } else if (d == 0) {
            return "x0=" + (-b / (2 * a));
        } else {
            return "NONONO";
        }
    }
}
