import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class players {
    String name;
    int score;
}

class GameEngine {
    public int input(String name, Scanner sc) {

        int chance = 1;
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        System.out.println("Hi " + name + " choose a number");

        int choice = MainGame.safeInput(sc);

        while (choice != num) {

            if (choice > num) {
                System.out.println("Lower number please");   
            } 
            else if (choice < num) {
                System.out.println("Higher number please");
            }
            chance++;
            choice = MainGame.safeInput(sc);

        }
        System.out.println("you choose the right number");
        return chance;
    }
}

class ScoreCar {
    void display(players[] res) {
        int min = res[0].score;
        for (int i = 1; i < res.length; i++) {
            if (min > res[i].score) {
                min = res[i].score;
            }
        }
        System.out.println("---SCORECARD---");
        for (int j = 0; j < res.length; j++) {
            System.out.println(res[j].name + " has scored " + res[j].score);
        }
        if(res.length != 1){
            System.out.println("Winner(s):");
            for (int j = 0; j < res.length; j++) {
                if (min == res[j].score) {
                    System.out.println(res[j].name);
                }
            }
        }
    }
}

public class MainGame {

    static int safeInput(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("!!Enter numeric value only!!");
                sc.next(); // consumes the bad input received from the user
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the numbers of player");

            int n = safeInput(sc);

            GameEngine pr = new GameEngine();
            
                players prs[] = new players[n];
                for (int i = 0; i < n; i++) {
                    prs[i] = new players();
                    System.out.print("Enter your name: ");

                    try {
                        prs[i].name = sc.next();
                    } catch (Exception e) {
                        System.out.println("Something went wrong.. Sorry for the inconvenience");
                    }

                    prs[i].score = pr.input(prs[i].name, sc);
                }
                ScoreCar ch = new ScoreCar();
                ch.display(prs);
        }
    }
}

