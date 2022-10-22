import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    static int pointsplus = 0,pointminus=0;

    public static void main(String[] args) {
         System.out.println("bine ati venit la Quiz");
         intrebarehobby();
        intrebareastronomie();
       intrebarerandom();
      intrebarerandom2();
     puncte();
    }

public static void intrebarehobby() {


    String raspuns = JOptionPane.showInputDialog(null,"Care este jocul preferat al lui Ronaldo " +   "A.Baschet " +   "B.Fotbal"  + " C.Handball" +     "D.Inot");

    switch(raspuns) {

        case "B":
            pointsplus++;
            System.out.println(" Ati raspuns corect ");
            break;

        case "A" :
            pointminus++;
            System.out.println("Nu ati raspuns corect ");
            break;
        case "C" :
            pointminus++;
            System.out.println("Nu ati raspuns corect ");
            break;
        case "D" :
            pointminus++;
            System.out.println("Nu ati raspuns corect ");
            break;}

    }

    public static void intrebareastronomie() {


        String raspuns = JOptionPane.showInputDialog(null,"Cate plante exista"+ "A.10  " + " B.8  " + " C.2  " + "  D.9  " );

        switch(raspuns) {

            case "B":
                pointsplus++;
                System.out.println("ati raspuns corect ");
                break;

            case "A" :
                pointminus++;
                System.out.println("Nu ati raspuns corect ");
                break;
            case "D" :
                pointminus++;
                System.out.println("Nu ati raspuns corect ");
                break;
            case "C" :
                pointminus++;
                System.out.println("Nu ati raspuns corect ");
                break;}

    }

    public static void intrebarerandom(){
    String raspuns = JOptionPane.showInputDialog(null,"Cate mere are ana"+" A. 2 "+"B. 3 "+ "C. 4 " + "D. 5");

    switch(raspuns) {

        case "A":
            pointsplus++;
            System.out.println(" Ati raspuns corect ");
            break;

        case "B" :
            pointminus++;
            System.out.println("Nu ati raspuns corect ");
            break;
        case "C" :
            pointminus++;
            System.out.println("Nu ati raspuns corect ");
            break;
        case "D" :
            pointminus++;
            System.out.println("Nu ati raspuns corect ");
            break;}

}
    public static void intrebarerandom2(){
        String raspuns = JOptionPane.showInputDialog(null,"Cati ani are Mihai "+" A. 12 "+"B. 33 "+ "C. 45 " + "D. 95");

        switch(raspuns) {

            case "D":
                pointsplus++;
                System.out.println(" Ati raspuns corect ");
                break;

            case "A" :
                pointminus++;
                System.out.println("Nu ati raspuns corect ");
                break;
            case "C" :
                pointminus++;
                System.out.println("Nu ati raspuns corect ");
                break;
            case "B" :
                pointminus++;
                System.out.println("Nu ati raspuns corect ");
                break;}

    }

    public static void puncte()
    {
        System.out.print("Numarul de raspunsuri corect =");
        System.out.print(pointsplus);
System.out.print(" \n Numarul de raspunsuri incorecte =");
        System.out.print(pointminus);

        float precent,precent1;

        precent1=(4-pointminus)*25;

        System.out.print("  \nprocentul este de intrebari corecte este  "+ precent1 +"%");

    }
}



