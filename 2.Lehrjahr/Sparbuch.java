//Bauplanklasse
public class Sparbuch
{
    double ktoStand;
    int ktoNr;
    String name;
    String vorname;



//Methode ohne Rueckgabe
//Datentyp void, bestimmt eine Methode ohne Rueckgabe
    void buchen()
    {
        ktoStand = ktoStand + 50.0;
    }

//Methode mit Rueckgabe
    double zinsenBerechnen()
    {
        double zinsen;
        zinsen = ktoStand * 0.05;
//return gibt den Wert aus.
        return zinsen;
    }
}