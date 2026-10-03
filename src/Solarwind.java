import java.util.Scanner;

public class Solarwind {

    
    public static double getTotal(double morning, double evening) {
        return morning + evening;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning energy (kWh): ");
        double morning = sc.nextDouble();

        System.out.print("Enter evening energy (kWh): ");
        double evening = sc.nextDouble();

               double total = getTotal(morning, evening);

        System.out.println("Total energy generated: " + total + " kWh");

        sc.close();
    }
}