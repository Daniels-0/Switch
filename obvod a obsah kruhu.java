import java.util.Scanner;

public class Pokus4 {
    public static void main(String[] args) {
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj polomer: ");
        int r = scanner.nextInt();
        double o = 2 * pi * r;
        double s = pi * r * r;
        int p = r * 2;

        System.out.println("polomer kruhu je: " + r);
        System.out.println("Priemer kruhu je: " + p);
        System.out.println("Obsah hruhu je: " + s);
        System.out.println("Obvod hruhu je: " + o);
        
    }
}