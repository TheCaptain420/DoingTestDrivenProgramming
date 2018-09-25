package linjemellemtopunkter;

import org.junit.Test;

import static org.junit.Assert.*;

public class PunktTest {

    @Test
    public void harFaaetEtAPunkt() {
        //3.
        int ap = 3;
        int bp = 0;

        //2.
        Punkt a = new Punkt(ap,bp);
        //1.
        assertTrue(a.getA()==ap);
    }

    @Test
    public void harDenFaaetEtBPunkt() {

        //3.
        int ap = 3;
        int bp = 0;

        //2.
        Punkt a = new Punkt(ap,bp);

        //1.
        assertTrue(a.getB()==bp);


    }
}