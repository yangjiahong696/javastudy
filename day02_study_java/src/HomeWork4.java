public class HomeWork4 {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 11;
        int a3 = 11;
        int a4 = 12;
        System.out.println(a1+"是偶数？"+(a1 % 2 == 0));
        System.out.println(a2+"是偶数？"+((a2 & 1) == 0));
        System.out.println(a3+"是奇数？"+((a3 & 1) == 1));
        System.out.println(a4+"是奇数？"+((a4 & 1) == 1));
    }
}
