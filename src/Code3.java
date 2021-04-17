public class Code3 {

    private static int check(int[] ints) {
        // 구현 할 위치
        return 0;

    }

    public static void main(String[] args) {

        System.out.println(check(new int[]{1, 5, 3, 2}) == 1);  //[4]
        System.out.println(check(new int[]{1, 7}) == 5);  //[2,3,4,5,6]
        System.out.println(check(new int[]{1, 2}) == 0);  //[]
    }
}
