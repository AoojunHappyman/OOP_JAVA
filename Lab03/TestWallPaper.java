import java.util.Scanner;

public class TestWallPaper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        WallPaperUnit w1 = new WallPaperUnit();

        System.out.print("Enter wallpaper name: ");
        String name = sc.nextLine();

        System.out.print("Enter wallpaper length: ");
        double length = sc.nextDouble();

        w1.setName(name);
        w1.setLength(length);


        System.out.println("----- Wallpaper Detail -----");
        System.out.println("Name   : " + w1.getName());
        System.out.println("Length : " + w1.getLength() + " meters");
        
        sc.close();
    }
}
