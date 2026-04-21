import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args) {
        /*
        （1）定义变量week赋值为上一年最后一天的星期值，例如：2021年12月31日的星期值5，
        （2）定义变量year、month、day，分别赋值今年（例如：2022年）某一天的年、月、日值。
        （3）计算这一天是星期几。
        （4）开发提示
        需要计算这一天是今年（例如：2022年）的第几天，即今年已经过了几天了（总天数）
        再用（总天数 + 5 ）% 7 的结果来判断是星期几
        （5）每个月总天数：
        平年的2月份有28天，闰年的2月份有29天。
        1月、3月、5月、7月、8月、10月、12月有31天，
        4月、6月、9月、11月有30天。
        （6）闰年的判断标准是：
        年份year可以被4整除，但不能被100整除
        或者年份year可以被400整除
         */
        Scanner input = new Scanner(System.in);
        System.out.println("输入年月日：");
        int year = input.nextInt();
        int month = input.nextInt()-1;
        int day = input.nextInt();

        int days = 0;
        switch(month){
            case 11:days+=30;
            case 10:days+=31;
            case 9:days+=30;
            case 8:days+=31;
            case 7:days+=31;
            case 6:days+=30;
            case 5:days+=31;
            case 4:days+=30;
            case 3:days+=31;
            case 2:days+=((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)?29:28);
            case 1:days+=31;
            case 0:days+=day;
        }
        int week = (days+3)%7;
        if(week==0){
            System.out.println("今天是周日");
        }else {
            System.out.println("今天是周"+week);
        }
        input.close();
    }
}
