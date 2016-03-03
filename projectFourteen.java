import java.util.Scanner;
import java.text.NumberFormat;
public class projectFourteen
{
  public static void main (String[] args)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    Double stockAmount = 1000.0*25.20;
    Double commission = stockAmount * 0.02;
    Double totalPrice = stockAmount+commission;

    System.out.println("Stock Price : "+formatter.format(stockAmount));
    System.out.println("Commission Price : "+formatter.format(commission));
    System.out.println("Total Price : "+formatter.format(totalPrice));
  }
}
