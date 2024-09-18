public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(i+":" +jojo(i));
        }
    }

    public static String jojo(int gojo) {
        if (gojo % 35 == 0) {
            return "fizzbuzz";
        } else if (gojo % 7 == 0) {
            return "buzz";
        } else if (gojo % 5 == 0) {
            return "fizz";
        } else {
            return "";
        }
    }
}            