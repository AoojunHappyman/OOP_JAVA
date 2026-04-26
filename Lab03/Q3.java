import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int style;
        int price = 0;
        do {
            System.out.println("Please choose your style:");
            style = a.nextInt();
            if (style == - 1){
                System.out.println("Bye");
                break;
        }
        System.out.println("size");
        int size = a.nextInt();
        System.out.println("Symbol");
        String symbol = a.next();
        if(style == 1){
            style1(size);
            price  = price +100;
        }
        else if(style==2){
            style2(size,symbol);
            price  = price +200;
        }
        else if(style==3){
            style3(size,symbol);
            price  = price +300;
        }
        else{
            System.out.println("qq");
        }
        }while(style != 1);
        System.out.println("price = "+ price);

    }
    static void style1 (int size){
        int i;
        int j;
        for (i=1;i<=5;i+=1){
            for(j=1;j<=i;j+=1){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void style2 (int size,String symbol){
        int i;
        int j;
        for (i=size;i>=1;i-=1){
            for(j=1;j<=i;j+=1){
                System.out.print(symbol+" ");
            }
            System.out.println();}
        }
    static void style3 (int size,String symbol){
        int i;
        int j;
        for (i=1;i<=size;i+=1){
            for(j=1;j<=i;j+=1){
                System.out.print(j+" ");
            }
            for(j=4;j>=i;j-=1){
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
    }
}

