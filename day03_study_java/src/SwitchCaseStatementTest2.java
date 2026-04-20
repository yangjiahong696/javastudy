import java.util.Scanner;

public class SwitchCaseStatementTest2 {
    public static void main(String[] args) {
        /*
        1、编写一个程序，为一个给定的年份找出其对应的中国生肖。
        中国的生肖基于12年一个周期，每年用一个动物代表：
        monkey（猴）、rooster（鸡）、dog（狗）、pig（猪）、
        rat（鼠）、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、
        snake（蛇）、horse（马）、sheep（羊）。

提示：2016年 猴 2016%12==0 ， 2017年：鸡 2017 % 12 == 1（这个规律已经定好了）
         */
        Scanner input = new Scanner(System.in);
//
        System.out.println("请输入一个年份：");
        int year = input.nextInt();

        switch(year % 12){
            case 0 -> System.out.println("猴");
            case 1 -> System.out.println("鸡");
            case 2 -> System.out.println("狗");
            case 3 -> System.out.println("猪");
            case 4 -> System.out.println("鼠");
            case 5 -> System.out.println("牛");
            case 6 -> System.out.println("虎");
            case 7 -> System.out.println("兔");
            case 8 -> System.out.println("龙");
            case 9 -> System.out.println("蛇");
            case 10 -> System.out.println("马");
            case 11 -> System.out.println("羊");
        }

    }
}
