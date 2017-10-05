import java.util.*;
public class Kern
{
    public static void main (String[]args)
    {
        Scanner ein = new Scanner(System.in);

        System.out.println("Sind Sie bereits Kunde bei uns?");
        String kunde = ein.nextLine();
        String j= new String ("Ja");
        System.out.println("Bitte geben sie das Land an ausdem sie Bezahlen");
        String land = ein.nextLine();
        String de = new String("Deutschland");
        String de2 = new String("deutschland");
        String ge = new String("Germany");
        String ge2 = new String("germany");

        if(land.equals(de)|| land.equals(de2) || land.equals(ge) || land.equals(ge2) )
        {
            if(kunde.equals(j))
            {
                System.out.println("Sie erhalten eine Rechnung ueber den vollen Betrag von uns, an ihre hinterlegete Adresse gesendet");
            }
            else
            {
                System.out.println("Bitte geben sie den Betrag der Rechnung ein");
                int betrag = ein.nextInt();

                if(betrag>=25)
                {
                System.out.println("Wir bitten Sie eine Vorrauszahlung per Kreditkarte vorzunehmen");
                System.out.println("Wir halten uns eine Pruefung ihrer Kreditwuerdigkeit vor");
                }
                else
                {
                System.out.println("Bitte zahlen Sie den Betrag per Vorkasse.");
                }
            }
        }
        else
        {
        System.out.println("Bitte beachten sie das eine Zahlung aus dem Ausland momentan noch nicht moeglich ist.");
        System.out.println("Wir bedanken uns fuer ihr Verstaendnis.");
        }
    }
}