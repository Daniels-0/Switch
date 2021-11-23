import java.util.Scanner;
import java.util.Random;
public class Skola {
    public static void main(String[] args) {



        float y = 100;
        float x;
        int o;

        while (y > 0){

            for (int i =0; i<=y;){
                System.out.println("zadaj čiastku");
                Scanner xa = new Scanner(System.in);
                x = xa.nextFloat();
                System.out.println("číslo 1/2");
                Scanner ya = new Scanner(System.in);
                o = ya.nextInt();

                if(y>=x) {
                    y = y - x;
                }
                else{
                    System.out.println("Nemáš dostatok peniazí");
                }

                Random rand = new Random();
                int upperbound = 2;
                int int_random = rand.nextInt(upperbound);
                if (int_random == o){
                    y = y +(2 * x);
                }
                System.out.println("zostatok :"+ y);

            }if(y == 0){
                System.out.println("Už nemáš peniaze");
            }
        }
    }
}
