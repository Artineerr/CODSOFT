import java.lang.Math;
import java.util.Scanner;
public class GFG{
    public static void main(String[] args){
        final int max=100;
        int ans = (int) (Math.random() * max) + 1;
        Scanner obj=new Scanner(System.in);
        System.out.println("\t\t\t *******Welcome to Guess the NUMBER GAME*******\n ");
        System.out.println("Initial You will have 50 points");
        int p=50;
        int guess,tries=5;
        while(tries>0){
            System.out.println("Guess a number Between 1 to 100 : ");
            guess=obj.nextInt();
            if(guess>ans){
                System.out.println("Oops! Your guess is too high, Try again\n");
            }
            else if(guess<ans){
                System.out.println("Oops! Your guess is too low, Try again\n");
            }
            else{
                System.out.println("Congratulation you guessed it\n");
                break;
            }
            tries--;
            p=p-10;
        }
        System.out.println("\t\t*GAME OVER*\n ");
        System.out.print("Correct Answer is : ");
        System.out.println(ans);
        System.out.print("Your Score is : ");
        System.out.println(p);
    }
}