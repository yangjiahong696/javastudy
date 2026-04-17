public class WorkBook {
    public static void main(String[] args) {
        /*
        取出1234的个位，十位，百位，千位
         */
        int num = 3418;
        int unit = num % 10;
        num = num / 10;
        int ten = num % 10;
        num = num / 10;
        int hundred = num % 10;
        num = num / 10;
        int thousand = num % 10;
        System.out.println("thousand = " + thousand);
        System.out.println("handred = " + hundred);
        System.out.println("ten = " + ten);
        System.out.println("unit = " + unit);

        /*
        交换两个变量的值
         */
        int a = 1;
        int b = 2;
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(false ? 'a' : 100);
    }
}
