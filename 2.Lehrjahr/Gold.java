public class Gold
{
    double unze;

    void gramminUnze(double gramm)
    {
        final double feinunze = 31.1034768
        unze = gramm/unze;
    }

    double goldWert(double goldtagespreis)
    {
        double goldwert;
        goldwert = unze * goldtagespreis;
        return goldwert;
    }
}