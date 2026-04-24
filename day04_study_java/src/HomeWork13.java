import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        /*
        键盘输入一个数，判断它是否是一个质数。
         */
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个数：");
        int num = input.nextInt();

        boolean flag = true;
        for(int i = 2;i <= Math.sqrt(num);i++){
            if(num % i == 0){
                System.out.println("这个数不是质数");
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("这个数是质数");
        }
        input.close();
    }
}
