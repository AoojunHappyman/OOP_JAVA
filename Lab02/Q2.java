import java.util.Scanner;

public class Q2 {
     public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            int money = a.nextInt();

            int ten = money / 10;
            money = money % 10;

            int five = money / 5;
            money = money % 5;

            int one = money / 1;
            
            System.out.println(ten);
            System.out.println(five);
            System.out.println(one);
}
}
