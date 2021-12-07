import java.util.Arrays;
public class Pole{

    public static void main(String[] args) {
        int[] RANDOM= new int[20];
        int z=0;
        int p=0;
        int w=0;

        for (int i=0; i<20; i++){

            int random_cislo=(int)(Math.random()*50);
            RANDOM[i]=random_cislo +1;
            z=RANDOM[i];
            w=z+p;
            p=w;

        }
        for (int pole : RANDOM){
            System.out.println("" + pole);
        }
        
        System.out.println("Súčet bude: " + w);
        Arrays.sort(RANDOM);
        System.out.println("Najväčšie číslo: " + RANDOM[19]);
        System.out.println("Najmenšie číslo: " + RANDOM[0]);


    }
}