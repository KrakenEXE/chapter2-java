import java.util.Scanner;
import java.text.NumberFormat;
public class projectSeventeen
{
  public static void main (String[] args)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    Scanner scanner = new Scanner( System.in );

    System.out.println("Name >> ");
    String name = scanner.nextLine();

    System.out.println("Age >> ");
    String age = scanner.nextLine();

    System.out.println("City >> ");
    String city = scanner.nextLine();

    System.out.println("College >> ");
    String college = scanner.nextLine();

    System.out.println("Profession >> ");
    String profession = scanner.nextLine();

    System.out.println("Animal >> ");
    String animal = scanner.nextLine();

    System.out.println("Pet Name >> ");
    String pet = scanner.nextLine();

    System.out.println("There once was a person named "+name+" who lived in "+city+". At the age of "+age+", "+name+" went to college at "+college+". "+name+" graduated and went to work as a "+profession+". Then, "+name+" adopted a(n) "+animal+" named "+pet+". They both lived happily ever after!");
  }
}
