import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ghicestenumarul();
    }


    public static void ghicestenumarul()
    {
        Scanner inputDevice=new Scanner(System.in);
        int gasit,k,i;
        int number= 1 + (int)(100 *Math.random());
        System.out.println("adugati nr de incercari ");
        k= inputDevice.nextInt();
        for(i=0;i<=k;i++)
        {
            System.out.println("Introduceti numarul ");
            gasit= inputDevice.nextInt();
            if(gasit==number)
            {
                System.out.println("Ati ghicit numarul");
                break;
            }
            else if(gasit>number)
            {
                System.out.println("Numarul dvs este mai mare  ");


            } else if(gasit < number)
                System.out.println("Numarul dvs este mai  mic");
            if (i == k) {
                System.out.println(
                        "JOCUL S-A TERMINAT NU ATI GHICIT NUMARUL ,NUMARUL ALES ERA  " + number);
            }

        }


    }}