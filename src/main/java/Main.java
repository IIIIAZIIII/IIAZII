public class Main {

    public static void main(String[] Clicks) {
        Table obj = new Table(3,3);
        for (int i = 0; i < obj.Rows(); i++){
            for(int j = 0; j < obj.Cols(); j++){
                obj.setValue(i,j,1);
            }
        }
        System.out.println(obj);
        System.out.println(obj.average());
        /*OddEvenSeparator obj = new OddEvenSeparator();
        obj.addNamber(-3);
        obj.addNamber(6);
        obj.addNamber(7);
        obj.addNamber(0);
        obj.addNamber(-2);
        obj.addNamber(6);
        obj.addNamber(3);
        obj.even();
        obj.odd();*/
        /*Bell obj = new Bell();
        Bell obj2 = new Bell();
        obj.sound();
        obj2.sound();
        obj.sound();
        obj2.sound();
        obj.sound();*/
        /*Balance obj = new Balance();
        obj.addRight(11);
        obj.addLeft(10);
        obj.result();*/
        /*Button obj = new Button();
        obj.click();
        obj.click();
        obj.click();
        obj.click();
        obj.click();
        obj.click();
        obj.click();
        obj.click();
        obj.click();*/

    }
}
class Button {
    private int Click = 0;

    public Button() {
        Click = 0;
    }
    public void click(){
        Click++;
        System.out.println(Click);
    }
}

