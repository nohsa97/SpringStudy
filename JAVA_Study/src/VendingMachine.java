public class VendingMachine {
    //필드

    //생성자

    //메소드

    public static void main(String[] args) {

    }

    public static void printVer(){
        System.out.println("v1.0");
    }

    public String pushButton (int menuId) {
        System.out.println(menuId + "번 전달 받음");
        return menuId+"전달";
    }
}
