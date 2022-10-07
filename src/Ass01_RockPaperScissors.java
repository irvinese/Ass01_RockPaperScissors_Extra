import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {

        do {
            System.out.println("hello Class");
        }while(false);

        Scanner scanner = new Scanner(System.in);
        String playerA;
        String playerB;
        String userResp;
        boolean done = false;

        do {
            while (true) {
                System.out.println("Player A, please enter R, P, or S");
                playerA = scanner.nextLine();
                if (playerA.equalsIgnoreCase("r") || playerA.equalsIgnoreCase("p") || playerA.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println("Please enter P, R, or S; not:" + playerA);

            }

            while (true) {
                System.out.println("Player B, please enter R, P, or S");
                playerB = scanner.nextLine();
                if (playerB.equalsIgnoreCase("r") || playerB.equalsIgnoreCase("p") || playerB.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println("need to enter P, R, or S: you entered" + playerB);
            }

            if (playerA.equals(playerB)) {
                System.out.println("Draw");

            } else if (playerA.equals("P")) {
                if (playerB.equals("R")) {
                    System.out.println("player A wins");
                } else if (playerB.equals("S")) {
                    System.out.println("Player B wins");
                }
            } else if (playerA.equals("R")) {
                if (playerB.equals("P")) {
                    System.out.println("Player B wins");
                } else if (playerB.equals("S")) {
                    System.out.println("player A wins");

                }
            } else if (playerA.equals("S")) {
                if (playerB.equals("P")) {
                    System.out.println("Player A wins");
                } else if (playerB.equals("R")) {
                    System.out.println("Player B wins");
                }
            }

            System.out.println("Do you want to play again [Y/N]");
            userResp = scanner.nextLine(); //recive a string input from the user
            if (userResp.equalsIgnoreCase("N")) {
                done = true;
            }

        }while(!done);

    }
}
