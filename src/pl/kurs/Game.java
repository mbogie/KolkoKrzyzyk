package pl.kurs;


import java.util.Scanner;

public class Game {


    public static void showGame(String tablica[][]) {
        System.out.println("    1   2   3");
        System.out.println("   -----------");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablica[i][j]);
                System.out.print("|");
            }
            System.out.println("\n   -----------");
        }
    }

    public static int check(String tablica[][], String imie, int i) {
        if (((tablica[0][0].equals(tablica[0][1]) && !tablica[0][0].equals("   ")) && (tablica[0][1].equals(tablica[0][2]) && !tablica[0][1].equals("   "))) ||
                ((tablica[1][0].equals(tablica[1][1]) && !tablica[1][0].equals("   ")) && (tablica[1][1].equals(tablica[1][2]) && !tablica[1][1].equals("   "))) ||
                ((tablica[2][0].equals(tablica[2][1]) && !tablica[2][0].equals("   ")) && (tablica[2][1].equals(tablica[2][2]) && !tablica[2][1].equals("   "))) ||
                ((tablica[0][0].equals(tablica[1][0]) && !tablica[0][0].equals("   ")) && (tablica[1][0].equals(tablica[2][0]) && !tablica[1][0].equals("   "))) ||
                ((tablica[0][1].equals(tablica[1][1]) && !tablica[1][0].equals("   ")) && (tablica[1][1].equals(tablica[2][1]) && !tablica[1][1].equals("   "))) ||
                ((tablica[0][2].equals(tablica[1][2]) && !tablica[2][0].equals("   ")) && (tablica[1][2].equals(tablica[2][2]) && !tablica[1][2].equals("   "))) ||
                ((tablica[0][0].equals(tablica[1][1]) && !tablica[0][0].equals("   ")) && (tablica[1][1].equals(tablica[2][2]) && !tablica[1][1].equals("   "))) ||
                ((tablica[0][2].equals(tablica[1][1]) && !tablica[0][2].equals("   ")) && (tablica[1][1].equals(tablica[2][0]) && !tablica[1][1].equals("   ")))) {
            System.out.println("Wygrany - " + imie);
            i = 10;
        }
        return i;
    }

    public static String[][] putIn(String tablica[][], String xo, String gamer) {
        boolean warunek = false;
        do {
            System.out.println(gamer + " Prosze wybrać pole:");
            Scanner scmove = new Scanner(System.in);
            int i = scmove.nextInt();
            int j = scmove.nextInt();
            if ((0 < i && i < 4) && (0 < j && j < 4) && (tablica[i - 1][j - 1].equals("   "))) {
                tablica[i - 1][j - 1] = xo;
                Game.showGame(tablica);

                warunek = true;

            } else {
                System.out.println("Bład. Wybierz jeszcze raz.");
                Game.showGame(tablica);
            }

        } while (warunek == false);
        return tablica;
    }
}



