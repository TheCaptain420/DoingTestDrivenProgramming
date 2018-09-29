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


        //3.


        //2.

        //1.
    }

    @Test
    public void tes2tOmDenTagerNogetInd() {


        //3.


        //2.

        //1.
    }
}