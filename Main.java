import java.util.Scanner;

public class Main{
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadaj cele cislo ");
        int cislo = scanner.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);

        for(int i = 0; i < cislo - 2; ++i) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}