import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        /*
        定义price变量表示价格，定义amount变量表示商品数量。

        从键盘输入价格和数量的值，计算顾客需要支付的金额。
         */
        Scanner input = new Scanner(System.in);

        System.out.println("请输入商品的价格和数量:");
        int price = input.nextInt();
        int amount = input.nextInt();

        System.out.println("商品的价格为:" + amount*price +"元");

        input.close();
    }
}
