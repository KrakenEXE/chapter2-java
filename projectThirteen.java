import java.util.Scanner;
import java.text.NumberFormat;
public class projectThirteen
{
  public static void main (String[] args)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    Scanner scanner = new Scanner( System.in );
    System.out.println("Bill price >> ");
    Double billPrice = Double.parseDouble(scanner.nextLine());

    Double tax = billPrice * 0.075;
    Double tip = (tax+billPrice) * 0.18;
    Double totalPrice = tax+tip+billPrice;

    System.out.println("Original Bill : "+formatter.format(billPrice));
    System.out.println("Tax on Bill : "+formatter.format(tax));
    System.out.println("Tip on Bill : "+formatter.format(tip));
    System.out.println("Total Bill : "+formatter.format(totalPrice));
  }
}
