import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        /*
        （1）从键盘输入年、月、日，

        （2）要求年份必须是正整数，月份范围是[1,12]，日期也必须在本月总天数范围内，

        （3）如果输入正确，输出“xxxx年-xx月-xx日”结果，否则提示输入错误。
         */
        Scanner input = new Scanner(System.in);

        System.out.println("请输入日期年月日：");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        input.close();

        if(year>0){
            if(month >= 1 && month <= 12){
                switch(month){
                    case 1,3,5,7,8,10,12-> {
                        if(day>0 && day<=31){
                            System.out.println(year+"年-"+month+"月-"+day+"日");
                        }else {
                            System.out.println("日期输入不合法");
                        }
                    }
                    case 4,6,9,11 -> {
                        if(day>0 && day<=30){
                            System.out.println(year+"年-"+month+"月-"+day+"日");
                        }else {
                            System.out.println("日期输入不合法");
                        }
                    }
                    case 2 -> {
                        if(day>0 && day<=28){
                            System.out.println(year+"年-"+month+"月-"+day+"日");
                        }else if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )&& day == 29){
                            System.out.println(year+"年-"+month+"月-"+day+"日");
                        }else {
                            System.out.println("日期输入不合法");
                        }
                    }
                }
            }else {
                System.out.println("月份输入不合法");
            }
        }else {
            System.out.println("年份输入不合法");
        }
    }
}
