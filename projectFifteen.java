import java.util.Scanner;
import java.text.NumberFormat;
public class projectFifteen
{
  public static void main (String[] args)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    Scanner scanner = new Scanner( System.in );
    System.out.println("How Many Cookies >> ");
    Double amountOfCookies = Double.parseDouble(scanner.nextLine());

    Double servingSize = amountOfCookies / 48.0;
    Double sugar = 1.5 * servingSize;
    Double butter = 1.0 * servingSize;
    Double flour = 2.75 * servingSize;

    System.out.println("Sugar : "+sugar);
    System.out.println("Butter : "+butter);
    System.out.println("Flour : "+flour);
  }
}
