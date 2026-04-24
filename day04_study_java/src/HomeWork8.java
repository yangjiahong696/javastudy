public class HomeWork8 {
    public static void main(String[] args) {
        /*
        输出数字三角形
        空格的变化是10 9 8 7
        图形的变化是1 2 3 4
         */
        int i = 1;
        while(i<=5){
            for(int j = 1;j <= 11-i;j++){
                System.out.print(" ");
            }
            int k = 1;
            do{
                System.out.print("*");
                k++;
            }while(k<=2*i-1);
            System.out.println();
            i++;
        }
    }
}
