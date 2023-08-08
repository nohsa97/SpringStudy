public class UserMain {
    public static void main(String[] args) {
        User u1;
        u1 = new User();
        u1.name = "asd";

        u1.printName();
        User.printCount();
    }
}
