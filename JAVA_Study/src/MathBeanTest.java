public class MathBeanTest {
    public static void main(String[] args) {
        MathBean mb = new MathBean();
        mb.printClassName();
        int x = mb.plus(10,20);
        System.out.println(x);
    }
}
