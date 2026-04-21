import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        /*
        2、从键盘输入一个字符，判断字符类型
         */
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个字符：");
        char str = input.next().charAt(0);

        if(str >= '0' && str <= '9'){
            System.out.println(str+"是数字字符");
        } else if (str >= 'A' && str <= 'Z' || str >= 'a' && str <= 'z') {
            System.out.println(str+"是字母字符");
        }else {
            System.out.println(str+"是其他字符");
        }

        input.close();
    }
}
