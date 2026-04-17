public class hello {
    public static void main(String[] args) {
        /*
        练习：定义一组变量。表示自己的姓名，身高，体重，性别，是否已婚,年龄
         */
        String name = "yangjiahong";
        float hight = 1.68f;
        double wight = 68.9;
        char gender = '男';
        boolean marry = true;
        int age = 18;
        System.out.println("姓名：" + name);
        System.out.println("身高：" + hight);
        System.out.println("体重：" + wight);
        System.out.println("性别：" + gender);
        System.out.println("是否已婚：" + marry);
        System.out.println("年龄：" + age);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
    }
}
//在src文件中的代码才能被正常编译和运行