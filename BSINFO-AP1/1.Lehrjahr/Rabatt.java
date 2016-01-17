import java.util.*;

public class Rabatt
{
    public static void main(String[]args)
    {
    Scanner ein = new Scanner(System.in);
    System.out.println("Ab einer Bestellung von 100 Rohlingen gibt es 8% Rabatt");
    System.out.println("Ab einer Bestellung von 200 Rohlingen gibt es 15% Rabatt");
    System.out.println("Ab einer Bestellung von 500 Rohlingen gibt es 30% Rabatt");
    System.out.println("Bitte geben sie die gewuenschte Anzahl an Rohlingen an.");

    int menge=ein.nextInt();
    double preis=menge*0.5;

        if (menge>=100)
        {
        double rabatt1=preis*0.08;
        double preis2= preis-rabatt1;
        System.out.println("Ihr Preis betraegt "+preis2+ " €.");
        }
        else if (menge>=200)
        {
        double rabatt2=preis*0.15;
        double preis3= preis-rabatt2;
        System.out.println("Ihr Preis betraegt "+preis3+ " €.");
        }
        else if (menge>=500)
        {
        double rabatt3=preis*0.30;
        double preis4= preis-rabatt3;
        System.out.println("Ihr Preis betraegt "+preis4+ " €.");
        }
        else{

        System.out.println("Ihr Preis betraegt "+preis+" €.");

        }
    }
}