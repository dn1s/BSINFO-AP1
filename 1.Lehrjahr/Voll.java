import java.util.*;

public class Voll
{
    public static void main(String[] args)
    {
        System.out.println("Bitte geben Sie ihr Alter ein.");

        Scanner ein = new Scanner(System.in);
        int alter;
        alter = ein.nextInt();

        if (alter >= 18)
        {
            System.out.println("Sie sind Volljaehrig.");
        }
        else
        {
            System.out.println("Du bist noch nicht Volljeahrig.");
        }
    }
}