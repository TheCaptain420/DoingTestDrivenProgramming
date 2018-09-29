import HjemmeOpgaverTilAndenOktober.Indtastning;
import linjemellemtopunkter.Linje;
import linjemellemtopunkter.Punkt;

public class Main {
    /*
    //3. arrange/setup.
    int a = 5;
    int b = 5;

    //2. Act / Execution
    SKSKS sksks = new SKSKS();

    //1 Assert / Verifaction.
    assertEquals(9,sksks.add(5,5));
    */
    public static void main(String[] args) {
        System.out.println("Dab on them haters |┬┴┬┴┤ ͜ʖ ͡°) ├┬┴┬┴|");



        //3
        Punkt a = new Punkt(8,(-2));
        Punkt b = new Punkt(3,9);

        //2
        Linje linje = new Linje();

        //1
        System.out.println(linje.afstandMellemPunkter(a,b));



    }
}
