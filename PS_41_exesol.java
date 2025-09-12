import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputnumber;
    public int noOfGesses = 0;

    public int getNoOfGesses() {
        return noOfGesses;
    }

    public void setNoOfGesses(int noOfGesses) {
        this.noOfGesses = noOfGesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGesses++;
        if (inputnumber == number) {
            System.out.printf("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGesses);
            return true;
        } else if (inputnumber < number) {
            System.out.println("Too low...");
        } else if (inputnumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class PS_41_exesol {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}