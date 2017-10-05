/*Bitte Testen ob der jeweils richtige Bonus ausgegeben wird.Aufgabe 9: Teil1 "Neukunde" und Teil2 "Altkunde"*/
import java.util.Scanner;

public class Bonuskartegewaehren
{
    public static void main (String[]args)
    {
        Scanner ein= new Scanner(System.in);

        //Abfrage ob es ein neu Kunde ist.

        System.out.println("Bitte geben sie Neukunde an, wenn der Kunde neu ist.");
        String neu= ein.nextLine();
        String nKunde= new String("Neukunde");

        //Umsatz abfragen der Kunden.

        System.out.println("Bitte geben die den Jahresumsatz des Kunden an.");
        double umsatz = ein.nextDouble();

        double stand= 0.02;
        double plus= 0.03;
        double vip= 0.05;

        double bonus1=umsatz*stand;
        double bonus2=umsatz*plus;
        double bonus3=umsatz*vip;

        //Pruefung ob es ein neu Kunde oder Bestandskunde ist.

        if(neu.equals(nKunde))
        {


            if (umsatz < 500) {
                System.out.println("Der Kunde erhaelt eine Standart-Kundenkarte");
                System.out.println("Der Kunde erhaelt zusatzlich noch einen Einkaufsgutschein in hoehe von "+bonus1+" €");
            } else if (umsatz >= 500 && umsatz < 1000) {
                System.out.println("Der Kunde erhaelt eine Plus-Kundenkarte");
                System.out.println("Der Kunde erhaelt zusatzlich noch einen Einkaufsgutschein in hoehe von "+bonus2+" €");
            }else{
                System.out.println("Der Kunde erhaelt eine VIP-Kundenkarte");
                System.out.println("Der Kunde erhaelt zusatzlich noch einen Einkaufsgutschein in hoehe von "+bonus3+" €");
            }
        }
        else
        {
            System.out.println("Bitte geben sie den letzt jaehrigen Umsatz des Kunden an.");
            double umsatzlj = ein.nextDouble();

            double bonus4=umsatzlj*stand;
            double bonus5=umsatzlj*plus;
            double bonus6=umsatzlj*vip;

            if(umsatzlj <500)
            {
                System.out.println("Der Kunde besitzt eine Standart-Kundenkarte");

                if(umsatz>=500 && umsatz <1000){
                    System.out.println("Der Kunde erhaelt jetzt eine Plus-Kundenkarte.");
                    System.out.println("Der Kunde erhaelt zusatzlich noch einen Einkaufsgutschein in hoehe von "+bonus2+" €");
                }
                else if (umsatz >=1000){
                    System.out.println("Der Kunde erhaelt jetzt eine VIP-Kundenkarte.");
                    System.out.println("Der Kunde erhaelt zusatzlich noch einen Einkaufsgutschein in hoehe von "+bonus3+" €");
                }else{
                    System.out.println("Der Kunde wird leider nicht hochgestuft");
                    System.out.println("Der Kunde erhaelt zusatzlich noch einen Einkaufsgutschein in hoehe von "+bonus1+" €");
                }
            }
            else if(umsatzlj>500 && umsatzlj <1000)
            {
                System.out.println("Der Kunde besitz eine Plus-Kundenkarte");

                if(umsatz<500)
                {
                    System.out.println("Der Kunde wird herabgestuft auf eine Standart-Kundenkarte");
                    System.out.println("Der Kunde erhaelt fuer das abgelaufen ja eine Gutscheinkarte im Wert von "+bonus5+" €");
                }
                else if(umsatz>=1000)
                {
                    System.out.println("Der Kunde wird heraufgestuft auf eine VIP-Kundenkarte");
                    System.out.println("Der Kunde erhaelt zusatzlich noch einen Einkaufsgutschein in hoehe von "+bonus3+" €");
                }
                else
                {
                    System.out.println("Der Kunde bleibt bei der Plus mitgliedschaft.");
                    System.out.println("Der Kunde erhaelt zusatzlich noch einen Einkaufsgutschein in hoehe von "+bonus2+" €");
                }

            }
            else
            {
                System.out.println("Der Kunde besitzt eine VIP-Kundenkarte");

                if(umsatz<500)
                {
                    System.out.println("Der Kunde wird herabgestuft auf eine Standart-Kundenkarte");
                    System.out.println("Der Kunde erhaelt fuer das abgelaufene ja eine Gutscheinkarte im Wert von "+bonus6+" €");
                }
                else if(umsatz>=500 && umsatz<1000)
                {
                    System.out.println("Der Kunde wird herabgestuft auf eine Plus-Kundenkarte");
                    System.out.println("Der Kunde erhaelt fuer das abgelaufene Jahr eine Gutscheinkarte im Wert von "+bonus6+" €");
                }
                else
                {
                    System.out.println("Der Kunde bleibt bei der VIP-Kundenkarte.");
                    System.out.println("Der Kunde erhaelt fuer das abgelaufene Jahr eine Gutscheinkarte im Wert von"+bonus3+" €");
                }

            }

        }
    }
}
