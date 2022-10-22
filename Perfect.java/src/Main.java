import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inputDevice=new Scanner(System.in);
            int n;
         System.out.println("Adaugati numarul dvs");
           n= inputDevice.nextInt();
         perfect(n);

    }
    public static void  perfect(int a2)
    {
        int s=0;
      for(int i=1;i<=a2/2;i++)
      {
          if(a2%i==0)
          {
              s = i + s;
          }

      }
      if(s==a2)
      {
          System.out.println("Numarul este perfect");
      }
      else
      {
          System.out.println("Numarul  nu este perfect");
      }

    }

}