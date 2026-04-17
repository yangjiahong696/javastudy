public class HomeWork8 {
    public static void main(String[] args) {
        /*
        使用位运算符交换两个变量的值
         */
        int a = 1;
        int b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);
    }
}
