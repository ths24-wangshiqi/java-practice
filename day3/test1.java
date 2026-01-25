package day3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入我们自己衣服的时髦程度。");
            int myFashion = sc.nextInt();
            System.out.println("请输入对象衣服的时髦程度。");
            int girlFashion = sc.nextInt();

            boolean result = myFashion > girlFashion;
            System.out.println(result);
        }
    }

    
}
