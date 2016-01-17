import java.util.*;

public class Temperaturrechner
{
    public static void main(String[]args)
    {
        Scanner ein = new Scanner(System.in);
        System.out.println("Wie heisen Sie?");

        String name;
        name=ein.next();
        System.out.println("Hallo "+ name +", viel spass beim Umrechnen der Temperatur.");
        System.out.println("Bitte geben sie einen Wert ein, den Du Umrechnen wollen.");


        double grad;
        grad=ein.nextDouble();

        System.out.println("Bitte geben Sie die Temperatur in Grad Celsius oder Grad Fahrenheit an.");

        double celsius  =(grad*1.8) +32;
        double fahrenheit = (grad -32)*5/9;

        System.out.println("Ihr wert ergint in Fahrenheit " +celsius +" Grad.");
        System.out.println("Ihr wert ergibt in Celsius " + fahrenheit +" Grad.");





    }
}


