import java.util.Scanner;
public class BankNeu
{
    public static void main(Sting[]args)
    {
        Sparanlage = meinSa;
        meinSa = new Sparanlage();

        Scanner ein = new Scanner(System.in);

        System.out.println("Bitte geben Sie ihren gewuenschten Anlagegetrag ein.");

        meinSa.anlageBetrag = ein.nextDouble();

        System.out.println("Bitte geben Sie ihre gewuenste Laufzeit an.");

        meinSa.laufzeit = ein.nextInt();

        System.out.println("Wie soll Ihre Anlage verzinst werden.");
        System.out.println("Bitte geben Sie die Nummer der gewuenschten verzinsung an");
        int anlageTyp = ein.nextInt();


        meinSa.zinsSatz = 4;

        meinSa.buchen(anlageBetrag);
        System.out.println("Sparanlage: "+meinSa.anlageBetrag+" Euro");

        if (anlageTyp == 1)
        {
            double zins = meinSa.zinsenBerechen(meinSa.zinsSatz);
            System.out.println("Zinserloese nach einen Jahr "+zins+" Euro."):
        }
        else
        {
            double zins = meinSa.zinsenBerechnen2(meinSa.zinsSatz);
            System.out.println("Zinserloese nach ablauf der Anlagezeit "+zins+" Euro");
        }

    }
}