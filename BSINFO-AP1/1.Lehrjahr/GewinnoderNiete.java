public class GewinnoderNiete
{
    public static void main (String[]args)
    {
        for(int i=0; i<10; i++){
            int wuerfel = (int)(Math.random()*6+1);

            if(wuerfel==6)
            {
                System.out.println("Gewinner");
            }
            else
            {
                System.out.println("Niete");
            }
        }
    }
}