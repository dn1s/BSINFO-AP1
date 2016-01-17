import java.util.*;

public class Gehaltsrechner
{
    public static void main(String[]args)
    {
    Scanner ein=new Scanner(System.in);

    System.out.println("Bitte geben sie Ihr Bruttogehalt an");
    double gehalt;
    gehalt = ein.nextDouble();

    System.out.println("Bitte geben sie Ihren Lohnsteuersatz als ganze Zahl an. (e.g. 10)");
    double lohnsteuersatz;
    lohnsteuersatz = ein.nextDouble();

    double prozent;
    prozent = lohnsteuersatz/100;
    double lohnsteueranteil;
    lohnsteueranteil = gehalt*prozent;

    double nettogehalt;
    nettogehalt = gehalt-lohnsteueranteil;

    System.out.println("Sie haben ein Gehalt von "+gehalt+" angegeben.");
    System.out.println("Sie haben einen Lohnsteuersatz von "+lohnsteuersatz+" angegeben");

    System.out.println("  "+gehalt+" €");
    System.out.println("- "+lohnsteueranteil+" €");
    System.out.println("----------");
    System.out.println("  "+nettogehalt+" €");

    }

}