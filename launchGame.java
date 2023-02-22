// basically in this game we create three class named as Guesser , Umpire and Player....
// Guesser - guess the number and gave to the umpire.....
// Player - in this game we take three players and each player guess a number abd gave to the umpire......
//Umpire - now at the stage umpire have two number and they compare the guesser and player number and gave the result
            
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Guesser {
    int guessNum;

    public int guessingNumber()                 // Guesser  guess the number and gave to the umpire
    {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Guesser! Kindly Guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Player {                                  // Player guess the number and when umpire wants they give the number

    int pguessNum;

    public int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player ! Kindly guess the number");
        pguessNum =scan.nextInt();
        return pguessNum;

    }
}

class Umpire {                              // in this they take the number and compare the numbers with guesser and players
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser() {
        Guesser g = new Guesser();                      // Gueseer gives number to umpire
        numFromGuesser = g.guessingNumber();
    }


    public void collectNumFromPlayers()
    {
        Player p1 = new Player();                           // add the players
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1=p1.guessingNumber();                 // player  guess the number and gave to umpire
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
    }
    void  compare()
    {
        if(numFromGuesser==numFromPlayer1){                                             // Umpire check the player 1 guess the number if they guess the number then body execute otherwise not
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){       // it means player 1 gives correct answer and check whether player 2 and player 3 give the same answer if they do so
                System.out.println("All Players Give Correct Number");                // means all the players gives the correct number 
            }
            else if(numFromGuesser==numFromPlayer2){                                    // player 1 and player 2 gives the same answer
                System.out.println("Player 1 and Player 2 Guess Correct Number");
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 1 and Player 3 Guess Correct Number");     // player 1 and player 3 gives same answer
            }
            else{
                System.out.println("Player 1 Guess Correct Number");
            }

           // System.out.println("Player 1 Won the Game");
        }  
        else if (numFromGuesser==numFromPlayer2)                                        //  Umpire check the player 2 guess the number if they guess the number then body execute otherwise not
        {
            if(numFromGuesser==numFromPlayer3){                                         // player 2 and player 3 gives the same number
                System.out.println("Player 2 and Player 3 Guess Correct number");
            }
            else{
                System.out.println("Player 2 Guess Correct Number");
            }
            //323System.out.println("Player 2 won the gasmr"); 
        }    
        else if (numFromGuesser==numFromPlayer3)                                        //  Umpire check the player 3 guess the number if they guess the number then body execute otherwise not
        {
            System.out.println("Player 3 Guess Correct number");
        } 
        else 
        {
            System.out.println("You lost the games");
        } 
    }
    }

    public class launchGame {
       public static void main(String[] args) {
        System.out.println("Game Started");

    Umpire u = new Umpire();
    u.collectNumFromGuesser();
    u.collectNumFromPlayers();
    u.compare();

        
       } 
    }
