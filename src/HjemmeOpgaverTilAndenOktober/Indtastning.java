package HjemmeOpgaverTilAndenOktober;



/*
* Du skrev vi bare skulle lave opgaver med TDD, men linkede ikke til nogen,
* så håber at det vi bare skulle vælge en tilfældig en fra nettet.?
*
*
* Det kommer til at være et program det udregner momsen af et beløb ..
*
*
* Klassen her kommer til at omhandel beløbet, som den evt bruger indtaster
*
*@Mads Nielsen
* */


import java.util.Scanner;

public class Indtastning {


    public double HentTal(double tal){
       //Sådan her skulle den have haft set ud.
        /*Scanner scanner = new Scanner(System.in);
        MomsRegner momsRegner = new MomsRegner();

        double text = scanner.nextDouble();
        double textafter = momsRegner.momsReturnerTal(text);
        */

        MomsRegner momsRegner = new MomsRegner();
        //Her skulle scanner have haft været istedet for parameteret.

        return momsRegner.momsReturnerTal(tal);
    }

    //Skal lave den her metode før jeg laver test klassen eller virker intellij+junit ikke.
    //så ignore den:D
    public void test(){

    }
}
