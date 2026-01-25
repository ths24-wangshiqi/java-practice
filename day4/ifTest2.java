package day4;

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("払ってください");
        int actualPay = sc.nextInt();
        if (actualPay >= 600) {
            System.out.println("支払い完了");
        }else{
            System.out.println("支払い失敗");
        } 

    }
}
