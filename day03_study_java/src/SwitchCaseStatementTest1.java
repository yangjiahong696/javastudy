import java.util.Scanner;

public class SwitchCaseStatementTest1 {
    public static void main(String[] args) {
        /*
        从键盘输入月份的数字，然后输出它对应的季节。
         */
        Scanner input = new Scanner(System.in);

        System.out.println("请输入对应的月份：");
        int month = input.nextInt();

        switch(month / 3){
            case 1 -> System.out.println("春季");
            case 2 -> System.out.println("夏季");
            case 3 -> System.out.println("秋季");
            default -> System.out.println("冬季");
        }
    }
}
