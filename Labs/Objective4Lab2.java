import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.
      System.out.println("Please enter the first whole number you want to add");
      num1 = keyboard.nextInt();
      System.out.println("Please enter the second whole number you want to add");
      num2 = keyboard.nextInt();
      System.out.println("Please enter the third whole number you want to add");
      num3 = keyboard.nextInt();
      System.out.println("Please enter the first decimal number you want to add");
      dub1 = keyboard.nextDouble();
      System.out.println("Please enter the second decimal number you want to add");
      dub2 = keyboard.nextDouble();
      System.out.println("Please enter the third decimal number you want to add");
      dub3 = keyboard.nextDouble();

      int intSum = num1 + num2 + num3;
      double dubSum = dub1 + dub2 + num3;

      System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + intSum);
      System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubSum);
    


  }
}
