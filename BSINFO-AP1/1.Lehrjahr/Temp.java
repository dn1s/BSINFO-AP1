import java.util.*;
public class Temp
{
    public static void main(String[]args)
    {
    Scanner ein = new Scanner(System.in);

    System.out.println("Bitte geben sie in welche Temperatureinheit umgerechnet werden soll.");

    String tempe;
    tempe = ein.nextLine();

    String c= new String("Celsius");

    System.out.println("Bitte geben Sie nun die Temperatur an.");
    double grad;
    grad = ein.nextDouble();

        if (tempe.equals(c))
        {
            double celsius = (grad - 32) * 5 / 9;
            System.out.println("Das entspricht "+celsius+" Celsius.");
        }
        else
        {
            double fahrenheit  =(grad*1.8) +32;
            System.out.println("Das entspricht "+fahrenheit+" Fahrenheit.");
        }
    }
}