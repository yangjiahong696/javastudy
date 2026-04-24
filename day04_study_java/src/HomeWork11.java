import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        /*
        输入一个正整数，如果不是正整数，持续到输出正整数为止
         */
        Scanner input = new Scanner(System.in);

        for(;;){
            System.out.println("请输入一个正整数：");
            int num = input.nextInt();
            if(num > 0){
                break;
            }
        }
        input.close();
    }
}
