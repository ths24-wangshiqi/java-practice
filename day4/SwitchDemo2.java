package day4;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //输入星期
        Scanner sc = new Scanner(System.in);
        System.out.println("今天是星期几？（输入单个数字）");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("杀人");
                break;
            case 2:
                System.out.println("放火");
                break;
            case 3:
                System.out.println("分尸");
                break;
            case 4:
                System.out.println("吃人");
                break;
            case 5:
                System.out.println("无差别杀人");
                break;
            case 6:
                System.out.println("毁灭地球");
                break;
            case 7:
                System.out.println("毁灭宇宙");
                break;

            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
