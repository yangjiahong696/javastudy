import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        /*
        输入一个合格的年月日，年份正整数
        月份 1-12
        日期，符合年份月份的限制
         */
        Scanner input = new Scanner(System.in);


        System.out.println("请输入一个合格的年份：");
        for(;;){
           int year = input.nextInt();
           int month = input.nextInt();
           int day = input.nextInt();
           if(year <= 0 || (month < 1 && month > 12)){
               continue;
           }
           int totalday = 0;
           if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12){
               totalday = 31;
           }else if (month == 4 || month == 6 || month == 9 || month == 11) {
               totalday = 30;
               }else {
               totalday = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)?29:28;
           }
           if (day<0 || day > totalday){
               continue;
           }
            System.out.println(year+"--"+month+"--"+day);
            break;
           }
           }
        }


