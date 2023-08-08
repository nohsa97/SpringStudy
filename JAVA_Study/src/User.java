public class User {
    String id;
    String name;
    static int count = 0; //클래스 필드 // 위에는 다 인스턴스


    public void printName(){
        System.out.println(name+" 이름디");
    }

    public static void printCount(){
        System.out.println(count);  //클래스 메소드에서는 인스턴스 들을 사용 불가능.스태틱 부터 항상 읽어서
        System.out.println(true);
    }
}
