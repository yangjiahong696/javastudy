import java.util.Scanner;

public class SwitchCaseExercise2 {
    public static void main(String[] args) {
        /*
        赌数游戏：随机产生3个1-6的整数，如果三个数相等，
        那么称为“豹子”，如果三个数之和大于9，称为“大”，
        如果三个数之和小于等于9，称为“小”，
        用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了
         */
        int num1 = (int)(Math.random()*6) + 1;
        int num2 = (int)(Math.random()*6) + 1;
        int num3 = (int)(Math.random()*6) + 1;
        Scanner input = new Scanner(System.in);

        System.out.print("请押注（豹子、大、小）");
        String user_input = input.next();

        String system = switch(num1+num2+num3){
            case 3,4,5,6,7,8,9 -> {
                if(num1==num2 && num1 == num3){
                    yield "豹子";
                }else {
                    yield "小";
                }
            }
            default -> {
                if(num1==num2 && num1 == num3){
                    yield "豹子";
                }else {
                    yield "大";
                }
            }
        };

        if(user_input.equals(system)){
            System.out.println("系统的结果是"+system+"恭喜你答对了，但没有奖励");
        }else {
            System.out.println("系统的结果是"+system+"恭喜你答错了，有惩罚");
        }

        input.close();
    }
}
