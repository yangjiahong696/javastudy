import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        从键盘输入一个成绩，
        如果成绩超过【0，100】提示成绩输入错误
        100、满分
        85到99 优秀
        70到84 良好
        60到69 及格
        0到59 不及格
         */
        Scanner input = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = input.nextInt();

        if(score < 0 || score > 100){
            System.out.println("成绩输入错误");
        } else if (score == 100) {
            System.out.println("满分");
        } else if (score >= 85) {
            System.out.println("优秀");
        } else if (score >= 70) {
            System.out.println("良好");
        } else if (score >= 60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }

        input.close();
    }
}
