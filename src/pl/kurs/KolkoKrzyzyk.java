package pl.kurs;

import java.util.Scanner;


public class KolkoKrzyzyk {

    public static void main(String[] args) {

        String[][] tablica = new String[3][3];
        int i;
        int j;
        String xo;
        int move;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                tablica[i][j] = "   ";

            }
        }
        System.out.println("Podaj imię pierwszego gracza");
        Scanner sc1 = new Scanner(System.in);
        String gamer1 = sc1.nextLine();
        System.out.println("Podaj imię drugiego gracza");
        Scanner sc2 = new Scanner(System.in);
        String gamer2 = sc2.nextLine();
        System.out.println("Gracz " + gamer1 + " ma - X");
        System.out.println("Gracz " + gamer2 + " ma - O");

        Game.showGame(tablica);

        for (move = 1; move <= 9; move++) {
            if (move % 2 != 0) {// zamienia tury co krok
                xo = " X ";
                tablica = Game.putIn(tablica,xo,gamer1);
                move = Game.check(tablica, gamer1, move);

            } else {
                xo = " O ";
                tablica = Game.putIn(tablica,xo, gamer2);
                move = Game.check(tablica, gamer2, move);
            }
        }
        if (move == 10) {
            System.out.println("Remis");
        }
    }
}

