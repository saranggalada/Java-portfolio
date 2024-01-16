import java.io.*;
import java.util.*; //uses java.io library

public class Write2TextFile {
    Scanner input = new Scanner(System.in); // creates text file and stores a message
    String s = input.next();
    static String filename = ("NewText.txt");
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            System.out.print("Enter text: ");
            String text = br.readLine();
            System.out.print("Your file is stored in Home/NetbeansProjects/Class11.");
            file.print(text);
            file.close();
        } catch (IOException e) {
            System.out.println("");
            System.err.println(e);
        }
    }
}