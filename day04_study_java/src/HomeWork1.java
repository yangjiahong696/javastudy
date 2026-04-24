public class HomeWork1 {
    public static void main(String[] args) {
        /*
        输出数字1-10,统计1-10的累加和,统计1-10的偶数和
         */
        int num = 0;
        int num2 = 0;
        for(int i=1;i <= 10;i++){
            System.out.println(i);

            num += i;

            if(i % 2 == 0){
                num2 += i;
            }
        }
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
    }
}
