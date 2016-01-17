public class Menschaergerdichnicht
{
    public static void main (String[]args)
    {
        System.out.println(" ");
        System.out.println(" Gehe folgende Felder vor: ");
        System.out.println(" ");

        boolean ergebnis;
        int i= 0;

        do
        {
            i++;

            int wuerfel = (int)(Math.random()*6+1);

            if (wuerfel == 6){
                System.out.println(wuerfel);
                ergebnis = true;
            }
            else{
                System.out.println(wuerfel);
                ergebnis= false;

            }
        }while (ergebnis == true);

        System.out.println("Du hast "+i+" mal gewuerfelt.");
    }

}