import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      	System.out.println("Enter value x: ");
        double x = input.nextDouble();
      	System.out.println("Enter value y: ");
      	double y = input.nextDouble();
      	double ans;
      	ans = ((3.0+(4.0*x))/5.0) - ((10.0*(y-5.0))/x) + (9.0*((4.0/x) + ((9+x)/y)));
      	System.out.println(ans);
    }
}
