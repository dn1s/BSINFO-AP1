//nutzende Klasse
public class SparbuchTest
{
    public static void main (Stirng[]args)
    {
//Objekt erzeugung
        Sparbuch2 meinSB;
        meinSB = new Sparbuch2();

//Zuweisung der Eigenschaftswerte

        meinSB.name = "Muster";
        meinSB.ktoNummer = 111;
        meinSB.ktoStand = 900.00;

//Aufruf der Methode buchen (mit zB 100.25)

        meinSB.buchen(100.25);
        System.out.println("Kontostand "+meinSB.ktoStand+" Euro");

//Aufruf der Methode zinsen

        double zins;
        zins = meinSB.zinsenBerechnen(0.03);
        System.out.println("Zinsen auf akt. Kontostand "+zins+" Euro");
    }
}