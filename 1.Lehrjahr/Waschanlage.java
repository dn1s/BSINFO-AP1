import java.util.*;
public class Waschanlage
{
    public static void main(String[]args)
    {
        Scanner ein= new Scanner(System.in);
        System.out.println("Bitte geben sie die Hoehe ihres Fahrzeuges in cm an");
        int zahl=ein.nextInt();
        if (zahl >= 260)
        {
            System.out.println("Bitte fahren sie nicht rein!");
        }
        else
        {
            System.out.println("Bitte fahren sie rein");
        }
    }
}