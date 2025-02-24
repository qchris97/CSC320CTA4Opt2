import java.util.Scanner;

public class CSC320CTA4Opt2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] grades = new double[10];
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        System.out.println("Please enter ten grades for the class:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            if (scnr.hasNextDouble()) {
                grades[i] = scnr.nextDouble();
                sum += grades[i];
                if (grades[i] > max) {
                    max = grades[i];
                }
                if (grades[i] < min) {
                    min = grades[i];
                }
            } else {
                System.out.println("Error. Please enter a valid grade.");
                scnr.next();
                i--;
            }
        }


        double avg = sum / 10;

        System.out.println(" ");
        System.out.println("Average Grade: " + avg);
        System.out.println("Maximum Grade: " + max);
        System.out.println("Minimum Grade: " + min);
    }
    
}
