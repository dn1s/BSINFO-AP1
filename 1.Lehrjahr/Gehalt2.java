import java.util.*;

public class Gehalt2
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


        double pflegeversicherung;
        pflegeversicherung = 1.15/100;
        double rentenversicherung;
        rentenversicherung = 9.45/100;
        double arbeitslosenversicherung;
        arbeitslosenversicherung = 1.5/100;
        double krankenversicherung;
        krankenversicherung=8.2/100;

        double pver;
        pver = gehalt*pflegeversicherung;
        double rver;
        rver = gehalt*rentenversicherung;
        double arver;
        arver = gehalt*arbeitslosenversicherung;
        double krver;
        krver = gehalt*krankenversicherung;

        double sozialversicherungskosten;
        sozialversicherungskosten =pver+rver+arver+krver;

        double nettogehalt;
        nettogehalt = gehalt-lohnsteueranteil-sozialversicherungskosten;

        System.out.println("Sie haben ein Gehalt von "+gehalt+" angegeben.");
        System.out.println("Sie haben einen Lohnsteuersatz von "+lohnsteuersatz+" angegeben");

        System.out.println("  "+gehalt+" €");
        System.out.println("- "+lohnsteueranteil+" €");
        System.out.println("- "+pver+" € Pflegeversicherungbeitrag");
        System.out.println("- "+rver+" € Rentenversicherungbeitrag");
        System.out.println("- "+arver+" € Arbeitslosenverischungsbeitrag");
        System.out.println("- "+krver+" € Krankenversicherungsbeitrag");
        System.out.println("---------------------------------");
        System.out.println("  "+nettogehalt+" € betaegt ihr Nettogehalt");

    }

}