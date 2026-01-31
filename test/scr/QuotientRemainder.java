package test.scr;

public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend = 100;
        int divisor = 37;
        int count = 0;

        while(dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("商为: " + count);
        System.out.println("余数为: " + dividend);
    }
}
