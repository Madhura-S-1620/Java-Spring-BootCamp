import java.util.Scanner;

class Dimension {
    public double base;
    public double height;
    public double length;
    public double breadth;

    public Dimension() {
       
    }

    public void displayTriangle(double base, double height) {
        double areaTriangle = 0.5 * base * height;
        System.out.println("AREA OF TRIANGLE IS  : " + areaTriangle);
        System.out.println("=======================================================");
    }

    public void displayRectangle(double length, double breadth) {
        double areaRectangle = length * breadth;
        System.out.println("AREA OF RECTANGLE IS  : " + areaRectangle);
        System.out.println("=======================================================");
    }
}

public class Areas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dimension dimension = new Dimension();
        int choice;

        while (true) {
            System.out.println("\t  MENU");
            System.out.println("\t1.Triangle");
            System.out.println("\t2.Rectangle");
            System.out.println("\t3.Exit");
            System.out.print("Choice ::");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nENTER BASE OF TRIANGLE: ");
                    double base = scanner.nextDouble();
                    System.out.print("ENTER HEIGHT OF TRIANGLE: ");
                    double height = scanner.nextDouble();
                    dimension.displayTriangle(base, height);
                    break;
                case 2:
                    System.out.print("\nENTER FIRST DIMENSION : ");
                    double length = scanner.nextDouble();
                    System.out.print("ENTER SECOND DIMENSION : ");
                    double breadth = scanner.nextDouble();
                    dimension.displayRectangle(length, breadth);
                    break;
                case 3:
                    System.out.println("\n   EXITED SUCCESSFULLY  ");
                    System.out.println("=======================================================");
                    scanner.close();
                    return;
                default:
                    System.out.println("\n  INVALID INPUT  ");
                    System.out.println("=======================================================");
                    break;
            }
        }
    }
}
