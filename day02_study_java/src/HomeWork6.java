public class HomeWork6 {
    public static void main(String[] args) {
        /*
        小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
        它需要一个程序将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。
         */
        double fahrenheit = 80;
        double centigrade = (80 - 32) / 1.8;
        System.out.println("华氏度"+fahrenheit+"F转为摄氏度是"+centigrade+"C");
    }
}
