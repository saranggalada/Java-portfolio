import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    // Displays message when letters are repeated. To reduce code.
    public static void reguess(String u, StringBuffer ub, char x, char[] b, int c) {
        System.out.println(x + " has already been guessed. Guess another letter.");
        System.out.println((Arrays.toString(b)) + " Lives remaining: " + c);
        System.out.println(" Used = " + u);
    }

    // Main function of the game
    public static void play(String word, int chances) {
        char[] board = new char[chances];
        int i;
        for (i = 0; i < chances; i++) { // Displays Game progress
            board[i] = '-';
        }
        System.out.println((Arrays.toString(board)) + " Lives remaining: " + chances);
        Scanner inp = new Scanner(System.in);
        StringBuffer used = new StringBuffer();
        String used_str = String.valueOf(used);
        while (chances > 0) { // enables Multiple attempts
            System.out.print("Guess a letter: "); // stores user's guess
            char x = inp.next().charAt(0);
            used_str = String.valueOf(used);
            if (word.contains(x + "")) { // If guess is right...
                if (used_str.contains(x + "")) { // If already guessed...
                    reguess(used_str, used, x, board, chances); // ...guess again
                    continue;
                } else {
                    System.out.println("[GOOD GUESS!]"); // Correct guess
                    for (i = 0; i < chances; i++) { // updates progress
                        if (word.charAt(i) == x) {
                            board[i] = x;
                        }
                    }
                    used.append(x);
                }
            } else {
                if (used_str.contains(x + "")) { // If wrong guess...
                    reguess(used_str, used, x, board, chances); // ...and repeated
                    continue;
                } else {
                    System.out.println("[WRONG GUESS!]"); // chance lost
                    chances--;
                    used.append(x);
                }
            }
            if (word.equalsIgnoreCase(String.valueOf(board))) { // If player wins
                System.out.println("You won with " + chances + " guesses remaining! the word was " +
                        word);
                break;
            } else {
                System.out.println((Arrays.toString(board)) + " Lives remaining: " + chances);
                System.out.println(" Used = " + used);
            }
        }
        if (chances == 0) { // If player loses
            System.out.println("Better luck next time :(");
            System.out.println("The word was " + word);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter secretword: ");
        String secret = input.next(); // Stores user's secretword
        play(secret, secret.length());
    }
} // Starts the functioning of the game