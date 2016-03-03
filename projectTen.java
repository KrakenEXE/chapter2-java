import java.util.Scanner;
import java.text.NumberFormat;
public class projectTen
{
  public static void main (String[] args)
  {
    Scanner scanner = new Scanner( System.in );
    System.out.println("Enter the first test score >> ");
    Double firstScore = Double.parseDouble(scanner.nextLine());

    System.out.println("Enter the second test score >> ");
    Double secondScore = Double.parseDouble(scanner.nextLine());

    System.out.println("Enter the third test score >> ");
    Double thirdScore = Double.parseDouble(scanner.nextLine());

    Double average = (firstScore+secondScore+thirdScore)/3;

    System.out.println("Your average is "+average);
  }
}
