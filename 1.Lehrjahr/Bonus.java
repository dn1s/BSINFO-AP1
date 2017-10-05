import java.util.Scanner;

public class Bonus
{
    public static void main (String[]atgs)
    {
    Scanner ein= new Scanner(System.in);

    System.out.println("Bitte geben sie ihre Position im Betrieb an.");
    String position = ein.nextLine();
    String ausgeschlossen = new String("Geschaeftsfuehrung");

      if(position.equals(ausgeschlossen))
      {
        System.out.println("Teile der Geschaeftsfuehrung, sind leider ausgeschlossen.");
      }
      else
      {
        System.out.println("Bitte geben sie ihr alt an.");
        int alter = ein.nextInt();

        System.out.println("Bitte geben sie die Dauer ihrer Betriebsangehoerigkeit an.");
        int dauer = ein.nextInt();

        int bonus1 = 50;
        int bonus2 = 500;
        int bonus3 = 550;

        if (alter >=35 && dauer <25)
        {
            System.out.println("Sie erhalten einen Bonus von "+bonus1+" €");
        }
        else if (alter >=35 && dauer>=25)
        {
            System.out.println("Sie erhalten einen Bonus von "+bonus3+" €");
        }
        else
        {
            System.out.println("Leider sind sie nicht fuer den Bonus qualifiziert.");
        }
      }
    }
}
