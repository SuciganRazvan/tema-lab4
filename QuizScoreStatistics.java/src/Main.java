import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       quizstudent();








    }
    public static void quizstudent() {

        int student, s1, s2=0, s3=1,s4=0,temp=0,nr=0;
        for (int i = 1; i <= 100; i++) {
            System.out.print("Adaugati numerele");
            Scanner inputDevice = new Scanner(System.in);
            student = inputDevice.nextInt();
            if (student == 99) {
                break;
            } else if (student < 0) {
                System.out.print("Nu se va adauga nimic");


            } else if (student > 10) {
                System.out.print("Nu se va adauga nimic");


            } else {

                s1 =student;
                temp=temp+s1;
                nr++;
                if(s1>s2)
                {

                    s2=s1;

                }
                if(s1<s3)
                {
                    s3=s1;
                }


            }

        }
        s4=temp/nr;
        System.out.print("the highest score e = " +s2 );
        System.out.print(" \n the lower score e = "  +s3 );
        System.out.print("\n Average arithmetis is =" +s4 );
    }
}