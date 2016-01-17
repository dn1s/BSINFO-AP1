import java.util.*;
public class Even
{
    public static void main(String[]args)
    {
    Scanner ein = new Scanner (System.in);

    System.out.println("Bitte geben sie eine ganze Zahl ein.");
    int zahl = ein.nextInt();

    if (zahl % 2 == 0){
    System.out.println("Die Zahl ist gerade.");
    }
    else
    {
    System.out.println("Die eingegeben Zahl ist ungerade.");
    }

    }
}