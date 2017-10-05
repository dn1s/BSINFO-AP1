import java.util.*;
public class Hair
{
    public static void main(String[]args)
    {
        Scanner ein = new Scanner(System.in);

        System.out.println("Wir bieten neben schneiden der Haare, auch waschen an.");
        System.out.println("Bitte geben Sie Ihre gewünschten Leistungen an.");

        int schneiden = 18;
        int waschen = 8;
        int beides = waschen + schneiden;

        String a = new String("Haareschneiden");
        String b = new String("Waschen");
        String c = new String("Waschen und schneiden");

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
        else
        {
        System.out.println("Danke fuer die Nachfrage");
        }



    }
}