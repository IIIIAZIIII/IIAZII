public class OddEvenSeparator {
    private String Odd = "[";
    private String Even = "[";

    public void addNamber(int Num) {
        if (Num % 2 == 0) {
            Even += Num+", ";
        } else {
            Odd += Num+", ";
        }
    }
    public void even(){
        System.out.println("Четные: "+Even.substring(0,Even.length()-2)+"]");
    }
    public void odd(){
        System.out.println("Не четные: "+Odd.substring(0,Odd.length()-2)+"]");
    }
}
