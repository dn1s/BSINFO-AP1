import java.util.*;
public class Rabatt1
{
    public static void main (String[]args)
    {
    Scanner ein = new Scanner(System.in);

    System.out.println("CD Rohlinge werden in Spindeln von je 25 Stück zum Peis von 10.00€ angeboten.");
    System.out.println("Ab einer Bestellung von 100 Rohlingen gibt es 8% Rabatt");
    System.out.println("Ab einer Bestellung von 200 Rohlingen gibt es 15% Rabatt");
    System.out.println("Ab einer Bestellung von 500 Rohlingen gibt es 30% Rabatt");
    System.out.println("Bitte geben sie die gewuenschte Anzahl an Rohlingen an.");

    int menge = ein.nextInt();
    double preis = menge/25*10;
    double preis2= (menge % 25)*0.5;
    double preis3= preis + preis2;

        if (menge>=100)
        {
            double rabatt1=preis3*0.08;
            double preis4= preis3-rabatt1;
            System.out.println("Ihr Preis betraegt "+preis4+ " €.");
        }
        else if (menge>=200)
        {
            double rabatt2=preis3*0.15;
            double preis5= preis3-rabatt2;
            System.out.println("Ihr Preis betraegt "+preis5+ " €.");
        }
        else if (menge>=500)
        {
            double rabatt3=preis3*0.30;
            double preis6= preis3-rabatt3;
            System.out.println("Ihr Preis betraegt "+preis6+ " €.");
        }
        else{

            System.out.println("Ihr Preis betraegt "+preis3+" €.");

        }
    }
}
