import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        需求：从键盘输入一个数，如果是3的倍数，输出Three，如果是5的倍数，就输出Five 如果是7的倍数就输出seven，如果
        以上都是不是就输出未定义
        实现：需要一个变量 state判断分支代码是否执行
         */
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = input.nextInt();
        int state = 0;

        if(num % 3 == 0){
            System.out.println("Three");
            state++;
        }

        if(num % 5 == 0){
            System.out.println("Five");
            state++;
        }

        if(num % 7 == 0){
            System.out.println("Seven");
            state++;
        }

        if(state==0){
            System.out.println("未定义");
        }

        input.close();
    }
}
