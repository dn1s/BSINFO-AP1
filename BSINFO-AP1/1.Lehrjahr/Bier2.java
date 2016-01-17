import java.util.*;
public class Bier2
{
    public static void main (String[]args)
    {

    System.out.println("Bitte geben Sie die Anzahl der Flaschen an. ");

    Scanner ein = new Scanner(System.in);
    int bier;
    bier = ein.nextInt() % 12;

    System.out.println("Es sind "+bier+" Flaschen uebrig.");
    }
}