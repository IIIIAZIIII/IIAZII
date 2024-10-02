public class Bell {
    private String[] DINGDONG = {"ding","dong"};
    int Index = 0;
    public void sound(){
        System.out.println(DINGDONG[Index]);
        Index = Index^1;
    }

}
