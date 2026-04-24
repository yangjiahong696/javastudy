public class HomeWork9 {
    public static void main(String[] args) {
        /*

         */
        for(int i = -3;i <= 3;i++){
            for(int j = 1;j <= 3-Math.abs(i);j++){
                System.out.print("*");
            }//判断是否输出*以及输出几个*
            System.out.print("O");//*后固定输出0
            for(int j = 1;j <= 2*Math.abs(i) - 1;j++){
                System.out.print("*");
            }//0后固定输出* ，只需判断输出几个*
            if(Math.abs(i) != 0){
                System.out.print("O");
            }//*后又输出0，只需判断哪里不输出0
            for(int j = 1;j <= 3-Math.abs(i);j++){
                System.out.print("*");
            }//0后固定输出*
            System.out.println();//输完一行，换行
        }
    }
}
