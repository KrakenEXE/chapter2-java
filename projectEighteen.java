import java.util.Scanner;
import java.text.NumberFormat;
public class projectEighteen
{
  public static void main (String[] args)
  {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    Double originalStockAmount = 1000.0;
    Double originalStockPrice = 32.87;
    Double originalStockCommission = (originalStockPrice*originalStockAmount)* 0.02;
    Double originalTotalStockPrice = originalStockPrice*originalStockAmount;

    Double afterStockAmount = 1000.0;
    Double afterStockPrice = 33.92;
    Double afterStockCommission = (afterStockPrice*afterStockAmount)* 0.02;
    Double afterStockTotalPrice = afterStockPrice*afterStockAmount;

    Double profit = ((originalTotalStockPrice - originalStockCommission) - (afterStockTotalPrice - afterStockCommission));

    System.out.println("Amount Paid for Stock : "+formatter.format(originalTotalStockPrice));
    System.out.println("Initial Broker Payment : "+formatter.format(originalStockCommission));
    System.out.println("Amount stock sold for : "+formatter.format(afterStockTotalPrice));
    System.out.println("After stock was sold Comission : "+formatter.format(afterStockCommission));
    System.out.println("Amount of Profit : "+formatter.format(profit));
  }
}
