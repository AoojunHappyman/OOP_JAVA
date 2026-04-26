import java.util.Scanner;

public class Q3 {
         public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            float num = a.nextFloat();
            if(num >= 1000){
                num *= 0.80;
                System.out.println(num);
            }
            else if(num > 100 && num <1000){
                num *= 0.90;
                System.out.println(num);
            }
            else if(num > 50 && num <100){
                num *= 0.95;
                System.out.println(num);
            }
            else if(num < 50){
                System.out.println(num);
            }
            
    }
}