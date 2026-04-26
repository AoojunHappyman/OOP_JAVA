//NAME: Pattanachai Sawetbunchoed
//ID: 6887037
//SEC : 1


import java.util.Scanner;
public class Q1 {
 public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    double w1 = a.nextDouble();
    double w2 = a.nextDouble();
    double w3 = a.nextDouble();
    double w4 = a.nextDouble();
    double weight = (w1+w2+w3+w4)/4;

    double h1 = a.nextDouble();
    double h2 = a.nextDouble();
    double h3 = a.nextDouble();
    double h4 = a.nextDouble();
    double height = (h1+h2+h3+h4)/4;

    System.out.println(weight);
    System.out.println(height);
    }
}
