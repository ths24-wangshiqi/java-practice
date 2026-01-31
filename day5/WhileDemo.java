public class WhileDemo {
    public static void main(String[] args) {
        int tal = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper < tal){
            paper = paper * 2;
            count = count + 1;
        }
        System.out.println(count);
    }
}
