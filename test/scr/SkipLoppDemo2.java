package test.scr;

public class SkipLoppDemo2 {
    public static void main(String[] args) {            
        for (int i = 1; i < 5; i++){
            System.out.println("有坂什杀了第" + i +"个人");
            if(i == 3){
                break;
            }
        }        
    }
}