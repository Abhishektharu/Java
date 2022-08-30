import java.util.Scanner;

public class game {
    public  static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int guess = 0;
        do{
            System.out.println("Guess number between (1 - 100): ");
            guess = scan.nextInt();

            if (guess == myNum) {
                System.out.println("You won !!");
                break;
            } else if (guess > myNum) {
                System.out.println("Sorry too high guess.");
            }
            else{
                System.out.println("Sorry too low guess.");
            }
        }
        while (guess >= 0);
        System.out.println("The guess was " + myNum);
    }
}
