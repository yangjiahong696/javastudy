import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        /*
        从键盘输入姓名、性别，然后根据性别（男、女）分别输出问候语
         */
        Scanner input = new Scanner(System.in);

        System.out.println("请输入您的姓名和性别：");
        String name = input.next();
        String gender = input.next();

        System.out.println("尊敬的"+name+(gender.equals("男")?"男士":"女士")+"你好");

        input.close();
    }
}
