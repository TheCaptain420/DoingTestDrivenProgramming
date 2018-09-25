package linjemellemtopunkter;

public class Linje {
    public double afstandMellemPunkter(Punkt a, Punkt b){
        int apa = a.getA();
        int apb = a.getB();

        int bpa = b.getA();
        int bpb = b.getB();

        return Math.sqrt(Math.pow((bpa-apa),2)+Math.pow((bpb-apb),2));
    }


}
