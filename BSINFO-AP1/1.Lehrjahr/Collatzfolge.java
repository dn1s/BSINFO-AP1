import java.util.Scanner;
public class Collatzfolge
{
    public static void main (String[]args)
    {
    Scanner ein=new Scanner(System.in);

    System.out.println("Bitte geben sie eine Zahl ein.");
    long eingabe=ein.nextLong();

        while(eingabe>1)
        {
            if(eingabe%2==0)
            {
                eingabe = eingabe/2;
                System.out.println(eingabe);
            }
            else
            {
                eingabe=3*eingabe+1;
                System.out.println(eingabe);
            }
        }System.out.println("Fertig");

    }
}