import java.util.Scanner;

public class greeter {


    public static void main(String[] args) {

        //an object of scanner named "in " is made and it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);

        //asks the user to input their name
        System.out.println("What is your name? ");
        //takes in the users name input into a variable called inputOfName
        String inputOfName = in.nextLine();
        //
        //asks the user to input where they are from
        System.out.println("Where are you from? ");
        //takes in the users input into a variable called inputOfOrigin
        String inputOfOrigin = in.nextLine();
        //
        //asks the user to input their age
        System.out.println("How old are you (years)? ");
        //takes in the users age input into a variable called inputOfAge
        String inputOfAge = in.nextLine();
        //prints out a greeter
        System.out.println("Hello " + inputOfName + " from " + inputOfOrigin + ". You are " + inputOfAge + " years old.");
        //asks the user to input their hobby
        System.out.println("Whats something you like to do? ");
        //takes in the users hobby input into a variable called inputOfHobby
        String inputOfHobby = in.nextLine();
        //prints out your hobby
        System.out.println("Have fun next time you " + inputOfHobby);

        System.out.println("How much would you like to donate today? ");
        //takes in the users donation input into a variable called inputOfDonation
        double inputOfDonation = in.nextDouble();
        //prints out your donation amount
        System.out.println("You will donate $" + inputOfDonation + " today. Yay!");


    }


}

