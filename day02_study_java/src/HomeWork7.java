public class HomeWork7 {
    public static void main(String[] args) {
        /*
        今天是周2，100天以后是周几？
        （100 - 2） % 7
         */
        System.out.println((100-2)%7 == 0?"今天是周2，一百天以后是周日" : "今天是周2，一百天以后是周"+(100+2)%7);
    }
}
