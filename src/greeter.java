import java.util.Scanner;

public class greeter {


    public static void main(String[] args) {

        //an object of scanner named "in " is made and it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);

        //asks the user to input a farenheit temperture
        System.out.println("What is your name? ");
        //takes in the users tempture input into a variable called inputOfTemperture
        String inputOfTemperture = in.nextLine();
        //
        //asks the user to input a farenheit temperture
        System.out.println("Where are you from? ");
        //takes in the users tempture input into a variable called inputOfTemperture
        String inputOforigin = in.nextLine();
        //
        //asks the user to input a farenheit temperture
        System.out.println("How old are you (years)? ");
        //takes in the users tempture input into a variable called inputOfTemperture
        String inputOfage = in.nextLine();

        System.out.println("Hello " + inputOfTemperture + " from " + inputOforigin + ". You are " + inputOfage + " years old.");

        System.out.println("Whats something you like to do? ");
        //takes in the users tempture input into a variable called inputOfTemperture
        String inputOfhobby = in.nextLine();
        System.out.println("Have fun next time you " + inputOfhobby);

        System.out.println("How much would you like to donate today? ");
        //takes in the users tempture input into a variable called inputOfTemperture
        double inputOfdonation = in.nextDouble();
        System.out.println("You will donate $" + inputOfdonation + " today. Yay!");






    }


}

