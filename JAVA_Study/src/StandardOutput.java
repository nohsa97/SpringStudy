public class StandardOutput {
    public void println(boolean b){
        System.out.println(b) ;
    }

    public void println(int i){
        System.out.println(i) ;
    }

    public void println(double b){
        System.out.println(b) ;
    }

    public void println(String i){
        System.out.println(i) ;
    }
    //제작할때, 사용자는 이용하기 쉽도록 제작.

    public static void main(String[] args) {
        StandardOutput so = new StandardOutput();
        so.println(2);
        so.println(true);
        so.println(2.5);
        so.println("fcc");
    }
}
