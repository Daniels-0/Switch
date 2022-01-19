import java.util.Arrays;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class Pis {
    public static void main(String[] args) {

        int[][] dvapole = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };

        for (int i = 0; i < 99; i++) {
            int o;
            int x;
            int y;
            System.out.println("hrac 1 zadajte riadok 0 - 2 ");
            Scanner xa = new Scanner(System.in);
            x = xa.nextInt();
            System.out.println("hrac 1 zadajte stlpec 0 - 2");
            Scanner ya = new Scanner(System.in);
            y = ya.nextInt();

            if (dvapole[x][y] == 2) {
                System.out.println("tam ma pole protihrac");
                int a;
                int s;
                System.out.println("hrac 2 zadajte riadok 0 - 2");
                Scanner ja = new Scanner(System.in);
                a = ja.nextInt();
                System.out.println("hrac 2 zadajte stlpec 0 - 2");
                Scanner sa = new Scanner(System.in);
                s = sa.nextInt();
                dvapole[a][s] = 1;
            } else {
                dvapole[x][y] = 1;
            }

            for (int f = 0; f < dvapole.length; f++) {
                for (int j = 0; j < dvapole[f].length; j++) {
                    System.out.print(dvapole[f][j]);
                    if (j == 2) {
                        System.out.println();
                    }
                }
            }
            System.out.println("---------");
            int m;
            int l;

            System.out.println("hrac 2 zadajte riadok 0 - 2");
            Scanner ma = new Scanner(System.in);
            m = ma.nextInt();
            System.out.println("hrac 2 zadajte stlpec 0 - 2");
            Scanner la = new Scanner(System.in);
            l = la.nextInt();

            if (dvapole[m][l] == 1) {
                System.out.println("tam ma pole protihrac");
                int a;
                int s;
                System.out.println("hrac 2 zadajte riadok 0 - 2");
                Scanner ja = new Scanner(System.in);
                a = ja.nextInt();
                System.out.println("hrac 2 zadajte stlpec 0 - 2");
                Scanner sa = new Scanner(System.in);
                s = sa.nextInt();
                dvapole[a][s] = 2;
            } else {
                dvapole[m][l] = 2;
            }
            System.out.println("---------");

            for (int f = 0; f < dvapole.length; f++) {
                for (int j = 0; j < dvapole[f].length; j++) {
                    System.out.print(dvapole[f][j]);
                    if (j == 2) {
                        System.out.println();
                    }
                }
            }

            if (dvapole[0][0] == 1 && dvapole[1][1] == 1 && dvapole[2][2] == 1) {
                System.out.println("hrac 1 vyhral");
            }if (dvapole[0][2] == 1 && dvapole[1][1] == 1 && dvapole[2][0] == 1) {
                System.out.println("hrac 1 vyhral");
            }if (dvapole[0][0] == 1 && dvapole[1][0] == 1 && dvapole[2][0] == 1) {
                System.out.println("hrac 1 vyhral");
            }if (dvapole[1][0] == 1 && dvapole[1][1] == 1 && dvapole[1][2] == 1) {
                System.out.println("hrac 1 vyhral");
            }if (dvapole[2][2] == 1 && dvapole[2][1] == 1 && dvapole[2][0] == 1) {
                System.out.println("hrac 1 vyhral");
            }if (dvapole[0][0] == 1 && dvapole[1][0] == 1 && dvapole[2][0] == 1) {
                System.out.println("hrac 1 vyhral");
            }if (dvapole[0][1] == 1 && dvapole[1][1] == 1 && dvapole[2][1] == 1) {
                System.out.println("hrac 1 vyhral");
            }if (dvapole[0][2] == 1 && dvapole[1][2] == 1 && dvapole[2][2] == 1) {
                System.out.println("hrac 1 vyhral");
            }
            if (dvapole[0][0] == 2 && dvapole[1][1] == 2 && dvapole[2][2] == 2) {
                System.out.println("hrac 2 vyhral");
            }if (dvapole[0][2] == 2 && dvapole[1][1] == 2 && dvapole[2][0] == 2) {
                System.out.println("hrac 2 vyhral");
            }if (dvapole[0][0] == 2 && dvapole[1][0] == 2 && dvapole[2][0] == 2) {
                System.out.println("hrac 2 vyhral");
            }if (dvapole[1][0] == 2 && dvapole[1][1] == 2 && dvapole[1][2] == 2) {
                System.out.println("hrac 2 vyhral");
            }if (dvapole[2][2] == 2 && dvapole[2][1] == 2 && dvapole[2][0] == 2) {
                System.out.println("hrac 2 vyhral");
            }if (dvapole[0][0] == 2 && dvapole[1][0] == 2 && dvapole[2][0] == 2) {
                System.out.println("hrac 2 vyhral");
            }if (dvapole[0][1] == 2 && dvapole[1][1] == 2 && dvapole[2][1] == 2) {
                System.out.println("hrac 2 vyhral");
            }if (dvapole[0][2] == 2 && dvapole[1][2] == 2 && dvapole[2][2] == 2) {
                System.out.println("hrac 2 vyhral");
            }
        }
    }
}