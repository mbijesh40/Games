import java.util.*;

public class Rock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String Turn[] = { "rock", "paper", "scissor" };
        int wins = 0;
        int loss = 0;
        int randomNumber = random.nextInt(3);
        System.out.println("Enter your Hand:");
        String Hand = scan.nextLine();

        String computerMove = Turn[randomNumber];

        System.out.println("Your Hand: " + Hand);
        System.out.println("Computer Hand: " + computerMove);
        if (Hand == "rock" && computerMove == "scissor") {
            wins++;
            System.out.println("You Win!");
        } else if (Hand == "paper" && computerMove == "rock") {
            wins++;
            System.out.println("You Win!");
        } else if (Hand == "scissor" && computerMove == "paper") {
            wins++;
            System.out.println("You Lose!");
        } else {
            loss++;
        }
        System.out.println("Rounds Won:" + wins);
        System.out.println("Rounds lost:" + loss);
        if (wins == 3 || loss == 3) {
            System.out.println("Game Over.");
        }
    }
}