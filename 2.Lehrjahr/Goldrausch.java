import java.util.Scanner;
public class Goldrausch
{
    public static void main(String[]args)
    {
        Scanner eingabe = new Scanner(System.in);
        Gold goldig = new Gold();

        System.out.println("Bitte geben Sie den Grammwert ein");

        double gramm = eingabe.nextDouble();

        System.out.println("Bitte geben Sie den Goldtagespreis ein");

        double goldtagespreis = nextDouble();

        goldig.gramminUnze(gramm);
        double goldwert = goldig.goldwert(goldtagespreis);

        Systen.out.println("Ihr Gold waere "+goldwert+" € wert");
    }
}