import java.util.Scanner;

public class SumNaturalNumber {
    
    public static void Natural(int n)
    {
        int sum = 0;
      for(int i=0;i<=n;i++)
      {
        sum = sum + i;
      }
      System.out.println("Sum :" + sum);  
    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = obj.nextInt();
        System.out.println("Natural numbers from 1 to " + n + " : ");
        Natural(n);
        obj.close();
    }
}


