import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadaj polomer kruhu v cm: ");
        kruh();
        System.out.println("Zadaj stranu štvorca v cm: ");
        stvorec();

    }
    static void kruh(){
        Scanner polomer = new Scanner(System.in);
        double a = polomer.nextDouble();

        double pi = 3.14;
        double kruh = pi * a * a;
        double obvod = pi * a * 2;
        System.out.println("r je " + a);
        System.out.println("Obsah kruhu je: " + kruh + " cm2");
        System.out.println("Obvod kruhu je: " + obvod + " cm");
    }
    static void stvorec(){
        Scanner strana = new Scanner(System.in);
        double a = strana.nextDouble();

        double obsah = a * a;
        double obvod = a * 4;
        System.out.println("Dlžka strany je " + a);
        System.out.println("obvod je " + obvod);
        System.out.println("obsah je " + obsah);
    }
}
