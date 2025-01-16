import java.util.Random;
import java.util.Scanner;
class NumberGuessGame{
    public static void main(String args[]){
        Random rand=new Random();
        int randomNumber=rand.nextInt(100)+1;
        int tryCount=0;
        while(true){
        System.out.println("Enter the Guess(1-100)");
        Scanner sc=new Scanner(System.in);
        int playerGuess=sc.nextInt();
        tryCount++;
        if(playerGuess==randomNumber)
        {
            System.out.println("Correct! You Win :)");
            System.out.println("It took you "+tryCount+" tries");
            break;
        }
        else if(randomNumber>playerGuess)
        {
            System.out.println("oops! The number is Higher.Guess again");
        }
        else{
            System.out.println("oops! The number is Lower.Guess again");
        }
   }
 }
}