package fleet;

import java.util.*;

public class FleetApp {

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\n1 - Show all");
            System.out.println("2 - Add car");
            System.out.println("3 - Add bus");
            System.out.println("4 - Total insurance");
            System.out.println("5 - Service all");
            System.out.println("6 - Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                for (Vehicle v : vehicles)
                    System.out.println(v);

            } else if (choice == 2) {
                System.out.print("Model: ");
                String m = sc.next();
                System.out.print("Year: ");
                int y = sc.nextInt();
                System.out.print("Price: ");
                double p = sc.nextDouble();
                System.out.print("Doors: ");
                int d = sc.nextInt();

                vehicles.add(new Car(m, y, p, d));
            }

            else if (choice == 3) {
                System.out.print("Model: ");
                String m = sc.next();
                System.out.print("Year: ");
                int y = sc.nextInt();
                System.out.print("Price: ");
                double p = sc.nextDouble();
                System.out.print("Capacity: ");
                int c = sc.nextInt();

                vehicles.add(new Bus(m, y, p, c));
            }

            else if (choice == 4) {
                double sum = 0;
                for (Vehicle v : vehicles)
                    sum += v.calculateInsuranceFee();
                System.out.println("Total: " + sum);
            }

            else if (choice == 5) {
                for (Vehicle v : vehicles)
                    ((Servicable) v).performService();
            }

            else if (choice == 6) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        new FleetApp().run();
    }
}
