import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        输入语句的学习：
        在Java的核心类库中，调用lang包中的类库不需要导入，其他的都需要导入
        输入语句非lang包类容，需要import导入Scanner库
        并创建一个新的输入对象（System.in），通过输入对象的next（）方法实现输入
        输入你的体重，输入你的年龄，输入你的性别，输入你的名字，输入你是否已婚
         */
        Scanner input = new Scanner(System.in);//这个代码本质是和控制台建立一个交互。输入其他内容也可以和其他内容做交互
        //也就是说不同项目的本质就是和其他平台做交互，和数据库交互就是后端，和浏览器驱动就是自动化测试。和网页交互就前端。
        //同一编程语言，需要做不同的交互，也就需要不同的核心类库。但编程基础是不变的
        
        System.out.print("输入你的体重");//.InputMismatchException如果输入与数据类型不符就会出现输入不匹配错误
        double wight = input.nextDouble();
        System.out.println("wight = " + wight);
        
        System.out.print("输入你的年龄");
        int age = input.nextInt();
        System.out.println("age = " + age);
        
        System.out.print("输入你的性别");
        char gender = input.next().charAt(0);
        System.out.println("gender = " + gender);
        
        System.out.print("输入你的名字");
        String name = input.next();
        System.out.println("name = " + name);
        
        System.out.print("输入你的是否已婚");
        boolean marred = input.nextBoolean();
        System.out.println("marred = " + marred);

        System.out.println("测试你是否理解java输入的运行方式,你输入五个字符下面这个语句只会获得一个回车符，但它不会输出");
        String result = input.nextLine();
        System.out.println("result = " + result);

        input.close();
        //不写、程序不会报错
        //但是因为键盘输入设计到Io操作，IO操作涉及到硬件的操作，java不能直接操作硬件，会调用C的代码。不写这个代码就会一直调用
        //所以需要手动释放资源，在这里只是养成编程习惯，实际上来说main方法结束后会自动释放
    }
}
