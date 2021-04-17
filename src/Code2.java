public class Code2 {

    private static boolean checkPassword(String s) {
        // 구현 할 위치
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("8eqq") == false);
        System.out.println(checkPassword("password1") == false);
        System.out.println(checkPassword("Password1") == true);
    }

}
