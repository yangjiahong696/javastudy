public class HomeWork10 {
    public static void main(String[] args) {
        /*
        找出1000以内的完数
         */
        for(int i = 1;i<=1000;i++){
            int sum = 1;
            int num = i;
            for(int j = 2;j <= num / 2;j++){
                if(num % j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
