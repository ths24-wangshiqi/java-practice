package day4;

import java.util.Scanner;

public class ifTest5 {
    public static void main(String[] args) {
        double total = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("会員レベルを入力してください");
        int level = sc.nextInt();
        if (level >= 1 && level <= 3) {
            if (level == 1) {
            System.out.println("金額は" + (total * 0.9));
        }else if (level == 2) {
            System.out.println("金額は" + (total * 0.8));
        }else if (level == 3) {
            System.out.println("金額は" + (total * 0.7));
        }else{
            System.out.println("金額は" + total);
        }
        }
    }
}
