public class HomeWork {
    public static void main(String[] args) {
        /*
        定义1个变量，用来表示圆周率并赋值为3.14
        再定义3个变量表示3个圆的半径，分别赋值为1.2、2.5、6.0，也可以随机产生[0,10)范围的小数值
        使用计算表达式求它们的面积，并输出显示半径和面积值。
        提示：在Java中用 * 表示乘法
         */
        double pi = 3.14;
        double r1 = 1.2;
        double r2 = 2.5;
        double r3 = 6.0;
        System.out.println("半径为"+r3+"的圆面积为"+pi*r3*r3*0.5);
        System.out.println("半径为"+r2+"的圆面积为"+pi*r2*r2*0.5);
        System.out.println("半径为"+r1+"的圆面积为"+pi*r1*r1*0.5);

    }
}
