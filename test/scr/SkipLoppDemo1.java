package test.scr;

public class SkipLoppDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println("有坂什杀了第" + i +"个人");       
        }
        

        
    }
}