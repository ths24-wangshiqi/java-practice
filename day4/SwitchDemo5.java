package day4;

import java.util.Scanner;

public class SwitchDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择摁键");
        int key = sc.nextInt();
        switch (key) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            
            default -> System.out.println("退出服务");
        }
    }
}
