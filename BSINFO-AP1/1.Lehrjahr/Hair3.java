import java.util.*;
public class Hair3
{
    public static void main(String[]args)
    {
        Scanner ein = new Scanner(System.in);

        System.out.println("Wir bieten neben schneiden der Haare, auch waschen und toenen an.");
        System.out.println("Toenen wird nur im Buendel mit waschen angeboten.");
        System.out.println("Bitte geben Sie Ihre gewünschten Leistungen an.");

        int schneiden = 18;
        int waschen = 8;
        int toenen = 27 + waschen;
        int beides = waschen + schneiden;
        int alles = beides + toenen;

        String a = new String("Haareschneiden");
        String b = new String("Waschen");
        String c = new String("Waschen und schneiden");
        String d = new String("Waschen, schneiden und toenen");
        String e = new String("toenen");

        String leistung;
        leistung = ein.nextLine();

        if(leistung.equals(a))
        {
            System.out.println("Haareschneider kostet "+schneiden+" €");
        }
        else if(leistung.equals(b))
        {
            System.out.println("Haare waschen kostet "+waschen+" €");
        }
        else if(leistung.equals(c))
        {
            System.out.println("Haare schneiden und waschen kostet "+beides+" €");
        }
        else if (leistung.equals(d))
        {
            System.out.println("Waschen,schneiden und toenen kostet" +alles+" €");
        }
        else if(leistung.equals(e))
        {
            System.out.println("Toenen kostet "+toenen+" €");
        }
        else
        {
            System.out.println("Danke fuer die Nachfrage");
        }



    }
}