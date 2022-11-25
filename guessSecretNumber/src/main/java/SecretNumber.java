import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        int secretNumber = 3;
        System.out.println("Guess my secret number!");
        Scanner reader = new Scanner(System.in);
        String guess = reader.nextLine();
        int guessNumber = Integer.parseInt(guess);

        if (guessNumber < secretNumber){
            System.out.println("Too low!");

        } else if (guessNumber > secretNumber){
            System.out.println("Too high!");
        } else if (guessNumber == 3){
            System.out.println("Correct!");

        }

    }
}

//Create a program that makes suggestions on what to wear based on information it gathers about the weather.//
// The purpose of this exercise is to give you some practise with logical and conditional operators.//
//Allow your program to collect some descriptive user input about the weather ("rainy", "sunny", "cloudy",
// "snow", etc) and the average temperature for the day (8, 18, 28, etc).//
//Let your program output clothing suggestions depending on a combination of weather conditions and temperature.//
//e.g. if it is both "rainy" and less than 12 degrees, output "wear a waterproof winter coat"//
//Tips/Note: We do not expect you to use arrays/arraylists or loops (of any kind) in these exercises.//
//Please do not copy/paste! It's a terrible habit and will lead to bugs (guaranteed).//