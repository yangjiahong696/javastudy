public class BitOperation {
    public static void main(String[] args) {
        /*
        练习题 1: 位与（&）
        题目: 给定两个整数 a = 4 和 b = 3，计算 a & b 的结果。

        练习题 2: 位或（|）
        题目: 给定两个整数 x = 7 和 y = 2，计算 x | y 的结果。

        练习题 3: 位异或（^）
        题目: 给定两个整数 m = 10 和 n = 4，计算 m ^ n 的结果。

        练习题 4: 按位取反（~）
        题目: 给定一个整数 k = -8，计算 ~k 的结果。

        练习题 5: 左移（<<）
        题目: 给定一个整数 p = 3，计算 p &lt;&lt; 2 的结果。

        练习题 6: 右移（>>）
        题目: 给定一个整数 q = 16，计算 q &gt;&gt; 3 的结果。

        练习题 7: 无符号右移（>>>）
        题目: 给定一个整数 r = -16，计算 r &gt;&gt;&gt; 2 的结果。
         */
        System.out.println(4 & 3);
        System.out.println(7 | 2);
        System.out.println(~-8);
        System.out.println(3<<2);
        System.out.println(16>>2);
        System.out.println(-16>>>2);
        System.out.println("");
    }
}
