import java.util.Scanner;

public class HomeWork15 {
    public static void main(String[] args) {
        /*
        （1）从键盘输入年、月、日，
        （2）假设从这一年的1月1日开始执行三天打鱼两天晒网，那么你输入的这一天是在打鱼还是晒网。
        （3）开发提示：
        先计算这一天是这一年的第几天，即总天数
        再用总天数 % 5（三天打鱼两天晒网的周期），根据结果来判断是打鱼还是晒网
        （4）每个月总天数：
         平年的2月份有28天，闰年的2月份有29天。
            1月、3月、5月、7月、8月、10月、12月有31天，
        4月、6月、9月、11月有30天。
        （5）闰年的判断标准是：
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
        int week = days%5;
        if(week == 1 || week == 2 || week == 3){
            System.out.println("今天打鱼");
        }else {
            System.out.println("今天筛网");
        }
        input.close();
    }
}
