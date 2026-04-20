import java.util.Scanner;

public class SwitchCaseStatementTest {
    public static void main(String[] args) {
        /*
        需求：键盘输入年、月、日。计算这一天是这一年的第几天
        直接判断天数：根据平润和月分关系决定是否加一天
        控制台输出：请输入年月日
        计算天数：使用其穿透性，用一个变量倒着月份累加天数
        判断平润月份关系输出结果
         */
        Scanner input = new Scanner(System.in);

        System.out.print("请输入年月日：");
        int year = input.nextInt();
        int moonth = input.nextInt() - 1;
        int day = input.nextInt();
        int days = 0;
        /* 方法一：
        switch(moonth){
            case 11: days += 30;
            case 10: days += 31;
            case 9: days += 30;
            case 8: days += 31;
            case 7: days += 31;
            case 6: days += 30;
            case 5: days += 31;
            case 4: days += 30;
            case 3: days += 31;
            case 2: days += 28;
            case 1: days += 31;
            case 0:
                days += day;
                if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && moonth >= 2){
                    System.out.println("这是今年第" + (days+1) + "天");
                }else {
                    System.out.println("这是今年第" + days + "天");
                }
        }
        */
        switch(moonth){
            case 11: days += 30;
            case 10: days += 31;
            case 9: days += 30;
            case 8: days += 31;
            case 7: days += 31;
            case 6: days += 30;
            case 5: days += 31;
            case 4: days += 30;
            case 3: days += 31;
            case 2: days += (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)?29:28;
            case 1: days += 31;
            case 0:
                days += day;
                System.out.println("这是今年第" + days + "天");
        }
        input.close();
    }
}
