package ba.unsa.etf.rpr.t1.z3;

public class Sat {
     int sati, minute, sekunde;


    public Sat(int i, int i1, int i2) {
        Postavi(i,i1,i2);
    }

    public void Postavi(int i, int i1, int i2) {
        sati = i;
        minute = i1;
        sekunde = i2;
    }


    public void Sljedeci() {
        sekunde++;
        if(sekunde == 60)  {
            sekunde  = 0;
            minute++;
        }
        if(minute == 60) {
            minute = 0;
            sati++;
        }
        if(sati == 24) sati = 0;
    }

    public void PomjeriZa(int i) {
        if(i > 0) for(int j=0; j<i; j++) Sljedeci();
        else for(int j=0; j<Math.abs(i); j++) Prethodni();
    }


    public void Prethodni() {
        sekunde--;
        if(sekunde == -1) {
           sekunde = 59;
            minute--;
        }
        if(minute == -1) {
            minute = 59;
            sati--;
        }
        if(sati == -1)  {
            sati = 23;
        }
    }

    public void Ispisi() {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }


}
