import java.util.Scanner;
import java.util.Random;
public class Pokus3 {
    public static void main(String[] args) {

        double x = 100;
        double y;
        int z;

        while (x > 0){
            for (int i = 0; i <= x; i++){
                System.out.println("Zadaj čiastku: ");
                Scanner xa = new Scanner(System.in);
                y = xa.nextDouble();
                System.out.println("zadaj číslo 1 alebo 2");
                Scanner scanner = new Scanner(System.in);
                z = scanner.nextInt();
                if(y >= x) {
                    x = x - y;
                }

                else{
                    System.out.println("Nemaš money");
                }
                Random rand = new Random();
                int upperbound = 2;
                int int_random = rand.nextInt(upperbound);
                if (int_random == z){
                    x = x +(2 * x);
                }
                System.out.println("zostatok: "+ x);

            }if(x == 0){
                System.out.println(" už nemáš peniaze ");
            }
        }
    }
}