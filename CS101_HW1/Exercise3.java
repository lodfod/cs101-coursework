import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter amount to convert: ");
    double originalValue = input.nextDouble();
    System.out.println("Enter 1 for Dollar --> Euro or 2 for Euro --> Dollar: ");
    int con = input.nextInt();
    double rate = 0;
    String currency1 = "";
    String currency2 = "";
    String sign1 = "";
    String sign2 = "";
    switch(con) {
      case 1 : rate = 0.9; currency1 = "Dollars"; currency2 = "Euros"; break;
      case 2 : rate = 1/0.9; currency1 = "Euros"; currency2 = "Dollars"; break;
    }
    switch(currency2) {
      case "Euros" : sign1 = "$"; sign2 = "€"; break;
      case "Dollars" : sign1 = "€"; sign2 = "$"; break;
    }
    double finalValue = originalValue * rate;
    System.out.print("You entered ");
    System.out.printf(sign1+"%.2f", originalValue);
    System.out.print(" in " +currency1+", and your converted value is ");
    System.out.printf(sign2+"%.2f", finalValue);
    System.out.println(" in "+currency2+".");
      
  }
}