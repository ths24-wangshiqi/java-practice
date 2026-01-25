package day4;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("テスト点数を入力してください");
        int testScores = sc.nextInt();

        if (testScores <= 100 && testScores >= 0) {
            if (testScores >= 95) {
                System.out.println("自転車プレゼント");

            }else if(testScores >= 90) {
                 System.out.println("遊園地行く");   
                
            }else if(testScores >= 80) {
                 System.out.println("オモチャプレゼント");   
                
            }else{
                System.out.println("なにもない");
            }
                     
        }else{
            System.out.println("成績は正常ではない");
        }
    }       
}
