public class TypeConversion {
    public static void main(String[] args) {
        /*
    （1）当把一个存储范围小的类型的值赋值给一个类型存储范围更大的变量时
    （2）当多种数据类型混合运算时，结果按照他们中最大的
    （3）byte，short，char他们之间的计算，都会升级为int
         */
        int num = 'A';
        System.out.println("num = " + num);
        System.out.println('A'+ 3.6F + 100 + 2.1);
        byte num1 = 1;
        byte num2 = 2;
        int num3 = num1 + num2;
        System.out.println("num3 = " + num3);
        /*
        1、当把一个存储范围大的类型的值（字面量值）赋值给一个类型存储范围小的变量，就需要强制类型转换吗，此时可能有风险，可能会溢出截断或损失精度

        2、特殊：有时候，会根据计算的需要，故意提升某个值的类型，也用强制类型转换，但此时没有风险
         */
        int num4 = 1111;
        System.out.println("num4 = " + (byte)num4);
        int num5 = 1;
        int num6 = 2;
        System.out.println(num5/(double)num6);
    }
}
