import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        /*
        分别从键盘输入年year，月month，日day变量的值，然后拼接为 yyyy-MM-dd的日期格式输出。
        # 伪代码
        键盘输入年月日

        拼接为yyyy-MM-dd格式输出
         */
        Scanner input = new Scanner(System.in);

        System.out.println("请输入年月日：");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        System.out.println(year+"-"+month+"-"+day);
    }
}
