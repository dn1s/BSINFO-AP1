//nutzende Klasse
public class Bank
{
    public static void main (String[]args)
    {
//Objekt erzeugung
        Sparbuch meinSB;
        meinSB = new Sparbuch();

        meinSB.ktoStand = 1000;
        meinSB.ktoNr = 12345;
        meinSB.name = "Wurst";
        meinSB.vorname = "Hans";

//Aufruf der Methode buchen()

        meinSB.buchen;
        System.out.println("Kontostand = "+meinSB.ktoStand+" Euro");

//Aufruf der Methode zinsenberechnen
        meinSB.zinsenBerechnen;
        System.out.println("Zinsen "+meinSB.zinsenBerechnen()+" Euro");
    }
}