public class Balance {
    private int Right;
    private int Left;

    public Balance() {
        Right = 0;
        Left = 0;
    }

    public void addRight(int num) {
        Right += num;
    }

    public void addLeft(int num) {
        Left += num;
    }

    public void result() {
        if (Left == Right) {
            System.out.println("=");
        } else if (Left > Right) {
            System.out.println("L");
        } else {
            System.out.println("R");
        }

    }
}

