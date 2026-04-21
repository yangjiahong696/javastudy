import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        /*
        求ax<sup>2</sup>+bx+c=0方程的根，其中a,b,c分别为函数的参数。
         */
        Scanner input = new Scanner(System.in);

        System.out.println("请输入二次方程ax**2+bx+c=0的参数abc：");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double criterion = b*b - 4*a*c;

        if(criterion > 0){
            System.out.println("方程的结果为："+((-1*b+Math.sqrt(criterion))/(2*a))+"和"+((-1*b-Math.sqrt(criterion))/(2*a)));
        } else if (criterion == 0) {
            System.out.println("方程的结果为："+((-1*b/(2*a))));
        }else {
            System.out.println("方程无解");
        }

        input.close();

    }
}
