package day3;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字。");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个数字。");
        int num2 = sc.nextInt();

        boolean result = num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0;

        System.out.println(result);

    }
}