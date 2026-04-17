import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
        输入一个年份，如果是闰年，输出366天，否则输出365天
         */
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个年份：");
        int year = input.nextInt();
        int day = 365;

        if(year % 4 == 0 && year % 4 != 0 || year % 400 == 0){
            day++;
        }
        System.out.println(year+"年有"+day+"天");
    }
}
