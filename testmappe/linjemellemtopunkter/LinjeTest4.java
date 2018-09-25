package linjemellemtopunkter;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinjeTest4 {


        /*
    //3. arrange/setup.
    int a = 5;
    int b = 5;

    //2. Act / Execution
    SKSKS sksks = new SKSKS();

    //1 Assert / Verifaction.
    assertEquals(9,sksks.add(5,5));
    */




    @Test
    public void afstandMellemPunkterFakeIT() {
        //3
        Punkt a = new Punkt(3,0);
        Punkt b = new Punkt(0,4);

        //2
        Linje linje = new Linje();

        //1
        assertEquals(5,linje.afstandMellemPunkter(a,b));
    }

    @Test
    public void afstandFakeItFalse(){

        //3
        Punkt a = new Punkt(3,0);
        Punkt b = new Punkt(0,4);

        //2
        Linje linje = new Linje();

        //1.
        assertNotEquals(5,linje.afstandMellemPunkter(a,b));
    }

    @Test
    public void afstandFakeItFalse2(){

        //3
        Punkt a = new Punkt(123123123,123123123);
        Punkt b = new Punkt(812341234,52526341);

        //2
        Linje linje = new Linje();

        //1.
        assertNotEquals(5,linje.afstandMellemPunkter(a,b));
    }


    @Test
    public void afstandNuAendrerViReturn(){

        //3
        Punkt a = new Punkt(3,0);
        Punkt b = new Punkt(0,4);

        //2
        Linje linje = new Linje();

        //1
        assertEquals(5,linje.afstandMellemPunkter(a,b));



    }


    @Test
    public void afstandNuAendrerViReturnFalse(){
        //3
        Punkt a = new Punkt(3,0);
        Punkt b = new Punkt(0,4);

        //2
        Linje linje = new Linje();

        //1
        assertNotEquals(7,linje.afstandMellemPunkter(a,b));



    }


    @Test
    public void afstandNuAendrerViReturnAndreTal(){

        //3
        Punkt a = new Punkt(8,(-2));
        Punkt b = new Punkt(3,9);

        //2
        Linje linje = new Linje();

        //1
        assertEquals(12.083045973594572,linje.afstandMellemPunkter(a,b));



    }


}