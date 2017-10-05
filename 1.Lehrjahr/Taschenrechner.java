import java.util.*;

public class Taschenrechner
{
    public static void main(String[]args)
    {
        double a;
        double b;
        double Summe;
        double Substraktion;
        double Division;
        double Multiplikation;

        Scanner ein = new Scanner (System.in);

        System.out.println ("Bitte geben Sie die Zahlen mit Komma ein.");
        System.out.println ("Erste Zahl bitte");
        a=ein.nextDouble ();
        System.out.println ("Zeite Zahl bitte");
        b=ein.nextDouble ();
        Summe = a + b;
        Substraktion = a - b;
        Division = a / b;
        Multiplikation = a * b;

        System.out.println ("Addition: " + Summe);
        System.out.println ("Substraktion: " + Substraktion);
        System.out.println ("Division: " + Division);
        System.out.println ("Multiplikation: " + Multiplikation);
    }
}