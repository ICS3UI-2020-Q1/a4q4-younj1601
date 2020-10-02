import java.util.Scanner;
/**
 *Play fizz buzz with a range of numbers
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //get interger
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    int num = input.nextInt();

    //declare and initialize count
    int count = 0;

    while(count < num){

      //increase value on count by 1
      count = count + 1;

      //divisable by 5 and 3
      if ((count % 5 == 0) && (count % 3 == 0)){
      System.out.println("You should say FizzBuzz");
      //divisable by 3
    } else if ((count % 3 == 0)){
      System.out.println("You should say Fizz");
      //divisable by 5
    } else if ((count % 5 == 0)){
      System.out.println("You should say Buzz");
      //divisable by neither
    } else if ((count % 3 != 0) && (count % 5 != 0)){
      System.out.println("You should say " + count);
    }
      
    }
    
  }
}
