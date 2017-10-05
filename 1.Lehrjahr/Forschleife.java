public class Forschleife
{
    public static void main (String [] args)
    {
        //Die Folgende Schleife gibt 4 mal die Sternchen aus.
        // bei den Werten 0,2,4,6
        for ( int sternchen = 0; sternchen <=7; sternchen = sternchen +2 )
        {
            System.out.println("***");
        }

        //Die Folgende Schleife gibt nichts aus, da 10 bereits groesser als das ende ist von kleiner 0 ist,
        for (int sternchen = 10; sternchen < 0; sternchen = sternchen +1)
        {
            System.out.println("**");
        }

    }
}