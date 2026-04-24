import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        /*
        4、声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。

---------ATM------- 1、存款 2、取款 3、显示余额 4、退出 请选择：
            进入欢迎界面：
            选择业务：进入四个分支，
            存款:请输入存款金额，计算结果，显示存款成功，进入业务选择界面
            取款：请输入取款金额
            显示余额，输出balance，
            退出：
         */
        Scanner input = new Scanner(System.in);

        System.out.println("欢迎使用天地银行");

        double balance = 0;
        for(int user = 5;user != 4;){
            System.out.println("请输入需要的业务：1、存款 2、取款 3、显示余额 4、退出");
            user = input.nextInt();

            if(user == 1){
                System.out.print("请输入存款金额：");
                int user_balance = input.nextInt();
                balance += user_balance;
                System.out.println("存款成功，你的余额为" + balance + "元");
                System.out.println("现在返回业务选择界面");
            } else if (user == 2) {
                for(;;){
                    System.out.print("请输入取款金额：");
                    int user_balance = input.nextInt();
                    if(balance<user_balance){
                        System.out.println("您的余额不足，请重新输入");
                    }else {
                        balance -= user_balance;
                        System.out.println("取款成功，你的余额为" + balance + "元");
                        System.out.println("现在返回业务选择界面");
                        break;
                    }

                }
            } else if (user == 3) {
                System.out.println("您的余额为"+ balance + "元");
            } else if (user == 4) {
                System.out.println("您已退出，欢迎再来");
            }else {
                System.out.println("输入错误请重新输入");
            }
        }
        input.close();

    }
}
