package test.scr;

import java.util.Scanner;

public class RoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个大于2的整数：");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (i * i == n) {
                System.out.println(i + "是" + n + "的平方根");
                break;
            }
            else if (i * i > n) {
                System.out.println(i - 1 + "是" + n + "的平方根的整数部分");
                break;
            }
        }

    }
}
