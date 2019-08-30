import java.util.Scanner;

public class ConvertTemple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double F;
        double C;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1 . Convert F to C");
            System.out.println("2 . Convert C to F");
            System.out.println("0 . Exit");
            System.out.println("Enter your choice.");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("Enter C: ");
                    C = scanner.nextDouble();
                    System.out.println("C To F: " + CtoF(C));
                    break;
                case 2 :
                    System.out.println("Enter F: ");
                    F = scanner.nextDouble();
                    System.out.println("F to C: " + FtoC(F));
                    break;
                case 0 :
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
    public static double CtoF(double C) {
        double F = (9.0 / 5) * C +32;
        return F;
    }
    public static double FtoC(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }
}
