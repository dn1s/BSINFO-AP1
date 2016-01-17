public class WuerfelPro
{
    public static void main (String [] args)
    {
    int wuerfel1= (int)(Math.random()*6+1);
    int wuerfel2=(int)(Math.random()*6+1);

        if (wuerfel1==wuerfel2)
        {
            System.out.println("Gewonnen!");
            System.out.println("Sie hatten einen "+wuerfel1+ "er Pasch.");
        }
        else
        {
            System.out.println("Niete!");
        }

    }
}