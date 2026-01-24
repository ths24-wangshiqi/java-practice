package day4;

import java.util.Scanner;

public class ifTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("金を入力してください。");
        int money = sc.nextInt();
        if (money >= 1000) {
            System.out.println("いいもの喰う");
        } else{
            System.out.println("ゴミ喰う");
        }
    }
}
