package day2;

import java.util.Scanner;

public class keyboardReturn {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("入力してください");

            int number = sc.nextInt();

            //个位嬷10
            int ge = number % 10;
            //十位除10嬷10
            int shi = number / 10 % 10;
            //百位除100嬷10
            int bai = number / 100 % 10;

            System.out.println(ge);
            System.out.println(shi);
            System.out.println(bai);
        }
    }
    
}