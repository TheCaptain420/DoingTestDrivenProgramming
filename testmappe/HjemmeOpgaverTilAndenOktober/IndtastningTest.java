package HjemmeOpgaverTilAndenOktober;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.Scanner;

import static org.junit.Assert.*;

public class IndtastningTest {


    @Test
    public void testOmDenTagerNogetInd() {



        //Hmmm man kan ikke bruge scanner i UnitTests;D
        //Derfor gør jeg det bare uden....



        //2.
        Indtastning indtastning = new Indtastning();


        //1.
        assertNotEquals(null,indtastning.HentTal(5));
    }



    @Test
    public void testOmDenReturnerTal() {

        //Det kan man så ikke på den måde som jeg ønsket mig... hmmm
        //Det her går godt:D


        //3.


        //2.
        Indtastning indtastning = new Indtastning();
        double tal = indtastning.HentTal(5);

        assertSame(Double.class, ((Object) indtastning.HentTal(5)));
        //1.
        //assertEquals(Double.TYPE,indtastning.HentTal(5));
    }

    @Test
    public void testOmDenGoerNogetVedTallet() {


        //3.
        double tal1 =5;
        double tal2 =5;

        //2.
        Indtastning indtastning = new Indtastning();


        //1.
        assertNotEquals(tal2,indtastning.HentTal(tal1));


    }


    @Test
    public void TestForAtSeOmDetVirker(){
       //Den må man nok hellere have med.

        //3.
        double foer = 33;
        double efter = (33*0.20);

        //2.
        Indtastning indtastning = new Indtastning();

        //1.
        assertEquals(efter,indtastning.HentTal(foer),0.0001);



    }


}