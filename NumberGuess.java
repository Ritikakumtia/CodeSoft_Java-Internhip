import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
    public static  void main(String[]args){
        System.out.println("let's start the game with your first guess");
        System.out.println("guess the number between 1 to 100");
        Random r=new Random();
        int random=r.nextInt(100);
        int numberoftimes=0;
        for(int i=0;i<7;i++){
            System.out.println("Enter your guess");
            Scanner sc=new Scanner(System.in);
            int userguess=sc.nextInt();
            numberoftimes++;
            if(userguess==random){
                System.out.println("your guess is right");
                System.out.println("you guess right number in "+numberoftimes + "times");
                break;
            }
            else if(userguess<random){
                System.out.println("it's too low");
            }
            else if(userguess>random){
                System.out.println("it's too high");
            }
            if (i == 6) {
                System.out.println("Sorry, you've used all attempts. The correct number was " + random);
            }
          
        }

        
        }
    }
    

