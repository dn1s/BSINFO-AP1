import java.util.*;
public class Sockenarray
{
    public static void main (String[]args)
    {
        Scanner ein =new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Tag ein.");

        String tag=ein.nextLine();

        String [] schrank = new String[7];

        schrank[0] = "rote Socken";
        schrank[1] = "gruene Socken";
        schrank[2] = "blaue Socken";
        schrank[3] = "graue Socken";
        schrank[4] = "pinke Socken";
        schrank[5] = "schwarze Socken";
        schrank[6] = "weisse Socken";

        switch (tag) {
            case "Montag":{
            System.out.println("Heute werden " + schrank[0] + " getragen");
            break;}
            case "Dienstag":{
            System.out.println("Heute werden " + schrank[1] + " getragen");
            break;}
            case "Mittwoch":{
            System.out.println("Heute werden " + schrank[2] + " getragen");
            break;}
            case "Donnerstag":{
            System.out.println("Heute werden " + schrank[3] + " getragen");
            break;}
            case "Freitag":{
            System.out.println("Heute werden " + schrank[4] + " getragen");
            break;}
            case "Samstag":{
            System.out.println("Heute werden " + schrank[5] + " getragen");
            break;}
            case "Sonntag":{
            System.out.println("Heute werden " + schrank[6] + " getragen");
            break;}
            default:{
            System.out.println("Bitte geben Sie einen Tag ein.");
            break;}

        }
    }
}