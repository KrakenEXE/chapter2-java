import java.util.Scanner;
import java.text.NumberFormat;
public class projectEleven
{
  public static void main (String[] args)
  {
    Scanner scanner = new Scanner( System.in );
    System.out.println("Enter the amount of males in class >> ");
    Double menInClass = Double.parseDouble(scanner.nextLine());

    System.out.println("Enter the amount of females in class >> ");
    Double womenInClass = Double.parseDouble(scanner.nextLine());

    Double totalPeople = womenInClass+menInClass;

    Double womenRatio = (womenInClass / totalPeople)*100;
    Double menRatio = (menInClass / totalPeople)*100;

    System.out.println("Total people: "+totalPeople+".\nRation of Men: "+womenRatio+"\nRation of Women: "+menRatio);

  }
}
