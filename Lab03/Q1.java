// import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Scanner a = new Scanner(System.in);
        System.out.println("=== Welcome to Customized Wallpaper System ===");
        System.out.println("We have 3 popular styles here:");
        System.out.println("=== Style 1 ===");
        int i;
        int j;
        for (i=1;i<=5;i+=1){
            for(j=1;j<=i;j+=1){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("=== Style 2 ===");
        for (i=1;i<=5;i+=1){
            for(j=1;j<=i;j+=1){
                System.out.print(" ");
            }
            for(j=4;j>=i;j-=1){
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("=== Style 3 ===");
        for (i=1;i<=5;i+=1){
            for(j=1;j<=i;j+=1){
                System.out.print(j);
            }
            for(j=4;j>=i;j-=1){
                System.out.print("-");
            }
            System.out.println();
        }
        }
    }
