import javax.swing.*;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
        输入一个整数，如果是偶数，输出偶数，如果是奇数，输出奇数
         */
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = input.nextInt();

        if((num & 1) == 0){
            System.out.println("偶数");
        }
        else{
            System.out.println("奇数");
        }
    }
}
