import java.util.Scanner;

public class Uloha {
    public static void main(String[] args) {

        int den = 1;

        System.out.println(" Zadaj počet kilometrov");
        Scanner scanner = new Scanner(System.in);
        double kilometre = scanner.nextInt();

        System.out.println(" Zadaj počet kilometrov koľko chce prejsť");
        Scanner scaner = new Scanner(System.in);
        double kilometreprejdene = scaner.nextInt();

        while (kilometre < kilometreprejdene){
            kilometre = kilometre * 1.1;
            den++;
        }
        System.out.println("Na " + den + " deň prejde " + ((double)Math.round(kilometre * 100.0)/ 100.0) + " km");
    }
}