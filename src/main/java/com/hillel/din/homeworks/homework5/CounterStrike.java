package com.hillel.din.homeworks.homework5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter team 1 name");
        String str1 = scanner.next();
        System.out.println(str1);


        int team1Player1 = score(scanner, 1);
        int team1Player2 = score(scanner, 2);
        int team1Player3 = score(scanner, 3);
        int team1Player4 = score(scanner, 4);
        int team1Player5 = score(scanner, 5);
        System.out.println("player 1 = " + team1Player1);
        System.out.println("player 2 = " + team1Player2);
        System.out.println("player 3 = " + team1Player3);
        System.out.println("player 4 = " + team1Player4);
        System.out.println("player 5 = " + team1Player5);


        System.out.println("Enter team 2 name");
        String str2 = scanner.next();
        System.out.println(str2);

        int team2Player1 = score(scanner, 1);
        int team2Player2 = score(scanner, 2);
        int team2Player3 = score(scanner, 3);
        int team2Player4 = score(scanner, 4);
        int team2Player5 = score(scanner, 5);
        System.out.println("player 1 = " + team2Player1);
        System.out.println("player 2 = " + team2Player2);
        System.out.println("player 3 = " + team2Player3);
        System.out.println("player 4 = " + team2Player4);
        System.out.println("player 5 = " + team2Player5);


        double avgTeam1 = (double) (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5;
        double avgTeam2 = (double) (team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5;
        System.out.println("Average Team 1 score = " + avgTeam1);
        System.out.println("Average Team 2 score = " + avgTeam2);

        if (avgTeam1 > avgTeam2) {
            System.out.println("Победила команда " + str1 + " набравшая " + avgTeam1 + " очков");
        } else if (avgTeam1 < avgTeam2) {
            System.out.println("Победила команда " + str2 + " набравшая " + avgTeam2 + " очков");
        } else {
            System.out.println("Draw");
        }


    }

    static int score(Scanner scanner, int number) {
        System.out.println("Please enter count frags for player " + number);
        return scanner.nextInt();
    }
}

