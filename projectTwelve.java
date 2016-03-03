import java.util.Scanner;
import java.text.NumberFormat;
public class projectTwelve
{
  public static void main (String[] args)
  {
    Scanner scanner = new Scanner( System.in );
    System.out.print("Enter a name of a city >> ");
    String city = scanner.nextLine();

    int length = city.length( );

    System.out.println("Number of characters "+length);
    System.out.println(city.toUpperCase());
    System.out.println(city.toLowerCase());
    System.out.println(city.substring(0, 1));
  }
}
