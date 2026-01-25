package day4;

public class SwitchDemo {
    public static void main(String[] args) {
        //定义变量记录我想吃的面
        String eat = "尸体";
        //对比
        switch (eat) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "炸酱面":
                System.out.println("吃炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃奥力给");
                break;
        }
    }
}
