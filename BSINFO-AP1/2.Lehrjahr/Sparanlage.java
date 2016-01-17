import java.util.Scanner;
public class Sparanlage
{
    double anlageBetrag;
    int laufzeit;
    double zinsSatz;
    double einzahlung;

    void buchen (double anlageBetrag)
    {
        anlageBetrag= anlageBetrag + einzahlung;
    }

    double zinsenBerechnen(double zinsSatz)
    {
        double zinsen;
        zinsen = anlageBetrag * zinsSatz/100;
        return zinsen;
    }

    double zinsenBerechnen2(double zinsSatz)
    {
        for (int i = 0; i < laufzeit; i++)
        {
            double zinsen2;
            zinsen2 = anlageBetrag * zinsSatz/100;
            return zinsen;
        }
    }

}