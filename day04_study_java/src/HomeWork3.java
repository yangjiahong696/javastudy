public class HomeWork3 {
    public static void main(String[] args) {
        /*
        2、所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如： 153 = 1*1*1 + 5*5*5 + 3*3*3，找出所有的水仙花数，并统计他们有几个。
         */
        int num = 0;
        for(int i = 100;i <= 999;i++){
            int uni = i % 10;
            int ten = i/10 % 10;
            int hundred = i / 100;
            if(i == uni*uni*uni + ten*ten*ten + hundred*hundred*hundred){
                System.out.println(i);
                num += 1;
            }
        }
        System.out.println("一共有" + num + '个');

        int i = 100;
        num = 0;
        while(i<=999){
            int uni = i % 10;
            int ten = i/10 % 10;
            int hundred = i / 100;
            if(i == uni*uni*uni + ten*ten*ten + hundred*hundred*hundred){
                System.out.println(i);
                num += 1;
            }
            i++;
        }
        System.out.println("一共有" + num + '个');

        i = 100;
        num = 0;
        do {
            int uni = i % 10;
            int ten = i/10 % 10;
            int hundred = i / 100;
            if(i == uni*uni*uni + ten*ten*ten + hundred*hundred*hundred){
                System.out.println(i);
                num += 1;
            }
            i++;
        }while (i<=999);
        System.out.println("一共有" + num + '个');
        System.out.println(i);
    }
}
