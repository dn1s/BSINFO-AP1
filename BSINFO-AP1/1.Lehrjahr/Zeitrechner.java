import java.util.*;

public class Zeitrechner
{
    public static void main (String[]args)
    {
        System.out.println("Bitte geben Sie an Wie viele Sekunden ");
        Scanner ein= new Scanner(System.in);

        int sec;
        sec= ein.nextInt();

        int tage;
        tage= sec/ (60*60*24);
        int restsec;
        restsec= sec % (60*60*24);
        int h;
        h=restsec/ (60*60);
        restsec = sec % (60*60);
        int min;
        min=restsec/60;
        restsec = sec % 60;

        System.out.println("Es sind "+tage+"Tage, "+h+ " Stunden, "+min+" Minuten, "+restsec+" Sekunden.");
    }
}