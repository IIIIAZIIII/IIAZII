public class reva {
    public static void main(String[] args) {
        System.out.println(reva("make install"));
    }

    public static String reva(String str) {
        String t = "";
        for (int i = 0; i < str.length(); i++) {
            t+=str.charAt(str.length() - i - 1);

        }
        return t;
    }
}
