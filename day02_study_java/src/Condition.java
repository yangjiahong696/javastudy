public class Condition {
    public static void main(String[] args) {
        /*
        int a = 85;
        int b = 45
    （1）编写并输出判断整数a是否是奇数的条件

    （2）编写并输出判断a>b并且a的个位数是3的条件

    （3）编写并输出判断a是否在[0,100]范围内的条件

    （4）编写并输出判断a和b是一正一负的条件
         */
        int a = 85;
        int b = 45;
        System.out.println(85 % 2 == 1 ? "奇数" : "偶数");
        System.out.println(a > b & a % 10 == 3 ? "成立" : "不成立");
        System.out.println(a >= 0 & a <= 100 ? true : false);
        System.out.println(a*b > 0 ? "不成立" : "成立");
        /*
        声明一个int类型的变量year，赋值为当年的年份值，判断该年是否是闰年，输出判断结果。

        闰年的判断标准是：

        （1）年份year可以被4整除，但不能被100整除

        （2）或年份year可以被400整除
        与的优先级比或高
         */
        int year = 2000;
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "闰年" : "平年");
    }
}
