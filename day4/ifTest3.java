package day4;

import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("座席番号入力してください");

        int seatNumber = sc.nextInt();

        if (seatNumber >= 0 && seatNumber <=100) {
            if (seatNumber % 2 == 1) {
                System.out.println("左側に座ってください");
            }else{
                System.out.println("右側に座ってください");
            } 
        }   
    }
}
