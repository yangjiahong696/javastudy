import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        /*
        从键盘输入月份值（1-12），输出对应月份的英语单词，如果月份值超过1-12，提示输入错误！
         */
        Scanner input = new Scanner(System.in);

        System.out.println("请输入对应月份：");
        int month = input.nextInt();

        switch(month){
            case 1-> System.out.println("一月");
            case 2-> System.out.println("二月");
            case 3-> System.out.println("三月");
            case 4-> System.out.println("四月");
            case 5-> System.out.println("五月");
            case 6-> System.out.println("六月");
            case 7-> System.out.println("七月");
            case 8-> System.out.println("八月");
            case 9 -> System.out.println("九月");
            case 10-> System.out.println("十月");
            case 11-> System.out.println("十一月");
            case 12-> System.out.println("十二月");
            default -> System.out.println("输入错误");
        }

        input.close();
    }
}
