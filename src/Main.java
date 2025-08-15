import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        int n = sc.nextInt();
        sc.nextLine();

        People[] people = new People[n];

        for (int i = 0; i < people.length; i++) {
            System.out.printf("Data of person %d:%n", i + 1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine();

            people[i] = new People(name, age, height);
        }

        double sumHeight = 0.0;
        int countUnder16 = 0;

        for (People p : people) {
            sumHeight += p.getHeight();
            if (p.getAge() < 16) {
                countUnder16++;
            }
        }

        double averageHeight = sumHeight / people.length;
        double percentageUnder16 = (countUnder16 * 100.0) / people.length;

        System.out.printf("Average height: %.2f%n", averageHeight);
        System.out.printf("People under 16: %.1f%%%n", percentageUnder16);

        for (People p : people) {
            if (p.getAge() < 16) {
                System.out.println(p.getName());
            }
        }
        sc.close();
    }
}