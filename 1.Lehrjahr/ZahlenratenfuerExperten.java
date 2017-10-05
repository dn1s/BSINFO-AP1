import java.util.Scanner;
public class ZahlenratenfuerExperten
{
    public static void main(String[]args)
    {
        Scanner ein = new Scanner(System.in);

        System.out.println("Bitte geben sie den Zahlen spanne an, in dem sie die groesste maximale Zahl angeben");

        int max = ein.nextInt();
        System.out.println("Bitte geben sie eine Zahl zwischen 1 und "+max+" ein.");
        int eingabe;
        int zufallzahl= (int)(Math.random()*max+1);

        boolean user=false;
        int i = 0;

        while (user==false)
        {
            eingabe=ein.nextInt();
            i++;

            if (zufallzahl==eingabe){
                System.out.println("Versuch "+i+" - Dein Tipp? "+eingabe);
                System.out.println("Du hast die Zahl mit "+i+ " Versuche gerraten!");
                user =true;
            }else if (zufallzahl>eingabe) {
                System.out.println("Versuch "+i+" - Dein Tipp? "+eingabe);
                System.out.println("Meine Zahl ist groeßer! ");
                user=false;
            }else{
                System.out.println("Versuch "+i+" - Dein Tipp? "+eingabe);
                System.out.println("Meine Zahl ist kleiner! ");
                user=false;
            }
        }


    }
}





