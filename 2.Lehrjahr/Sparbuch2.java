//Bauplanklasse
public class Sparbuch2
{
    String name;
    String vorname;
    int ktoNummer;
    double ktoStand;


    void buchen(double betrag)
    {
//Wenn Betrag abgehoben werden soll(<0) UND Kontostand kleiner demm absoluten Betrag
        if (betrag <0 && ktoStand < betrag*(-1))
        {
            System.out.println("Buchung nicht moeglich! Ihr guthaben ist zu gering");
        }
        else
        {
            ktoStand = ktoStand - betrag;
            System.out.println("Abbuchung war erfolgreich.");
        }

        double zinsenBerechnen(double zSatz)
        {
            double zinsen = ktoStand*zSatz/100;
            return zinsen;
        }
    }
}