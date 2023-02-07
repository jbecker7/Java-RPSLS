import java.util.Scanner;
import java.util.Random;

public class RPSLS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String[] choices = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};

        while (true) {
            System.out.print("Enter your choice: ");
            String playerChoice = sc.nextLine().toLowerCase();

            while (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")
                    && !playerChoice.equals("lizard") && !playerChoice.equals("spock")) {
                System.out.println("Invalid choice, try again!");
                System.out.print("Enter your choice: ");
                playerChoice = sc.nextLine().toLowerCase();
            }

            playerChoice = playerChoice.substring(0, 1).toUpperCase() + playerChoice.substring(1);

            String computerChoice = choices[rnd.nextInt(5)];
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("Rock")) {
                if (computerChoice.equals("Scissors") || computerChoice.equals("Lizard")) {
                    System.out.println("You win! Rock beats " + computerChoice + ".");
                } else {
                    System.out.println("You lose! " + computerChoice + " beats Rock.");
                }
            } else if (playerChoice.equals("Paper")) {
                if (computerChoice.equals("Rock") || computerChoice.equals("Spock")) {
                    System.out.println("You win! Paper covers " + computerChoice + ".");
                } else {
                    System.out.println("You lose! " + computerChoice + " beats Paper.");
                }
            } else if (playerChoice.equals("Scissors")) {
                if (computerChoice.equals("Paper") || computerChoice.equals("Lizard")) {
                    System.out.println("You win! Scissors cuts " + computerChoice + ".");
                } else {
                    System.out.println("You lose! " + computerChoice + " beats Scissors.");
                }
            } else if (playerChoice.equals("Lizard")) {
                if (computerChoice.equals("Spock") || computerChoice.equals("Paper")) {
                    System.out.println("You win! Lizard beats " + computerChoice + ".");
                } else {
                    System.out.println("You lose! " + computerChoice + " beats Lizard.");
                }
            } else if (playerChoice.equals("Spock")) {
                if (computerChoice.equals("Scissors") || computerChoice.equals("Rock")) {
                    System.out.println("You win! Spock beats " + computerChoice + ".");
                } else {
                    System.out.println("You lose! " + computerChoice + " beats Spock.");
                }
            }}}}
