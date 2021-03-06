/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.edu.gymspmkr.geomutvary;

/**
 *
 * @author bracek
 */
public class ObdlznikPlus implements Porovnatelna {

    public int sirka = 0;
    public int vyska = 0;
    public Bod zacBod;

    // štyri konštruktory
    public ObdlznikPlus() {
        zacBod = new Bod(0, 0);
    }

    public ObdlznikPlus(final Bod p) {
        zacBod = p;
    }

    public ObdlznikPlus(final int w,
final  int h) {
        zacBod = new Bod(0, 0);
        sirka = w;
        vyska = h;
    }

    public ObdlznikPlus(final Bod p,
final  int w,
final  int h) {
        zacBod = p;
        sirka = w;
        vyska = h;
    }

    // metóda presúvajúca obdĺžnik
    public void presun(final int x,
final  int y) {
        zacBod.x = x;
        zacBod.y = y;
    }

    // metóda počítajúca obsah obdĺžnika
    public int vratObsah() {
        return sirka * vyska;
    }
    // metóda implementujúca metódu rozhrania Porovnatelna
    public int jeVacsiNez(final Porovnatelna druhy) {
//        ObdlznikPlus druhyObdlznik = (ObdlznikPlus) druhy;
        ObdlznikPlus druhyObdlznik = (ObdlznikPlus) druhy;
        if (this.vratObsah() < druhyObdlznik.vratObsah()) {
            return -1;
        } else if (this.vratObsah() > druhyObdlznik.vratObsah()) {
            return 1;
        } else {
            return 0;
        }
    }

    public Object NajdiVacsi(final Object objekt1,
final  Object objekt2) {
        Porovnatelna obj1 = (Porovnatelna) objekt1;
        Porovnatelna obj2 = (Porovnatelna) objekt2;
        if ((obj1).jeVacsiNez(obj2) > 0) {
            return objekt1;
        } else {
            return objekt2;
        }
    }

    public Object najdiMensi(final Object objekt1,
final  Object objekt2) {
        Porovnatelna obj1 = (Porovnatelna) objekt1;
        Porovnatelna obj2 = (Porovnatelna) objekt2;
        if ((obj1).jeVacsiNez(obj2) < 0) {
            return objekt1;
        } else {
            return objekt2;
        }
    }

    public boolean suZhodne(final Object objekt1,
final  Object objekt2) {
        Porovnatelna obj1 = (Porovnatelna) objekt1;
        Porovnatelna obj2 = (Porovnatelna) objekt2;
        if ((obj1).jeVacsiNez(obj2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

