import java.util.Scanner;

public class WeaselOrNot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yup, nope;

    System.out.println("Type the word \"weasel\", please.");
    word = keyboard.next();
    yup = word.equals("weasel");
    nope = !word.equals("weasel");

    System.out.println("You typed what was requested: " + yup);
    System.out.println("You ignored polite instructions: " + nope);
  }
}