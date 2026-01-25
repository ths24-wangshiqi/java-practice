package day3;

public class Tast4 {
    public static void main(String[] args) {
        int num1 = 150;
        int num2 = 210;
        int num3 = 165;

        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        System.out.println(max);
    }
}
