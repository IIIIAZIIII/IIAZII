public class Table {
    private int rows;
    private int cols;
    private int[][] Tabl;

    public Table(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        Tabl = new int [this.rows][this.cols];
    }
}
