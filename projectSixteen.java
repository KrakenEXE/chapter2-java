import java.util.Scanner;
import java.text.NumberFormat;
public class projectSixteen
{
  public static void main (String[] args)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    Double customersOfEngery = (15000.0 *0.18);
    Double citrusDrinkCustomers = customersOfEngery* 0.58;

    System.out.println("Customers of energy drinks : "+customersOfEngery);
    System.out.println("Customers of cirtus energy drinks: "+citrusDrinkCustomers);
  }
}
