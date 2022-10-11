package BENIM_DOSYALAR.J13_Brek_Continue.L04Break_Continue.HaftaninTaski;

import java.util.Scanner;

public class T03_TasKagitMakas {

    public static void main(String[] args) {
        // Rock > Scissors     Scissors > Paper       Paper > Rock
        // Rock(1)  Scissors(2) Paper(3)
        Scanner scan = new Scanner(System.in);
        int compChoice;
        int playerChoice;
        int numberOfCompWin = 0;
        int numberOfPlayerWin = 0;
        System.out.println("**** Welcome to Game ****");
        do {
            System.out.println("Rock > Scissors & Scissors > Paper & Paper > Rock" +
                    " For Rock(1)  Scissors(2) Paper(3) Exit(0) Please enter your choice 	 ");
            compChoice = (int) (Math.random() * 3 + 1);
            playerChoice = scan.nextInt();
            System.out.println("Computer Choice = " + compChoice);
            System.out.println("Player Choice = " + playerChoice);
            if (playerChoice != 0) {
                if (playerChoice == compChoice) {
                    System.out.println(" Draw ");
                    System.out.println("Score: Player = " + numberOfPlayerWin + " - Computer = " + numberOfCompWin);
                } else if ((playerChoice == 1 && compChoice == 2) || (playerChoice == 2 && compChoice == 3) ||
                        (playerChoice == 3 && compChoice == 1)) {
                    numberOfPlayerWin++;
                    System.out.println(" Player Wins the round ");
                    System.out.println("Score: Player = " + numberOfPlayerWin + " - Computer = " + numberOfCompWin);
                } else if ((compChoice == 1 && playerChoice == 2) || (compChoice == 2 && playerChoice == 3) ||
                        (compChoice == 3 && playerChoice == 1)) {
                    numberOfCompWin++;
                    System.out.println(" Computer Wins the round ");
                    System.out.println("Score: Player = " + numberOfPlayerWin + " - Computer = " + numberOfCompWin);
                } else {
                    System.out.println(("Your input is not coorect You have to input one of the followings 1,2,3 or 0"));
                }
            }
        } while (playerChoice != 0);
        if (numberOfPlayerWin == numberOfCompWin) System.out.println("Tie");
        else if (numberOfPlayerWin > numberOfCompWin) System.out.println("Player is the winner of match");
        else System.out.println("Computer is the winner of match");
        System.out.println("Final Score: Player = " + numberOfPlayerWin + " - Computer = " + numberOfCompWin);
    }
}
