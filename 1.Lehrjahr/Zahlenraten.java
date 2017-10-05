import java.util.*;

public class Zahlenraten
{
    public static void main(String[]args)
    {
        Scanner ein=new Scanner(System.in);

        System.out.println("");
        System.out.println("Bitte geben sie eine Zahl zwischen 1 und 10 ein.");
        System.out.println("");

        int eingabe;
        int zufallzahl= (int)(Math.random()*10+1);

        boolean user=false;
        int i = 0;

        while (user==false){
            eingabe=ein.nextInt();
            i++;

            if (zufallzahl==eingabe){
                System.out.println("richtig geraten!");
                System.out.println("Du hast "+i+ "versuche gebraucht!");
                user =true;
            }else {
                System.out.println("Falsch geraten!");
                user=false;
            }
        }
    }
}