package day3;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一虎の体重は？");
        int number1 = sc.nextInt();
        System.out.println("第二虎の体重は？");
        int number2 = sc.nextInt();

        //boolean result = number1 == number2;
        String result = number1 == number2 ? "同じ" : "同じではない";
        System.out.println(result);
    }
}
