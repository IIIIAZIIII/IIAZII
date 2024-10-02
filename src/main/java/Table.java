public class Table {
    private int rows;
    private int cols;
    private int[][] Tabl;

    public Table(int rows, int cols) {
        this.cols = cols;
        this.rows = rows;
        Tabl = new int [this.rows][this.cols];
    }
    public int GetValue(int Row,int Col){
        return Tabl[Row][Col];
    }
    public void setValue(int Row, int Col, int Val){
        Tabl[Row][Col]=Val;
    }

    public int Cols() {
        return cols;
    }

    public int Rows(){
        return this.rows;
    }
    public String toString(){
        String affd="";
        for (int i = 0; i < rows;i++){

            for (int j =0; j < cols;j++){
                affd+=Tabl[i][j]+" ";
            }
            affd+="\n";
        }
        return affd;
    }
    public double average(){
        int summ=0;
        for (int i = 0; i < rows;i++){

            for (int j =0; j < cols;j++){
                summ+=Tabl[i][j];
            }

        }
        return (double) summ/(rows*cols);
    }
}
