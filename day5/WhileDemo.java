public class WhileDemo {
    public static void main(String[] args) {
        //定义变量
        double height = 8844430;
        double paper = 0.1;
        int count = 0;
        //循环
        while (paper < height){
            paper = paper * 2;
            count++;
        }
        //输出
        System.out.println(count);
    }
}
