import java.util.*;

// 🔸 Abstract Class
abstract class Student {
    String name;
    int midterm, fin;

    public Student(String name, int midterm, int fin) {
        this.name = name;
        this.midterm = midterm;
        this.fin = fin;
    }

    public abstract char getGrade(); // S หรือ U
}

// 🔸 Undergraduate
class Undergraduate extends Student {
    int project;

    public Undergraduate(String name, int midterm, int fin, int project) {
        super(name, midterm, fin);
        this.project = project;
    }

    public char getGrade() {
        if ((midterm + fin >= 50) && project >= 50) {
            return 'S';
        }
        return 'U';
    }
}

// 🔸 Graduate
class Graduate extends Student {
    int publications;

    public Graduate(String name, int midterm, int fin, int publications) {
        super(name, midterm, fin);
        this.publications = publications;
    }

    public char getGrade() {
        if ((midterm + fin >= 60) && publications >= 2) {
            return 'S';
        }
        return 'U';
    }
}

// 🔸 Main
public class Lab08_1 {

    // 🔥 method ภายนอก
    public static void reportGrade(ArrayList<Student> list) {
        int countS = 0, countU = 0;

        for (Student s : list) {
            char grade = s.getGrade();

            System.out.println(s.name + " : " + grade);

            if (grade == 'S') countS++;
            else countU++;
        }

        System.out.println("U = " + countU);
        System.out.println("S = " + countS);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.print("Enter type (u/g): ");
            char type = sc.next().charAt(0);

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter midterm: ");
            int mid = sc.nextInt();

            System.out.print("Enter final: ");
            int fin = sc.nextInt();

            if (type == 'u' || type == 'U') {
                System.out.print("Enter project: ");
                int proj = sc.nextInt();
                list.add(new Undergraduate(name, mid, fin, proj));
            } else {
                System.out.print("Enter publications: ");
                int pub = sc.nextInt();
                list.add(new Graduate(name, mid, fin, pub));
            }

            System.out.print("Continue? (y/n): ");
            char c = sc.next().charAt(0);
            if (c == 'n' || c == 'N') break;
        }

        // 🔥 เรียก method สรุป
        reportGrade(list);
    }
}
